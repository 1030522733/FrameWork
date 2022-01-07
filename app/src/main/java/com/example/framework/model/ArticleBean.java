package com.example.framework.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2022/1/7 23:39
 * @Description:
 */
public class ArticleBean implements Serializable {

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21092,"link":"https://mp.weixin.qq.com/s/3M0kymZ-qNh5iqqO5r7GDw","niceDate":"2022-01-04 00:00","niceShareDate":"2022-01-04 22:29","origin":"","prefix":"","projectLink":"","publishTime":1641225600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1641306555000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"从SplashScreen深度探讨App启动画面的前世今生","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21080,"link":"https://blog.csdn.net/willway_wang/article/details/121549720?spm=1001.2014.3001.5502","niceDate":"2022-01-03 17:09","niceShareDate":"2022-01-03 17:09","origin":"","prefix":"","projectLink":"","publishTime":1641200995000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1641200995000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"《Android开发艺术探索》第9章-四大组件的工作过程读书笔记","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21019,"link":"https://blog.csdn.net/willway_wang/article/details/122136991?spm=1001.2014.3001.5501","niceDate":"2022-01-01 15:05","niceShareDate":"2022-01-01 15:05","origin":"","prefix":"","projectLink":"","publishTime":1641020749000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1641020749000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android筑基&mdash;&mdash;ContentProvider 的跨进程启动过程和数据操作方法调用过程（基于api21）","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21015,"link":"https://juejin.cn/post/7047790727987724302","niceDate":"2021-12-31 18:51","niceShareDate":"2021-12-31 18:51","origin":"","prefix":"","projectLink":"","publishTime":1640947917000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640947917000,"shareUser":"sweetying","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【年度回顾】为过去的几年喝彩","type":0,"userId":5405,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21014,"link":"https://juejin.cn/post/7047317429793325063","niceDate":"2021-12-31 10:23","niceShareDate":"2021-12-31 10:23","origin":"","prefix":"","projectLink":"","publishTime":1640917438000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640917438000,"shareUser":"DylanCai","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"2021 年终总结，GitHub 1k stars 的目标终于达成！！","type":0,"userId":27680,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21013,"link":"https://juejin.cn/post/7043843490366619685","niceDate":"2021-12-31 10:22","niceShareDate":"2021-12-31 10:22","origin":"","prefix":"","projectLink":"","publishTime":1640917376000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640917376000,"shareUser":"DylanCai","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin 委托的本质以及 MMKV 的应用","type":0,"userId":27680,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21012,"link":"https://juejin.cn/post/7047065452094160904","niceDate":"2021-12-31 10:00","niceShareDate":"2021-12-31 10:00","origin":"","prefix":"","projectLink":"","publishTime":1640916008000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640916008000,"shareUser":"Tear丶残阳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【Android模块化】Discovery1.4.1发布，轻松实现不需要相互依赖的多模块按顺序初始化。","type":0,"userId":28162,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21011,"link":"https://www.jianshu.com/p/31cabd5540ec","niceDate":"2021-12-31 09:07","niceShareDate":"2021-12-31 09:07","origin":"","prefix":"","projectLink":"","publishTime":1640912863000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640912863000,"shareUser":"hp1451193026","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"功能实现-Activity运行后台不在更近任务栏显示","type":0,"userId":2058,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21009,"link":"https://juejin.cn/post/7047377813199912968","niceDate":"2021-12-31 00:34","niceShareDate":"2021-12-31 00:33","origin":"","prefix":"","projectLink":"","publishTime":1640882087000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1640882007000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"进阶应用启动分析，这一篇就够了！","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21010,"link":"https://www.jianshu.com/p/51d40f216339?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2021-12-31 00:34","niceShareDate":"2021-12-31 00:34","origin":"","prefix":"","projectLink":"","publishTime":1640882077000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1640882059000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"听说你还不懂依赖任务启动框架？带你撸一个","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21084,"link":"https://mp.weixin.qq.com/s/XAM9WscBvFqZJkvERZc2dw","niceDate":"2021-12-31 00:00","niceShareDate":"2022-01-03 22:40","origin":"","prefix":"","projectLink":"","publishTime":1640880000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1641220840000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 12 已来，你的 App 崩溃了吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21002,"link":"https://www.jianshu.com/p/018977bd7687","niceDate":"2021-12-30 09:11","niceShareDate":"2021-12-30 09:11","origin":"","prefix":"","projectLink":"","publishTime":1640826667000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640826667000,"shareUser":"hp1451193026","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"功能实现-屏幕录制","type":0,"userId":2058,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21001,"link":"https://juejin.cn/post/7047166823380287518","niceDate":"2021-12-30 08:58","niceShareDate":"2021-12-30 08:58","origin":"","prefix":"","projectLink":"","publishTime":1640825893000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640825893000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android中的线程池","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21006,"link":"https://mp.weixin.qq.com/s/ku-Il9UDtT_HcZ1GORL49Q","niceDate":"2021-12-30 00:00","niceShareDate":"2021-12-30 21:22","origin":"","prefix":"","projectLink":"","publishTime":1640793600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1640870550000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"玩转自定义View，人脸识别动画效果如此简单","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21007,"link":"https://mp.weixin.qq.com/s/asORB4RVBfpCUkmM_1sopw","niceDate":"2021-12-30 00:00","niceShareDate":"2021-12-30 21:22","origin":"","prefix":"","projectLink":"","publishTime":1640793600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1640870562000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Jetpack新组件？小部件的春天来了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20996,"link":"https://juejin.cn/post/7046915394052816910/","niceDate":"2021-12-29 12:08","niceShareDate":"2021-12-29 12:08","origin":"","prefix":"","projectLink":"","publishTime":1640750884000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640750884000,"shareUser":"Jere_Chen","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"转行程序员 我做到了","type":0,"userId":47014,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":510,"chapterName":"大厂分享","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20985,"link":"https://juejin.cn/post/7045596443905638436","niceDate":"2021-12-29 00:15","niceShareDate":"2021-12-29 00:05","origin":"","prefix":"","projectLink":"","publishTime":1640708143000,"realSuperChapterId":509,"selfVisible":0,"shareDate":1640707512000,"shareUser":"鸿洋","superChapterId":510,"superChapterName":"大厂对外分享","tags":[],"title":"快看Android页面开发框架的更佳实践","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":424,"chapterName":"协程","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20986,"link":"https://juejin.cn/post/7046620641755136037","niceDate":"2021-12-29 00:15","niceShareDate":"2021-12-29 00:09","origin":"","prefix":"","projectLink":"","publishTime":1640708124000,"realSuperChapterId":231,"selfVisible":0,"shareDate":1640707763000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin lambda，有你想了解的一切","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":296,"chapterName":"阅读","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20987,"link":"https://juejin.cn/post/7046520068561174536","niceDate":"2021-12-29 00:15","niceShareDate":"2021-12-29 00:09","origin":"","prefix":"","projectLink":"","publishTime":1640708115000,"realSuperChapterId":180,"selfVisible":0,"shareDate":1640707777000,"shareUser":"鸿洋","superChapterId":202,"superChapterName":"延伸技术","tags":[],"title":"我的2021 年终总结","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":168,"chapterName":"Drawable","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20988,"link":"https://juejin.cn/post/7046351071559548964","niceDate":"2021-12-29 00:14","niceShareDate":"2021-12-29 00:09","origin":"","prefix":"","projectLink":"","publishTime":1640708075000,"realSuperChapterId":167,"selfVisible":0,"shareDate":1640707795000,"shareUser":"鸿洋","superChapterId":168,"superChapterName":"基础知识","tags":[],"title":"WMS-窗口相关知识的总结","type":0,"userId":2,"visible":1,"zan":0}],"offset":20,"over":false,"pageCount":585,"size":20,"total":11683}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean implements Serializable {
        /**
         * curPage : 2
         * datas : [{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21092,"link":"https://mp.weixin.qq.com/s/3M0kymZ-qNh5iqqO5r7GDw","niceDate":"2022-01-04 00:00","niceShareDate":"2022-01-04 22:29","origin":"","prefix":"","projectLink":"","publishTime":1641225600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1641306555000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"从SplashScreen深度探讨App启动画面的前世今生","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21080,"link":"https://blog.csdn.net/willway_wang/article/details/121549720?spm=1001.2014.3001.5502","niceDate":"2022-01-03 17:09","niceShareDate":"2022-01-03 17:09","origin":"","prefix":"","projectLink":"","publishTime":1641200995000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1641200995000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"《Android开发艺术探索》第9章-四大组件的工作过程读书笔记","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21019,"link":"https://blog.csdn.net/willway_wang/article/details/122136991?spm=1001.2014.3001.5501","niceDate":"2022-01-01 15:05","niceShareDate":"2022-01-01 15:05","origin":"","prefix":"","projectLink":"","publishTime":1641020749000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1641020749000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android筑基&mdash;&mdash;ContentProvider 的跨进程启动过程和数据操作方法调用过程（基于api21）","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21015,"link":"https://juejin.cn/post/7047790727987724302","niceDate":"2021-12-31 18:51","niceShareDate":"2021-12-31 18:51","origin":"","prefix":"","projectLink":"","publishTime":1640947917000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640947917000,"shareUser":"sweetying","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【年度回顾】为过去的几年喝彩","type":0,"userId":5405,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21014,"link":"https://juejin.cn/post/7047317429793325063","niceDate":"2021-12-31 10:23","niceShareDate":"2021-12-31 10:23","origin":"","prefix":"","projectLink":"","publishTime":1640917438000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640917438000,"shareUser":"DylanCai","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"2021 年终总结，GitHub 1k stars 的目标终于达成！！","type":0,"userId":27680,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21013,"link":"https://juejin.cn/post/7043843490366619685","niceDate":"2021-12-31 10:22","niceShareDate":"2021-12-31 10:22","origin":"","prefix":"","projectLink":"","publishTime":1640917376000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640917376000,"shareUser":"DylanCai","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin 委托的本质以及 MMKV 的应用","type":0,"userId":27680,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21012,"link":"https://juejin.cn/post/7047065452094160904","niceDate":"2021-12-31 10:00","niceShareDate":"2021-12-31 10:00","origin":"","prefix":"","projectLink":"","publishTime":1640916008000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640916008000,"shareUser":"Tear丶残阳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【Android模块化】Discovery1.4.1发布，轻松实现不需要相互依赖的多模块按顺序初始化。","type":0,"userId":28162,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21011,"link":"https://www.jianshu.com/p/31cabd5540ec","niceDate":"2021-12-31 09:07","niceShareDate":"2021-12-31 09:07","origin":"","prefix":"","projectLink":"","publishTime":1640912863000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640912863000,"shareUser":"hp1451193026","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"功能实现-Activity运行后台不在更近任务栏显示","type":0,"userId":2058,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21009,"link":"https://juejin.cn/post/7047377813199912968","niceDate":"2021-12-31 00:34","niceShareDate":"2021-12-31 00:33","origin":"","prefix":"","projectLink":"","publishTime":1640882087000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1640882007000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"进阶应用启动分析，这一篇就够了！","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21010,"link":"https://www.jianshu.com/p/51d40f216339?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2021-12-31 00:34","niceShareDate":"2021-12-31 00:34","origin":"","prefix":"","projectLink":"","publishTime":1640882077000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1640882059000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"听说你还不懂依赖任务启动框架？带你撸一个","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21084,"link":"https://mp.weixin.qq.com/s/XAM9WscBvFqZJkvERZc2dw","niceDate":"2021-12-31 00:00","niceShareDate":"2022-01-03 22:40","origin":"","prefix":"","projectLink":"","publishTime":1640880000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1641220840000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 12 已来，你的 App 崩溃了吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21002,"link":"https://www.jianshu.com/p/018977bd7687","niceDate":"2021-12-30 09:11","niceShareDate":"2021-12-30 09:11","origin":"","prefix":"","projectLink":"","publishTime":1640826667000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640826667000,"shareUser":"hp1451193026","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"功能实现-屏幕录制","type":0,"userId":2058,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21001,"link":"https://juejin.cn/post/7047166823380287518","niceDate":"2021-12-30 08:58","niceShareDate":"2021-12-30 08:58","origin":"","prefix":"","projectLink":"","publishTime":1640825893000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640825893000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android中的线程池","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21006,"link":"https://mp.weixin.qq.com/s/ku-Il9UDtT_HcZ1GORL49Q","niceDate":"2021-12-30 00:00","niceShareDate":"2021-12-30 21:22","origin":"","prefix":"","projectLink":"","publishTime":1640793600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1640870550000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"玩转自定义View，人脸识别动画效果如此简单","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21007,"link":"https://mp.weixin.qq.com/s/asORB4RVBfpCUkmM_1sopw","niceDate":"2021-12-30 00:00","niceShareDate":"2021-12-30 21:22","origin":"","prefix":"","projectLink":"","publishTime":1640793600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1640870562000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Jetpack新组件？小部件的春天来了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20996,"link":"https://juejin.cn/post/7046915394052816910/","niceDate":"2021-12-29 12:08","niceShareDate":"2021-12-29 12:08","origin":"","prefix":"","projectLink":"","publishTime":1640750884000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1640750884000,"shareUser":"Jere_Chen","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"转行程序员 我做到了","type":0,"userId":47014,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":510,"chapterName":"大厂分享","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20985,"link":"https://juejin.cn/post/7045596443905638436","niceDate":"2021-12-29 00:15","niceShareDate":"2021-12-29 00:05","origin":"","prefix":"","projectLink":"","publishTime":1640708143000,"realSuperChapterId":509,"selfVisible":0,"shareDate":1640707512000,"shareUser":"鸿洋","superChapterId":510,"superChapterName":"大厂对外分享","tags":[],"title":"快看Android页面开发框架的更佳实践","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":424,"chapterName":"协程","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20986,"link":"https://juejin.cn/post/7046620641755136037","niceDate":"2021-12-29 00:15","niceShareDate":"2021-12-29 00:09","origin":"","prefix":"","projectLink":"","publishTime":1640708124000,"realSuperChapterId":231,"selfVisible":0,"shareDate":1640707763000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin lambda，有你想了解的一切","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":296,"chapterName":"阅读","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20987,"link":"https://juejin.cn/post/7046520068561174536","niceDate":"2021-12-29 00:15","niceShareDate":"2021-12-29 00:09","origin":"","prefix":"","projectLink":"","publishTime":1640708115000,"realSuperChapterId":180,"selfVisible":0,"shareDate":1640707777000,"shareUser":"鸿洋","superChapterId":202,"superChapterName":"延伸技术","tags":[],"title":"我的2021 年终总结","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":168,"chapterName":"Drawable","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":20988,"link":"https://juejin.cn/post/7046351071559548964","niceDate":"2021-12-29 00:14","niceShareDate":"2021-12-29 00:09","origin":"","prefix":"","projectLink":"","publishTime":1640708075000,"realSuperChapterId":167,"selfVisible":0,"shareDate":1640707795000,"shareUser":"鸿洋","superChapterId":168,"superChapterName":"基础知识","tags":[],"title":"WMS-窗口相关知识的总结","type":0,"userId":2,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 585
         * size : 20
         * total : 11683
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean implements Serializable {
            /**
             * apkLink :
             * audit : 1
             * author : 郭霖
             * canEdit : false
             * chapterId : 409
             * chapterName : 郭霖
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * host :
             * id : 21092
             * link : https://mp.weixin.qq.com/s/3M0kymZ-qNh5iqqO5r7GDw
             * niceDate : 2022-01-04 00:00
             * niceShareDate : 2022-01-04 22:29
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1641225600000
             * realSuperChapterId : 407
             * selfVisible : 0
             * shareDate : 1641306555000
             * shareUser :
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/409/1"}]
             * title : 从SplashScreen深度探讨App启动画面的前世今生
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private String host;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean implements Serializable {
                /**
                 * name : 公众号
                 * url : /wxarticle/list/409/1
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
