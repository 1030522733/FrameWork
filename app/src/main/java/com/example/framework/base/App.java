package com.example.framework.base;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.example.framework.network.FrameWorkNetworkInfo;
import com.example.framework.network.NetworkApi;

/**
 * @Author: JianTours
 * @Data: 2021/12/19 21:48
 * @Description:配置全局Application
 */
public class App extends Application {
    @SuppressLint("StaticFieldLeak")
    private static App app;

    public static Context getContext(){return app;}

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        NetworkApi.init(new FrameWorkNetworkInfo(this));
        app = this;
    }
}
