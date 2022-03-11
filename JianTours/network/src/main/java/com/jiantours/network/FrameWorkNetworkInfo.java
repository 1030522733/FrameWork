package com.jiantours.network;

import android.app.Application;


/**
 * @Author: JianTours
 * @Data: 2021/12/21 20:10
 * @Description:网络访问信息
 */
public class FrameWorkNetworkInfo implements INetworkRequiredInfo{

    private final Application application;

    public FrameWorkNetworkInfo(Application application){
        this.application = application;
    }

    @Override
    public String getAppVersionName() {
        return BuildConfig.LIBRARY_PACKAGE_NAME;
    }

    @Override
    public String getAppVersionCode() {
        return BuildConfig.BUILD_TYPE;
    }

    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    @Override
    public Application getApplicationContext() {
        return application;
    }
}
