package com.example.framework.ui.act;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActDetailsBinding;
import com.example.framework.ui.vv.SampleTextVIew;
import com.example.framework.vm.StartVM;

/**
 * @Author: JianTours
 * @Data: 2022/1/10 22:17
 * @Description:
 */
public class DetailsAct extends BaseAct<StartVM, ActDetailsBinding> {
    /**
     * 标题栏
     */
    private ImageView ivToolbarBack, ivToolbarMean;
    private SampleTextVIew tvToolbar;

    @Override
    protected int getContentViewId() {
        return R.layout.act_details;
    }

    @Override
    protected void init() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        String title = intent.getStringExtra("title");
        ConstraintLayout toolbar = (ConstraintLayout) binding.toolbarDetails;
        ivToolbarBack = (ImageView) toolbar.getViewById(R.id.iv_details_back);
        tvToolbar = (SampleTextVIew) toolbar.getViewById(R.id.tv_details_toolbar);
        tvToolbar.setText(title);

        //加载网页
        binding.webDetails.setWebViewClient(new WebViewClient());
        binding.webDetails.loadUrl(url);
        binding.webDetails.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                //解决加载出现ERR_UNKNOWN_URL_SCHEME
                return true;
            }
        });
        //解决加载空白屏
        WebSettings webSettings = binding.webDetails.getSettings();
        webSettings.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }

        //进度条
        binding.webDetails.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    binding.progressBar.setVisibility(View.GONE);
                } else {
                    binding.progressBar.setVisibility(View.VISIBLE);
                    binding.progressBar.setProgress(newProgress);
                }
            }
        });
    }

    @Override
    protected void runFlow() {

    }
}
