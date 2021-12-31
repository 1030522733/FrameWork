package com.example.framework.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.framework.R;
import com.example.framework.model.RankingBean;

import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2021/12/31 22:14
 * @Description:
 */
public class RankingAdapter extends BaseQuickAdapter<RankingBean.DataBean, BaseViewHolder> {
    public RankingAdapter(int layoutResId, @Nullable List<RankingBean.DataBean> data) {
        super(R.layout.rv_ranking, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, RankingBean.DataBean dataBean) {

    }
}
