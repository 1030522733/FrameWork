package com.example.framework.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.framework.ui.act.HomeAct;
import com.example.framework.ui.frg.HomeFrg;
import com.example.framework.ui.frg.ProjectFrg;
import com.example.framework.ui.frg.SquareFrg;
import com.example.framework.ui.frg.SystemFrg;

/**
 * @Author: JianTours
 * @Data: 2021/12/23 20:29
 * @Description:FragmentViewPager2Adapter
 */
public class FrgAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;
    private HomeFrg homeFrg = null;
    private SquareFrg squareFrg = null;
    private SystemFrg systemFrg = null;
    private ProjectFrg projectFrg = null;

    public FrgAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        homeFrg = new HomeFrg();
        squareFrg = new SquareFrg();
        systemFrg = new SystemFrg();
        projectFrg = new ProjectFrg();

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case HomeAct.PAGE_HOME:
                fragment = homeFrg;
                break;
            case HomeAct.PAGE_SQUARE:
                fragment = squareFrg;
                break;
            case HomeAct.PAGE_SYSTEM:
                fragment = systemFrg;
                break;
            case HomeAct.PAGE_PROJECT:
                fragment = projectFrg;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
