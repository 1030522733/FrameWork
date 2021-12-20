package com.example.framework.network.interptor;

import com.example.framework.network.INetworkRequiredInfo;

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
     *网络请求信息
     */
    private INetworkRequiredInfo iNetworkRequiredInfo;

    public RequestInterceptor(INetworkRequiredInfo iNetworkRequiredInfo){
        this.iNetworkRequiredInfo = iNetworkRequiredInfo;
    }
    @Override
    public Response intercept(Chain chain) throws IOException {
        //构建器
        Request.Builder builder = chain.request().newBuilder();
        //添加版本号
        builder.addHeader("appVersionCode",this.iNetworkRequiredInfo.getAppVersionCode());
        //添加版本名
        builder.addHeader("appVersionName",this.iNetworkRequiredInfo.getAppVersionName());
        return chain.proceed(builder.build());
    }
}
