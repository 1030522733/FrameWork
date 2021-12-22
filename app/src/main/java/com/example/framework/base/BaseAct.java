package com.example.framework.base;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author: JianTours
 * @Data: 2021/12/19 20:21
 * @Description: 基类Activity
 */
public abstract class BaseAct<VM extends BaseVM, VDB extends ViewDataBinding>
        extends AppCompatActivity {

    /**
    *上下文
    */
    public Context mContext;
    protected VM mViewModel;
    protected VDB binding;

    /**
    *获取activity文件，初始化binding
    */
    protected abstract int getContentViewId();

    /**
    *具体业务
    */
    protected abstract void runFlow();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(getContentViewId());
        binding = DataBindingUtil.setContentView(this,getContentViewId());
        binding.setLifecycleOwner(this);
        setStatusBar();
        createViewModel();
        runFlow();
    }

    public void createViewModel() {
        if (mViewModel == null) {
            Class<BaseVM> modelClass;
            // 返回直接继承的父类（包含泛型参数）
            Type type = getClass().getGenericSuperclass();
            if (type instanceof ParameterizedType) {
                modelClass = (Class<BaseVM>) ((ParameterizedType) type).getActualTypeArguments()[0];
            } else {
                // 如果没有指定泛型参数，则默认使用BaseViewModel
                modelClass = BaseVM.class;
            }
            mViewModel = (VM) new ViewModelProvider(this).get(modelClass);
        }
    }

    /**
    *沉浸式状态栏
    */
    protected void setStatusBar(){
        if (Build.VERSION.SDK_INT >= 21){
            View view = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            view.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
