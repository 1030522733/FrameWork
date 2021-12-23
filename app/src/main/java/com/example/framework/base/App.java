package com.example.framework.base;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.db.AppDatabase;
import com.example.framework.network.FrameWorkNetworkInfo;
import com.example.framework.network.NetworkApi;
import com.example.framework.utils.MVUtils;
import com.tencent.mmkv.MMKV;

/**
 * @Author: JianTours
 * @Data: 2021/12/19 21:48
 * @Description:配置全局Application
 */
public class App extends Application {

    @SuppressLint("StaticFieldLeak")
    private static App app;

    /**
     * 数据库
     */
    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        //网络初始化
        NetworkApi.init(new FrameWorkNetworkInfo(this));
        //MMKV初始化
        MMKV.initialize(this);
        //工具类初始化
        MVUtils.getInstance();
        //创建本地数据库
        db = AppDatabase.getInstance(this);
    }

    public static AppDatabase getDb() {
        return db;
    }

    public static Context getContext() {
        return app;
    }
}
