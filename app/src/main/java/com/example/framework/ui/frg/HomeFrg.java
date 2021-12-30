package com.example.framework.ui.frg;

import androidx.lifecycle.Observer;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.R;
import com.example.framework.base.BaseFrg;
import com.example.framework.databinding.FrgHomeBinding;
import com.example.framework.model.BannerBean;
import com.example.framework.ui.adapter.ImageTitleAdapter;
import com.example.framework.vm.HomeVM;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2021/12/21 23:10
 * @Description:
 */
public class HomeFrg extends BaseFrg<HomeVM, FrgHomeBinding> {

    /**
     * banner数据
     */
    private List<BannerBean.DataBean> dataBeanList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.frg_home;
    }

    @Override
    protected void init() {
    }

    @Override
    protected void runFlow() {
        getBanner();
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
        binding.bannerHome.addBannerLifecycleObserver(this).setAdapter(new ImageTitleAdapter(dataBeanList))
                .setIndicator(new CircleIndicator(getContext()))
                .setIndicatorSpace(60);
    }
}
