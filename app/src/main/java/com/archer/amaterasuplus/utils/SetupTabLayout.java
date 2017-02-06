package com.archer.amaterasuplus.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.archer.amaterasuplus.common.BaseFragment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by alanaliaga on 3/1/17.
 */

public abstract class SetupTabLayout  extends BaseFragment {

    public void setupTabs(ViewPager viewPager, TabLayout tabLayout, Fragment[] fragments, String[] tabsTitles) {
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager(), buildFragments(fragments)));
        tabLayout.setupWithViewPager(viewPager);
        setTabsName(tabLayout, tabsTitles);
    }

    public ArrayList<Fragment> buildFragments(Fragment[] fragmentsArray) {

        ArrayList<Fragment> fragments = new ArrayList<>();

        Collections.addAll(fragments, fragmentsArray);

        return fragments;
    }

    public void setTabsName(TabLayout tabLayout, String[] tabsTitles) {
        int size = tabsTitles.length;
        for (int i = 0; i < size; i++) {
            tabLayout.getTabAt(i).setText(tabsTitles[i]);
        }
    }
}



























