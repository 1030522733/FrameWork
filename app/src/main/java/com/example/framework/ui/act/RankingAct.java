package com.example.framework.ui.act;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActRankingBinding;
import com.example.framework.model.RankingBean;
import com.example.framework.ui.adapter.RankingAdapter;
import com.example.framework.vm.RankingVM;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2021/12/31 20:55
 * @Description:
 */
public class RankingAct extends BaseAct<RankingVM, ActRankingBinding> {

    /**
     * 标题栏
     */
    private ImageView ivToolbar;
    private TextView tvToolbar;

    /**
     * recyclerview
     */
    private RankingAdapter rankingAdapter;
    private List<RankingBean.DataBean.DatasBean> datasBeanList = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected int getContentViewId() {
        return R.layout.act_ranking;
    }

    @Override
    protected void init() {
        ConstraintLayout toolbar = (ConstraintLayout) binding.toolbarRanking;
        ivToolbar = (ImageView) toolbar.getViewById(R.id.iv_custom_toolbar);
        tvToolbar = (TextView) toolbar.getViewById(R.id.tv_custom_toolbar);
        tvToolbar.setText("积分排行榜");
        ivToolbar.setImageResource(R.mipmap.icon_back);
    }

    @Override
    protected void runFlow() {
        binding.aviRanking.show();
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rankingAdapter = new RankingAdapter(datasBeanList);
        binding.rvRanking.setLayoutManager(linearLayoutManager);
        binding.rvRanking.setAdapter(rankingAdapter);
        getRanking();
        ivToolbar.setOnClickListener(view -> {
            finish();
        });
    }

    /**
     * 获得排行榜
     */
    private void getRanking() {
        mViewModel.getRanking().observe(this, new Observer<RankingBean>() {
            @Override
            public void onChanged(RankingBean rankingBean) {
                datasBeanList.clear();
                datasBeanList.addAll(rankingBean.getData().getDatas());
                rankingAdapter.notifyDataSetChanged();
                binding.aviRanking.hide();
            }
        });
    }
}
