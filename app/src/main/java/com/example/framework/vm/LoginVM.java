package com.example.framework.vm;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.framework.base.BaseVM;
import com.example.framework.model.LoginBean;
import com.example.framework.network.BaseObserver;
import com.example.framework.network.NetworkApi;
import com.example.framework.network.api.ApiService;

/**
 * @Author: JianTours
 * @Data: 2022/1/2 13:22
 * @Description:
 */
public class LoginVM extends BaseVM {
    public LoginVM(@NonNull Application application) {
        super(application);
    }

    @SuppressLint("CheckResult")
    public MutableLiveData<LoginBean> Login(String username, String password) {
        MutableLiveData<LoginBean> mutableLiveData = new MutableLiveData<>();
        ApiService apiService = NetworkApi.createService(ApiService.class);
        apiService.Login(username, password).compose(NetworkApi.applySchedulers(new BaseObserver<LoginBean>() {
            @Override
            public void onSucceed(LoginBean loginBean) {
                mutableLiveData.setValue(loginBean);
            }

            @Override
            public void onFailure(Throwable e) {
            }
        }));
        return mutableLiveData;
    }
}
