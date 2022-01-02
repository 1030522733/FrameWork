package com.example.framework.ui.act;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActLoginBinding;
import com.example.framework.vm.LoginVM;

/**
 * @Author: JianTours
 * @Data: 2022/1/2 13:24
 * @Description:
 */
public class LoginAct extends BaseAct<LoginVM, ActLoginBinding> {
    /**
     * 标题栏
     */
    private ImageView ivToolbar;
    private TextView tvToolbar;

    @Override
    protected int getContentViewId() {
        return R.layout.act_login;
    }

    @Override
    protected void init() {
        ConstraintLayout toolbar = (ConstraintLayout) binding.toolbarLogin;
        ivToolbar = (ImageView) findViewById(R.id.iv_custom_toolbar);
        tvToolbar = (TextView) findViewById(R.id.tv_custom_toolbar);
        tvToolbar.setText("登录");
    }

    @Override
    protected void runFlow() {
        ivToolbar.setOnClickListener(view -> {
            finish();
        });
    }
}
