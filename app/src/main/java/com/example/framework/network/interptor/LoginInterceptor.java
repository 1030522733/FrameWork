package com.example.framework.network.interptor;

import android.text.TextUtils;

import com.blankj.utilcode.util.LogUtils;
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
 * @Data: 2022/1/5 21:14
 * @Description: 登录专用拦截器
 */
public class LoginInterceptor implements Interceptor {
    private static final String TAG = "LoginInterceptor";

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        long requestTime = System.currentTimeMillis();
        Request request = chain.request();
        Response response = chain.proceed(request);
        //set-cookie可能为多个
        if (!response.headers("Set-Cookie").isEmpty()) {
            List<String> cookies = response.headers("Set-Cookie");
            //只用登录时cookie才会大于1
            if (cookies.size() > 1) {
                String cookie = encodeCookie(cookies);
                saveCookie(request.url().toString(), request.url().host(), cookie);
            }
        }
        LogUtils.d(TAG, "requestSpendTime=" + (System.currentTimeMillis() - requestTime) + "ms");
        return response;
    }

    /**
     * 整合cookie为唯一字符串
     */
    private String encodeCookie(List<String> cookies) {
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        for (String cookie : cookies) {
            String[] arr = cookie.split(";");
            for (String s : arr) {
                if (set.contains(s)) {
                    continue;
                }
                set.add(s);
            }
        }
        for (String cookie : set) {
            sb.append(cookie).append(";");
        }
        int last = sb.lastIndexOf(";");
        if (sb.length() - 1 == last) {
            sb.deleteCharAt(last);
        }
        return sb.toString();
    }

    /**
     * 保存cookie到本地，这里我们分别为该url和host设置相同的cookie，其中host可选
     * 这样能使得该cookie的应用范围更广
     */
    private void saveCookie(String url, String domain, String cookies) {
        if (TextUtils.isEmpty(url)) {
            throw new NullPointerException("url is null.");
        } else {
            MVUtils.put(url, cookies);
        }
        if (!TextUtils.isEmpty(domain)) {
            MVUtils.put(domain, cookies);
        }
    }

    /**
     * 清除本地Cookie
     */
    public static void clearCookie() {
        MVUtils.clearAll();
    }
}
