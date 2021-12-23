package com.example.framework.repository;

import android.annotation.SuppressLint;
import android.provider.SyncStateContract;

import androidx.lifecycle.MutableLiveData;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.base.App;
import com.example.framework.db.bean.Image;
import com.example.framework.model.BannerBean;
import com.example.framework.network.BaseObserver;
import com.example.framework.network.NetworkApi;
import com.example.framework.network.api.ApiService;
import com.example.framework.utils.Constant;
import com.example.framework.utils.DateUtil;
import com.example.framework.utils.MVUtils;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * @Author: JianTours
 * @Data: 2021/12/21 20:02
 * @Description:Main存储库
 */
public class MainRepository {

    final MutableLiveData<BannerBean> bannerImage = new MutableLiveData<>();
    /**
     *保存数据
     */
    private void saveImageData(BannerBean bannerBean){
        //记录今日请求
        MVUtils.put(Constant.IS_TODAY_REQUEST,true);
        //记录时间戳
        MVUtils.put(Constant.REQUEST_TIMESTAMP, DateUtil.getMillisNextEarlyMorning());
        BannerBean.DataBean bean = bannerBean.getData().get(0);
        //保存到数据库
        //线程方式
//        new Thread(()-> App.getDb().imageDao().insertAll(
//                new Image(1,bean.getImagePath(),bean.getTitle(),bean.getUrl()))).start();
        Completable insert = App.getDb().imageDao().insertAll(new Image(
                1,bean.getImagePath(),bean.getTitle(),bean.getUrl()));
        //使用Rxjava处理数据库
        CustomDisposable.addDisposable(insert,()->LogUtils.d("插入数据成功"));
    }

    /**
     * 从网络获取数据
     */
    @SuppressLint("CheckResult")
    public void getNetWork() {
        LogUtils.d("从网络获取");
        ApiService apiService = NetworkApi.createService(ApiService.class);
        apiService.getBanner().compose(NetworkApi.applySchedulers(new BaseObserver<BannerBean>() {
            @Override
            public void onSucceed(BannerBean bannerBean) {
                saveImageData(bannerBean);
                bannerImage.setValue(bannerBean);
            }

            @Override
            public void onFailure(Throwable e) {
                LogUtils.d("Error：" + e.toString());
            }
        }));
    }

    /**
     *从本地数据库获取
     */
    private void getLocalDB(){
        LogUtils.d("从本地获取");
        BannerBean bannerBean = new BannerBean();
//        new Thread(()->{
//            Image image = App.getDb().imageDao().queryBannerId(1);
//            BannerBean.DataBean bean = new BannerBean.DataBean();
//            bean.setImagePath(image.getImagePath());
//            bean.setTitle(image.getTitle());
//            bean.setUrl(image.getUrl());
//            List<BannerBean.DataBean> dataBeanList = new ArrayList<>();
//            dataBeanList.add(bean);
//            bannerBean.setData(dataBeanList);
//            bannerImage.postValue(bannerBean);
//        }).start();
        Flowable<Image> imageFlowable = App.getDb().imageDao().queryBannerId(1);
        //使用Rxjava处理Room数据
        CustomDisposable.addDisposable(imageFlowable,image -> {
            BannerBean.DataBean bean = new BannerBean.DataBean();
            bean.setImagePath(image.getImagePath());
            bean.setTitle(image.getTitle());
            bean.setUrl(image.getUrl());
            List<BannerBean.DataBean> dataBeanList = new ArrayList<>();
            dataBeanList.add(bean);
            bannerBean.setData(dataBeanList);
            bannerImage.postValue(bannerBean);
        });
    }

    public MutableLiveData<BannerBean> getBanner() {
        //今日此接口是否已请求
        if (MVUtils.getBoolean(Constant.IS_TODAY_REQUEST)) {
            if(DateUtil.getTimestamp() <= MVUtils.getLong(Constant.REQUEST_TIMESTAMP)){
                //当前时间未超过次日0点，从本地获取
                getLocalDB();
            } else {
                //大于则数据需要更新，从网络获取
                getNetWork();
            }
        } else {
            //没有请求过接口 或 当前时间，从网络获取
            getNetWork();
        }
        return bannerImage;
    }


}
