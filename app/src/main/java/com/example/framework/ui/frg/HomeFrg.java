package com.example.framework.ui.frg;

import com.example.framework.R;
import com.example.framework.base.BaseFrg;
import com.example.framework.databinding.FrgHomeBinding;
import com.example.framework.vm.StartVM;

/**
 * @Author: JianTours
 * @Data: 2021/12/21 23:10
 * @Description:
 */
public class HomeFrg extends BaseFrg<StartVM, FrgHomeBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.frg_home;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void runFlow() {
    }
}
