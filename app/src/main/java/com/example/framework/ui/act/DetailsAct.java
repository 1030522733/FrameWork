package com.example.framework.ui.act;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActDetailsBinding;
import com.example.framework.vm.StartVM;

/**
 * @Author: JianTours
 * @Data: 2022/1/10 22:17
 * @Description:
 */
public class DetailsAct extends BaseAct<StartVM, ActDetailsBinding> {
    @Override
    protected int getContentViewId() {
        return R.layout.act_details;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void runFlow() {
        Intent intent =getIntent();
        String url = intent.getStringExtra("url");
        binding.webDetails.loadUrl(url);
        binding.webDetails.setWebViewClient(new WebViewClient());
    }
}
