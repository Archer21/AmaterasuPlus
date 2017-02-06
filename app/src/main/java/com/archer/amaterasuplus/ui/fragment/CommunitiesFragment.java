package com.archer.amaterasuplus.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.utils.SetupTabLayout;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CommunitiesFragment extends SetupTabLayout {

    // REQUIRED VIEWS FOR TABS
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;

    // REQUIRED FRAGMENTS FOR TABS
    private Fragment[] tabsFragments = {
            new RecommendedCommunitiesFragment(),
            new MemberCommunitiesFragment(),
            new UserCommunitiesFragment()
    };

    // REQUIRED TAB TITLES
    // Cambiar a un array de strings en los recursos (strings.xml)
    private String[] tabsTitles = {
            "Recomendados",
            "Miembro",
            "Tuyas"
    };

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupTabs(viewPager, tabLayout, tabsFragments, tabsTitles);
    }




    /**
     * Overrided methods from BaseFragment
     */
    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_communities;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }
}































