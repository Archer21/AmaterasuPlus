package com.archer.amaterasuplus.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseFragment;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Collection;
import com.archer.amaterasuplus.mvp.presenter.FollowingCollectionsPresenter;
import com.archer.amaterasuplus.mvp.viewmodel.FollowingCollectionViewModel;
import com.archer.amaterasuplus.ui.adapter.CollectionsAdapter;
import com.archer.amaterasuplus.utils.ItemOffsetDecorator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FollowingCollectionsFragment extends BaseFragment implements FollowingCollectionViewModel {

    private static final int NUM_COLS = 2;

    @BindView(R.id.following_collection_recycler_view)
    RecyclerView recyclerView;

    private CollectionsAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new CollectionsAdapter(CONTEXT);
    }

    /**
     * Override methods from BaseFragment
     */
    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_following_collections;
    }

    @Override
    public BasePresenter getPresenter() {
        return new FollowingCollectionsPresenter(this);
    }


    /**
     * Implemented methods from ViewModel
     */
    @Override
    public void setupList() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(CONTEXT, NUM_COLS);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new ItemOffsetDecorator(CONTEXT, R.integer.collection_offset));
    }

    @Override
    public void setupAdapter() {
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showResults(List<Collection> results) {
        adapter.addAll(results);
    }

    @Override
    public void showFailSearchMessage() {

    }
}







































