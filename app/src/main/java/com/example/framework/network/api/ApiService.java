package com.example.framework.network.api;

import com.example.framework.model.BannerBean;
import com.example.framework.model.RankingBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @Author: JianTours
 * @Data: 2021/12/21 19:57
 * @Description:所有网络接口
 */
public interface ApiService {
    /**
     *每日一图
     */
    @GET("/banner/json")
    Observable<BannerBean> getBanner();

    /**
     * 积分排行
     */
    @GET("coin/rank/1/json")
    Observable<RankingBean> getRanking();
}
