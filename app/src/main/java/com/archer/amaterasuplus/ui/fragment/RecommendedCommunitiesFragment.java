package com.archer.amaterasuplus.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseFragment;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Community;
import com.archer.amaterasuplus.mvp.presenter.RecommendedCommunitiesPresenter;
import com.archer.amaterasuplus.mvp.viewmodel.RecommendedCommunitiesViewModel;
import com.archer.amaterasuplus.ui.adapter.RecommendedCommunitiesAdapter;
import com.archer.amaterasuplus.utils.ItemOffsetDecorator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecommendedCommunitiesFragment extends BaseFragment implements RecommendedCommunitiesViewModel {

    @BindView(R.id.recommended_communities_recycler_view)
    RecyclerView recyclerView;

    private RecommendedCommunitiesAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new RecommendedCommunitiesAdapter(CONTEXT);
    }

    /**
     * Implemented methods from ViewModel
     */
    @Override
    public void setupList() {
        LinearLayoutManager layoutManager= new LinearLayoutManager(CONTEXT, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new ItemOffsetDecorator(CONTEXT, R.integer.community_offset));
    }

    @Override
    public void setupAdapter() {
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showResults(List<Community> results) {
        adapter.addAll(results);
    }

    @Override
    public void showFailSearchMessage() {

    }

    /**
     * Overrided methods from BaseFragment
     */
    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_recommended_communities;
    }

    @Override
    public BasePresenter getPresenter() {
        return new RecommendedCommunitiesPresenter(this);
    }
}




































