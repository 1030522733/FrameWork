package com.example.framework.network;

import java.util.HashMap;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * @Author: JianTours
 * @Data: 2021/12/20 21:58
 * @Description:网络api
 */
public class NetworkApi {
    /**
     * 获取APP运行状态及版本信息，用于日志打印
     */
    private static INetworkRequiredInfo iNetworkRequiredInfo;
    /**
     * API访问地址
     */
    private static final String BASE_URL = "https://cn.bing.com";

    private static OkHttpClient okHttpClient;

    private static final HashMap<String, Retrofit> retrofitHashMap = new HashMap<>();

    /**
     * 初始化
     */
    public static void init(INetworkRequiredInfo networkRequiredInfo) {
        iNetworkRequiredInfo = networkRequiredInfo;
    }
}
