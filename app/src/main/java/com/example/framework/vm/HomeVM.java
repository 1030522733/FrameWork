package com.example.framework.vm;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.base.BaseVM;
import com.example.framework.model.IntegralBean;
import com.example.framework.network.BaseObserver;
import com.example.framework.network.NetworkApi;
import com.example.framework.network.api.ApiService;

/**
 * @Author: JianTours
 * @Data: 2022/1/3 20:27
 * @Description:
 */
public class HomeVM extends BaseVM {
    public HomeVM(@NonNull Application application) {
        super(application);
    }

    @SuppressLint("CheckResult")
    public MutableLiveData<IntegralBean> getIntegral(){
        MutableLiveData<IntegralBean> mutableLiveData = new MutableLiveData<>();
        ApiService apiService = NetworkApi.createService(ApiService.class);
        apiService.getIntegral().compose(NetworkApi.applySchedulers(new BaseObserver<IntegralBean>() {
            @Override
            public void onSucceed(IntegralBean integralBean) {
                mutableLiveData.setValue(integralBean);
                LogUtils.d("成功");
            }

            @Override
            public void onFailure(Throwable e) {
                LogUtils.d(e);
            }
        }));
        return mutableLiveData;
    }
}
