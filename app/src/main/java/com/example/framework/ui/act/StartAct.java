package com.example.framework.ui.act;

import android.content.Intent;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActStartBinding;
import com.example.framework.vm.StartVM;

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

        binding.btStart.setOnClickListener(view -> {
            startActivity(new Intent(StartAct.this, HomeAct.class));
        });
    }
}
