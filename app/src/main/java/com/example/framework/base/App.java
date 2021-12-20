package com.example.framework.base;

import android.app.Application;
import android.content.Context;

/**
 * @Author: JianTours
 * @Data: 2021/12/19 21:48
 * @Description:配置全局Application
 */
public class App extends Application {
    private static App app;

    public static Context getContext(){return app;}

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
