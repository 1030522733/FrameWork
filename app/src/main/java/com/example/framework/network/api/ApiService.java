package com.example.framework.network.api;

import com.example.framework.model.ArticleBean;
import com.example.framework.model.BannerBean;
import com.example.framework.model.IntegralBean;
import com.example.framework.model.LoginBean;
import com.example.framework.model.RankingBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

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

    /**
     *登录
     */
    @POST("user/login")
    Observable<LoginBean> Login(@Query("username") String username,
                                @Query("password") String password);

    /**
     *获取个人积分
     */
    @GET("lg/coin/userinfo/json")
    Observable<IntegralBean> getIntegral();

    /**
     * 首页文章
     */
    @GET("article/list/{page}/json")
    Observable<ArticleBean> getMainArticle(@Path("page") int page);
}
