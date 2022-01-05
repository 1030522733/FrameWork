package com.example.framework.network.interptor;

import android.text.TextUtils;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.network.INetworkRequiredInfo;
import com.example.framework.utils.MVUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @Author: JianTours
 * @Data: 2021/12/20 21:36
 * @Description:拦截器
 */
public class RequestInterceptor implements Interceptor {
    /**
     * 网络请求信息
     */
    private INetworkRequiredInfo iNetworkRequiredInfo;

    public RequestInterceptor(INetworkRequiredInfo iNetworkRequiredInfo) {
        this.iNetworkRequiredInfo = iNetworkRequiredInfo;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        //构建器
        Request.Builder builder = chain.request().newBuilder();
        //添加版本号
        builder.addHeader("appVersionCode", this.iNetworkRequiredInfo.getAppVersionCode());
        //添加版本名
        builder.addHeader("appVersionName", this.iNetworkRequiredInfo.getAppVersionName());
        //Cookie
        String cookie = getCookie(request.url().toString(), request.url().host());
        if (!TextUtils.isEmpty(cookie)) {
            builder.addHeader("Cookie", cookie);
        }
        return chain.proceed(builder.build());
    }

    private String getCookie(String url, String domain) {
        if (!TextUtils.isEmpty(url) && !TextUtils.isEmpty(MVUtils.getString(url, ""))) {
            LogUtils.d(MVUtils.getString(url,"ffffff"));
            return MVUtils.getString(url, "");
        }
        if (!TextUtils.isEmpty(domain) && !TextUtils.isEmpty(MVUtils.getString(domain, ""))) {
            return MVUtils.getString(domain, "");
        }
        return null;
    }
}
