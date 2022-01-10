package com.example.framework.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.framework.R;
import com.example.framework.model.ArticleBean;

import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2022/1/7 23:40
 * @Description: 首页文章
 */
public class MainAdapter extends BaseQuickAdapter<ArticleBean.DataBean.DatasBean, BaseViewHolder> {

    public MainAdapter(List<ArticleBean.DataBean.DatasBean> data) {
        super(R.layout.rv_main, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, ArticleBean.DataBean.DatasBean item) {
        helper.setText(R.id.tv_rv_main_title,item.getTitle());
        helper.addOnClickListener(R.id.tv_rv_main_title);
    }

}
