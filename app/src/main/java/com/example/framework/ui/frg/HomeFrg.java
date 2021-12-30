package com.example.framework.ui.frg;

import android.annotation.SuppressLint;
import android.view.ViewGroup;

import androidx.lifecycle.Observer;

import com.blankj.utilcode.util.LogUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.framework.R;
import com.example.framework.base.BaseFrg;
import com.example.framework.databinding.FrgHomeBinding;
import com.example.framework.model.BannerBean;
import com.example.framework.vm.HomeVM;
import com.example.framework.vm.StartVM;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
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
     *banner数据
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
     *banner加载
     */
    public void useBanner(List<BannerBean.DataBean> dataBeanList){
        binding.bannerHome.setAdapter(new BannerImageAdapter<BannerBean.DataBean>(dataBeanList) {
            @SuppressLint("CheckResult")
            @Override
            public void onBindView(BannerImageHolder holder, BannerBean.DataBean data, int position, int size) {
                Glide.with(holder.itemView)
                        .load(data.getImagePath())
                        .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                        .into(holder.imageView);
            }
        })
                .isAutoLoop(true)
                .addBannerLifecycleObserver(this)
                .setIndicator(new CircleIndicator(getContext()));
    }

    /**
     *获得banner
     */
    public void getBanner(){
        mViewModel.getBannerHome().observe(this, new Observer<BannerBean>() {
            @Override
            public void onChanged(BannerBean bannerBean) {
                dataBeanList = bannerBean.getData();
                useBanner(dataBeanList);
            }
        });
    }
}
