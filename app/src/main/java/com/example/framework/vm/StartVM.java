package com.example.framework.vm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.framework.base.BaseVM;
import com.example.framework.model.BannerBean;
import com.example.framework.repository.MainRepository;

/**
 * @Author: JianTours
 * @Data: 2021/12/19 20:58
 * @Description: 启动页VM
 */
public class StartVM extends BaseVM {

    //mutableLiveData数据只给前台调用
    public MutableLiveData<BannerBean> mutableLiveData;

    public StartVM(@NonNull Application application) {
        super(application);
    }

    public void getBanner() {
        mutableLiveData = new MainRepository().getBanner();
    }
}
