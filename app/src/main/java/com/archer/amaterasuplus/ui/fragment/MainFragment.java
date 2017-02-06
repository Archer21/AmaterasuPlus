package com.archer.amaterasuplus.ui.fragment;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseFragment;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.utils.Helpers;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFragment {

    @BindView(R.id.bottom_bar)
    BottomBar bottomBar;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        configBottomBar(bottomBar);
    }

    /**
     * Private methods for this fragment
     */

    private void configBottomBar (BottomBar bottomBar) {
        bottomBar.setDefaultTab(R.id.home);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.home:
                        Helpers.setupFragment(getChildFragmentManager(), new HomeFragment(), R.id.tabs_main_container);
                        break;
                    case R.id.collections:
                        Helpers.setupFragment(getChildFragmentManager(), new CollectionsFragment(), R.id.tabs_main_container);
                        break;
                    case R.id.communities:
                        Helpers.setupFragment(getChildFragmentManager(), new CommunitiesFragment(), R.id.tabs_main_container);
                        break;
                    case R.id.notifications:
                        Helpers.setupFragment(getChildFragmentManager(), new NotificationsFragment(), R.id.tabs_main_container);
                        break;
                }
            }
        });
    }



    /**
     * Override methods from BaseFragment
     */
    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_main;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }
}





























