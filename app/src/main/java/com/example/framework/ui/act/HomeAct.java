package com.example.framework.ui.act;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.framework.R;
import com.example.framework.base.App;
import com.example.framework.base.BaseAct;
import com.example.framework.databinding.ActHomeBinding;
import com.example.framework.ui.adapter.FrgAdapter;
import com.example.framework.vm.StartVM;
import com.google.android.material.tabs.TabLayout;

/**
 * @Author: JianTours
 * @Data: 2021/12/22 21:10
 * @Description:
 */
public class HomeAct extends BaseAct<StartVM, ActHomeBinding> {

    //几个代表页面的常量
    public static final int PAGE_HOME = 0;
    public static final int PAGE_SQUARE = 1;
    public static final int PAGE_SYSTEM = 2;
    public static final int PAGE_PROJECT = 3;

    /**
     * 导航栏图片及名称
     */
    private final String[] titles = {"主页", "广场", "体系", "项目"};
    private final int[] tabIcons = {R.drawable.selector_tab_home, R.drawable.selector_tab_square,
            R.drawable.selector_tab_system, R.drawable.selector_tab_project};

    @Override
    protected int getContentViewId() {
        return R.layout.act_home;
    }

    @Override
    protected void runFlow() {
        FrgAdapter frgAdapter = new FrgAdapter(getSupportFragmentManager(), this);
        binding.vpHome.setAdapter(frgAdapter);
        binding.vpHome.setOffscreenPageLimit(1);
        binding.tbHome.setupWithViewPager(binding.vpHome);
        for (int i = 0; i < binding.tbHome.getTabCount(); i++) {
            TabLayout.Tab tab = binding.tbHome.getTabAt(i);
            assert tab != null;
            tab.setCustomView(setTabView(App.getContext(), i));
        }
    }

    /**
     * 自定义Tab
     */
    public View setTabView(Context context, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab_home, null);
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_home);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_tab_home);
        textView.setText(titles[position]);
        textView.setTextColor(binding.tbHome.getTabTextColors());
        imageView.setImageResource(tabIcons[position]);
        return view;
    }
}
