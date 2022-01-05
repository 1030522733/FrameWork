package com.example.framework.ui.act;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;

import com.blankj.utilcode.util.LogUtils;
import com.example.framework.R;
import com.example.framework.base.App;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActHomeBinding;
import com.example.framework.model.IntegralBean;
import com.example.framework.ui.adapter.FrgAdapter;
import com.example.framework.vm.HomeVM;
import com.google.android.material.tabs.TabLayout;

/**
 * @Author: JianTours
 * @Data: 2021/12/22 21:10
 * @Description:
 */
public class HomeAct extends BaseAct<HomeVM, ActHomeBinding> {

    /**
     * 标题栏
     */
    private ImageView ivToolbar;
    private TextView tvToolbar;
    private ImageView ivHomeFunction;

    //几个代表页面的常量
    public static final int PAGE_HOME = 0;
    public static final int PAGE_SQUARE = 1;
    public static final int PAGE_SYSTEM = 2;
    public static final int PAGE_PROJECT = 3;

    /**
     * title:标题栏文字
     * titleIcons:标题栏图标
     * navigation:导航栏文字
     * navigationIcons:导航栏图标
     */
    private final int[] title = {R.string.Play, R.string.Square, R.string.System, R.string.Project};
    private final int[] titleIcons = {R.mipmap.icon_search, R.mipmap.icon_add,
            R.mipmap.icon_search, R.mipmap.icon_search};
    private final int[] navigation = {R.string.Home, R.string.Square, R.string.System, R.string.Project};
    private final int[] navigationIcons = {R.drawable.selector_tab_home, R.drawable.selector_tab_square,
            R.drawable.selector_tab_system, R.drawable.selector_tab_project};

    /**
     * 头部Navigation
     */
    private ImageView ivRanking;
    private TextView tvLogin;
    private TextView tvLevel;
    private TextView tvRanking;

    @Override
    protected int getContentViewId() {
        return R.layout.act_home;
    }

    @Override
    protected void init() {
        ConstraintLayout toolbar = (ConstraintLayout) binding.toolbarHome;
        ivToolbar = (ImageView) findViewById(R.id.iv_home_menu);
        tvToolbar = (TextView) findViewById(R.id.tv_home_toolbar);
        ivHomeFunction = (ImageView) findViewById(R.id.iv_home_function);
        tvToolbar.setText(title[0]);
        ivHomeFunction.setImageResource(titleIcons[0]);

        /**
         *头部NavigationVIew
         */
        View headerLayout = (View) binding.navHome.inflateHeaderView(R.layout.nav_header);
        ivRanking = (ImageView) headerLayout.findViewById(R.id.iv_ranking);
        tvLogin = (TextView) headerLayout.findViewById(R.id.tv_header_login);
        tvLevel = (TextView) headerLayout.findViewById(R.id.tv_header_level);
        tvRanking = (TextView) headerLayout.findViewById(R.id.tv_header_rank);
        tvLogin.setText("登录");
        tvLevel.setText("等级:--");
        tvRanking.setText("排名:--");
        getIntegral();



        FrgAdapter frgAdapter = new FrgAdapter(getSupportFragmentManager(), this);
        binding.vpHome.setAdapter(frgAdapter);
        binding.vpHome.setOffscreenPageLimit(1);
        binding.tbHome.setupWithViewPager(binding.vpHome);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getIntegral();
    }

    @Override
    protected void runFlow() {
        //滑动监听该表标题栏
        binding.vpHome.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                tvToolbar.setText(title[position]);
                ivHomeFunction.setImageResource(titleIcons[position]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //底部UI改变
        for (int i = 0; i < binding.tbHome.getTabCount(); i++) {
            TabLayout.Tab tab = binding.tbHome.getTabAt(i);
            assert tab != null;
            tab.setCustomView(setTabView(App.getContext(), i));
        }

        //Navigation
        ivToolbar.setOnClickListener(view -> {
            binding.drawerLayout.openDrawer(GravityCompat.START);
        });

        ivRanking.setOnClickListener(view -> {
            startActivity(new Intent(HomeAct.this, RankingAct.class));
        });

        tvLogin.setOnClickListener(view -> {
            if (tvLogin.getText().toString().equals("登录")) {
                startActivity(new Intent(HomeAct.this, LoginAct.class));
            }
        });
    }

    /**
     * 自定义底部Tab
     */
    public View setTabView(Context context, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab_home, null);
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_home);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_tab_home);
        textView.setText(navigation[position]);
        textView.setTextColor(binding.tbHome.getTabTextColors());
        imageView.setImageResource(navigationIcons[position]);
        return view;
    }

    /**
     * 获取个人积分排名
     */
    private void getIntegral() {
        mViewModel.getIntegral().observe(this, new Observer<IntegralBean>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onChanged(IntegralBean integralBean) {
                if (integralBean.getData() != null) {
                    tvLogin.setText(integralBean.getData().getUsername());
                    tvLevel.setText("等级：" + integralBean.getData().getLevel());
                    tvRanking.setText("排名：" + integralBean.getData().getRank());
                    LogUtils.d(integralBean.getData().getUsername());
                }else {
                    tvLogin.setText("登录");
                    tvLevel.setText("等级:--");
                    tvRanking.setText("排名:--");
                }
            }
        });
    }
}
