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
    public StartVM(@NonNull Application application) {
        super(application);
    }
}
