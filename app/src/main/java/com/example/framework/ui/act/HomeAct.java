package com.example.framework.ui.act;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActHomeBinding;
import com.example.framework.vm.StartVM;

/**
 * @Author: JianTours
 * @Data: 2021/12/22 21:10
 * @Description:
 */
public class HomeAct extends BaseAct<StartVM, ActHomeBinding> {
    @Override
    protected int getContentViewId() {
        return R.layout.act_home;
    }

    @Override
    protected void runFlow() {

    }
}
