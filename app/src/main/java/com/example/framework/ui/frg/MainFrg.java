package com.example.framework.ui.frg;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.blankj.utilcode.util.LogUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.framework.R;
import com.example.framework.base.App;
import com.example.framework.base.BaseFrg;
import com.example.framework.databinding.FrgMainBinding;
import com.example.framework.model.ArticleBean;
import com.example.framework.model.BannerBean;
import com.example.framework.ui.act.DetailsAct;
import com.example.framework.ui.adapter.ImageTitleAdapter;
import com.example.framework.ui.adapter.MainAdapter;
import com.example.framework.vm.MainVM;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2021/12/21 23:10
 * @Description:
 */
public class MainFrg extends BaseFrg<MainVM, FrgMainBinding> {

    /**
     * banner数据
     */
    private List<BannerBean.DataBean> dataBeanList = new ArrayList<>();

    /**
     * 文章数据
     */
    private List<ArticleBean.DataBean.DatasBean> airicleList = new ArrayList<>();
    private MainAdapter mainAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.frg_main;
    }

    @Override
    protected void init() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(App.getContext(), LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                //解决嵌套滑动卡顿
                return false;
            }
        };
        mainAdapter = new MainAdapter(airicleList);
        binding.rvMain.setLayoutManager(linearLayoutManager);
        binding.rvMain.setAdapter(mainAdapter);
    }

    @Override
    protected void runFlow() {
        getBanner();
        getMainArticle();

        mainAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                ArticleBean.DataBean.DatasBean bean = (ArticleBean.DataBean.DatasBean) adapter.getItem(position);
                Intent intent = new Intent(App.getContext(), DetailsAct.class);
                switch (view.getId()) {
                    case R.id.tv_rv_main_title:
                        intent.putExtra("url", bean.getLink());
                        intent.putExtra("title",bean.getTitle());
                        LogUtils.d(bean.getLink());
                        startActivity(intent);
                        break;
                }
            }
        });
    }


    /**
     * 获得banner
     */
    public void getBanner() {
        mViewModel.getBannerHome().observe(this, new Observer<BannerBean>() {
            @Override
            public void onChanged(BannerBean bannerBean) {
                dataBeanList = bannerBean.getData();
                useBanner(dataBeanList);
            }
        });
    }

    /**
     * banner加载
     */
    public void useBanner(List<BannerBean.DataBean> dataBeanList) {
        binding.bannerMain.addBannerLifecycleObserver(this).setAdapter(new ImageTitleAdapter(dataBeanList))
                .setIndicator(new CircleIndicator(getContext()))
                .setIndicatorSpace(60);
    }

    public void getMainArticle() {
        mViewModel.getMainArticle().observe(this, new Observer<ArticleBean>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onChanged(ArticleBean articleBean) {
                airicleList.clear();
                airicleList.addAll(articleBean.getData().getDatas());
                mainAdapter.notifyDataSetChanged();
            }
        });
    }
}
