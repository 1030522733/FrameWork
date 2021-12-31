package com.example.framework.ui.act;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.framework.R;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActRankingBinding;
import com.example.framework.vm.RankingVM;

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
    private ImageView ivHomeFunction;

    @Override
    protected int getContentViewId() {
        return R.layout.act_ranking;
    }

    @Override
    protected void init() {
        ConstraintLayout toolbar = (ConstraintLayout) binding.toolbarRanking;
        ivToolbar = (ImageView) findViewById(R.id.iv_home_menu);
        tvToolbar = (TextView) findViewById(R.id.tv_home_toolbar);
        ivHomeFunction = (ImageView) findViewById(R.id.iv_home_function);
        tvToolbar.setText("积分排行榜");
    }

    @Override
    protected void runFlow() {

    }
}
