package com.example.framework.ui.frg;

import com.example.framework.R;
import com.example.framework.base.BaseFrg;
import com.example.framework.databinding.FrgProjectBinding;
import com.example.framework.vm.StartVM;

/**
 * @Author: JianTours
 * @Data: 2021/12/23 20:38
 * @Description:
 */
public class ProjectFrg extends BaseFrg<StartVM, FrgProjectBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.frg_project;
    }

    @Override
    protected void runFlow() {

    }
}
