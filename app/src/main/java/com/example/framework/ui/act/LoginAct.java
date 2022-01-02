package com.example.framework.ui.act;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActLoginBinding;
import com.example.framework.model.LoginBean;
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

    /**
     * 账号密码
     */
    private String username, password;

    @Override
    protected int getContentViewId() {
        return R.layout.act_login;
    }

    @Override
    protected void init() {
        ConstraintLayout toolbar = (ConstraintLayout) binding.toolbarLogin;
        ivToolbar = (ImageView) findViewById(R.id.iv_custom_toolbar);
        TextView tvToolbar = (TextView) findViewById(R.id.tv_custom_toolbar);
        tvToolbar.setText("登录或注册");
    }

    @Override
    protected void runFlow() {
        ivToolbar.setOnClickListener(view -> {
            finish();
        });

        binding.btLogin.setOnClickListener(view -> {
            binding.aviLogin.show();
            banClick();
            username = binding.etLoginUsername.getText().toString();
            password = binding.etLoginPassword.getText().toString();
            Login(username, password);
        });
    }

    /**
     * 登录
     */
    private void Login(String username, String password) {
        mViewModel.Login(username, password).observe(this, new Observer<LoginBean>() {
            @Override
            public void onChanged(LoginBean loginBean) {
                binding.aviLogin.hide();
                allowClick();
                if (loginBean.getData() != null) {
                    //通过sp存储账号密码
                    @SuppressLint("CommitPrefEdits")
                    SharedPreferences.Editor editor = getSharedPreferences("AccountData", MODE_PRIVATE).edit();
                    editor.putString("username", loginBean.getData().getUsername());
                    editor.putString("password", loginBean.getData().getPassword());
                    editor.putInt("id", loginBean.getData().getId());
                    editor.apply();
                }
            }
        });
    }

    /**
     *禁止点击
     */
    private void banClick(){
        binding.btLogin.setEnabled(false);
        binding.btRegister.setEnabled(false);
        binding.etLoginUsername.setEnabled(false);
        binding.etLoginPassword.setEnabled(false);
    }

    /**
     *允许点击
     */
    private void allowClick(){
        binding.btLogin.setEnabled(true);
        binding.btRegister.setEnabled(true);
        binding.etLoginUsername.setEnabled(true);
        binding.etLoginPassword.setEnabled(true);
    }
}
