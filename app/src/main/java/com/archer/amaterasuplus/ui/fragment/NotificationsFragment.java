package com.archer.amaterasuplus.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseFragment;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Notification;
import com.archer.amaterasuplus.domain.Post;
import com.archer.amaterasuplus.mvp.presenter.NotificationPresenter;
import com.archer.amaterasuplus.mvp.viewmodel.NotificationViewModel;
import com.archer.amaterasuplus.ui.adapter.NotificationsCommunityAdapter;
import com.archer.amaterasuplus.utils.ItemOffsetDecorator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends BaseFragment implements NotificationViewModel {

    @BindView(R.id.notifications_communities_recycler_view)
    RecyclerView recyclerView;

    private NotificationsCommunityAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new NotificationsCommunityAdapter(CONTEXT);
    }



    /**
     * Overrided methods from BaseFragment
     */
    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_notifications;
    }

    @Override
    public BasePresenter getPresenter() {
        return new NotificationPresenter(this);
    }



    /**
     * Implemented methods from ViewModel
     */
    @Override
    public void setupList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(CONTEXT, DividerItemDecoration.VERTICAL));
    }

    @Override
    public void setupAdapter() {
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showResults(List<Notification> results) {
        adapter.addAll(results);
    }

    @Override
    public void showFailSearchMessage() {

    }
}
























