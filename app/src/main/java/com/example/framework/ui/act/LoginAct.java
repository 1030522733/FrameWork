package com.example.framework.ui.act;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;

import com.example.framework.R;
import com.example.framework.base.App;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActLoginBinding;
import com.example.framework.model.LoginBean;
import com.example.framework.vm.LoginVM;

import es.dmoral.toasty.Toasty;

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
            username = binding.etLoginUsername.getText().toString();
            password = binding.etLoginPassword.getText().toString();
            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toasty.normal(this, "账号或密码不能为空!", Toast.LENGTH_SHORT).show();
            } else {
                Login(username, password);
                binding.aviLogin.show();
            }
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
                if (loginBean.getData() != null) {
                    //通过sp存储账号密码
                    @SuppressLint("CommitPrefEdits")
                    SharedPreferences.Editor editor = getSharedPreferences("AccountData", MODE_PRIVATE).edit();
                    editor.putString("username", loginBean.getData().getUsername());
                    editor.putString("password", loginBean.getData().getPassword());
                    editor.putInt("id", loginBean.getData().getId());
                    editor.apply();
                    Toasty.success(App.getContext(), "登录成功", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toasty.error(App.getContext(), "账号或密码错误", Toast.LENGTH_SHORT, true).show();
                }
            }
        });
    }

    /**
     * 禁止点击
     */
    private void banClick() {
        binding.btLogin.setEnabled(false);
        binding.btRegister.setEnabled(false);
        binding.etLoginUsername.setEnabled(false);
        binding.etLoginPassword.setEnabled(false);
    }

    /**
     * 允许点击
     */
    private void allowClick() {
        binding.btLogin.setEnabled(true);
        binding.btRegister.setEnabled(true);
        binding.etLoginUsername.setEnabled(true);
        binding.etLoginPassword.setEnabled(true);
    }
}
