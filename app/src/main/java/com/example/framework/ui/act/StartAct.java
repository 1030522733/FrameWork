package com.example.framework.ui.act;

import android.content.Intent;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActStartBinding;
import com.example.framework.model.BannerBean;
import com.example.framework.ui.frg.HomeFrg;
import com.example.framework.utils.MVUtils;
import com.example.framework.vm.StartVM;
import com.tencent.mmkv.MMKV;

/**
 * @Author: JianTours
 * @Data: 2021/12/19 20:57
 * @Description: 启动页
 */
public class StartAct extends BaseAct<StartVM, ActStartBinding> {

    @Override
    protected int getContentViewId() {
        return R.layout.act_start;
    }

    @Override
    protected void runFlow() {
        mViewModel.getBanner();
        mViewModel.mutableLiveData.observe(this, BannerBean -> binding.setViewModel(mViewModel));
        binding.imgStart.setOnClickListener(view -> {
            startActivity(new Intent(StartAct.this,HomeAct.class));
        });

        binding.btStart.setOnClickListener(view -> {
        });
    }
}
