package com.example.framework.vm;

import android.annotation.SuppressLint;

import androidx.lifecycle.MutableLiveData;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.model.BannerBean;
import com.example.framework.network.BaseObserver;
import com.example.framework.network.NetworkApi;
import com.example.framework.network.api.ApiService;

/**
 * @Author: JianTours
 * @Data: 2021/12/21 20:02
 * @Description:Main存储库
 */
public class MainRepository {

    /**
     * 必应每日一图
     */
    @SuppressLint("CheckResult")
    public MutableLiveData<BannerBean> getBanner() {
        final MutableLiveData<BannerBean> mutableLiveData = new MutableLiveData<>();
        ApiService apiService = NetworkApi.createService(ApiService.class);
        apiService.getBanner().compose(NetworkApi.applySchedulers(new BaseObserver<BannerBean>() {
            @Override
            public void onSucceed(BannerBean bannerBean) {
                LogUtils.d("必应图片加载成功");
                mutableLiveData.setValue(bannerBean);
                LogUtils.d(mutableLiveData.getValue().getData().get(0).getImagePath());
            }

            @Override
            public void onFailure(Throwable e) {
                LogUtils.d("Error：" + e.toString());
            }
        }));
        return mutableLiveData;
    }
}
