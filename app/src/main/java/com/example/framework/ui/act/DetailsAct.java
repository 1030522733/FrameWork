package com.example.framework.ui.act;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
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

    private WebSettings webSettings;

    @Override
    protected int getContentViewId() {
        return R.layout.act_details;
    }

    @Override
    protected void init() {
        //加载网页
        Intent intent =getIntent();
        String url = intent.getStringExtra("url");
        binding.webDetails.setWebViewClient(new WebViewClient());
        binding.webDetails.loadUrl(url);
        //解决加载空白屏
        webSettings = binding.webDetails.getSettings();
        webSettings.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
    }

    @Override
    protected void runFlow() {
        binding.webDetails.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100){
                    binding.progressBar.setVisibility(View.GONE);
                }else {
                    binding.progressBar.setVisibility(View.VISIBLE);
                    binding.progressBar.setProgress(newProgress);
                }
            }
        });
    }
}
