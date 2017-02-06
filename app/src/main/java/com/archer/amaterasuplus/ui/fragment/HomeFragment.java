package com.archer.amaterasuplus.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseFragment;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Post;
import com.archer.amaterasuplus.mvp.presenter.HomePresenter;
import com.archer.amaterasuplus.mvp.viewmodel.HomeViewModel;
import com.archer.amaterasuplus.ui.adapter.PostAdapter;
import com.archer.amaterasuplus.utils.ItemOffsetDecorator;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements HomeViewModel {

    @BindView(R.id.home_recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    private PostAdapter postAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        postAdapter = new PostAdapter(getActivity(), R.layout.item_post_card);
    }

    /**
     * Override methods from HomeViewModel
     */
    @Override
    public void setupList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new ItemOffsetDecorator(getActivity(), R.integer.post_offset));
    }

    @Override
    public void setupAdapter() {
        recyclerView.setAdapter(postAdapter);
    }

    @Override
    public void showResults(List<Post> results) {
        postAdapter.addAll(results);
    }

    @Override
    public void showFailSearchMessage() {

    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }


    /**
     * Overrided methods from BaseFragment
     */
    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public BasePresenter getPresenter() {
        return new HomePresenter(this);
    }
}



























