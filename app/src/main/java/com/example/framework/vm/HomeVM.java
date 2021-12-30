package com.example.framework.vm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.framework.base.BaseVM;
import com.example.framework.model.BannerBean;
import com.example.framework.repository.MainRepository;

/**
 * @Author: JianTours
 * @Data: 2021/12/29 22:34
 * @Description: 首页VM
 */
public class HomeVM extends BaseVM {

    public HomeVM(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<BannerBean> getBannerHome(){
        MutableLiveData<BannerBean> mutableLiveData;
        mutableLiveData = new MainRepository().getBanner();
        return mutableLiveData;
    }
}
