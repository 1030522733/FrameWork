package com.example.framework.network.interptor;


import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.utils.Constant;
import com.example.framework.utils.MVUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @Author: JianTours
 * @Data: 2021/12/20 21:44
 * @Description:返回拦截器
 */
public class ResponseInterceptor implements Interceptor {

    private static final String TAG = "ResponseInterceptor";

    @Override
    public Response intercept(Chain chain) throws IOException {
        long requestTime = System.currentTimeMillis();
        Request request = chain.request();
        Response response = chain.proceed(request);
        LogUtils.d(TAG, "requestSpendTime=" + (System.currentTimeMillis() - requestTime) + "ms");
        return response;
    }
}
