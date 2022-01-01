package com.example.framework.vm;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.framework.base.BaseVM;
import com.example.framework.model.RankingBean;
import com.example.framework.network.BaseObserver;
import com.example.framework.network.NetworkApi;
import com.example.framework.network.api.ApiService;

/**
 * @Author: JianTours
 * @Data: 2021/12/31 20:54
 * @Description:
 */
public class RankingVM extends BaseVM {
    public RankingVM(@NonNull Application application) {
        super(application);
    }

    /**
     *获取排行
     */
    @SuppressLint("CheckResult")
    public MutableLiveData<RankingBean> getRanking(){
        MutableLiveData<RankingBean> mutableLiveData = new MutableLiveData<>();
        ApiService apiService = NetworkApi.createService(ApiService.class);
        apiService.getRanking().compose(NetworkApi.applySchedulers(new BaseObserver<RankingBean>() {
            @Override
            public void onSucceed(RankingBean rankingBean) {
                mutableLiveData.setValue(rankingBean);
            }

            @Override
            public void onFailure(Throwable e) {

            }
        }));
        return mutableLiveData;
    }
}
