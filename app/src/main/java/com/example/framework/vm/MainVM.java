package com.example.framework.vm;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.framework.base.BaseVM;
import com.example.framework.model.ArticleBean;
import com.example.framework.model.BannerBean;
import com.example.framework.network.BaseObserver;
import com.example.framework.network.NetworkApi;
import com.example.framework.network.api.ApiService;
import com.example.framework.repository.MainRepository;

/**
 * @Author: JianTours
 * @Data: 2021/12/29 22:34
 * @Description: 首页VM
 */
public class MainVM extends BaseVM {

    public MainVM(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<BannerBean> getBannerHome() {
        MutableLiveData<BannerBean> mutableLiveData;
        mutableLiveData = new MainRepository().getBanner();
        return mutableLiveData;
    }

    @SuppressLint("CheckResult")
    public MutableLiveData<ArticleBean> getMainArticle() {
        MutableLiveData<ArticleBean> mutableLiveData = new MutableLiveData<>();
        ApiService apiService = NetworkApi.createService(ApiService.class);
        apiService.getMainArticle().compose(NetworkApi.applySchedulers(new BaseObserver<ArticleBean>() {
            @Override
            public void onSucceed(ArticleBean articleBean) {
                mutableLiveData.setValue(articleBean);
            }

            @Override
            public void onFailure(Throwable e) {

            }
        }));
        return mutableLiveData;
    }
}
