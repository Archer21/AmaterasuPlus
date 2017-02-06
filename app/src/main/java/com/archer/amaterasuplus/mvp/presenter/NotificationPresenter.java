package com.archer.amaterasuplus.mvp.presenter;

import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Notification;
import com.archer.amaterasuplus.io.callback.NotificationSearchServerCallback;
import com.archer.amaterasuplus.mvp.interactor.NotificationInteractor;
import com.archer.amaterasuplus.mvp.viewmodel.NotificationViewModel;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public class NotificationPresenter extends BasePresenter implements NotificationSearchServerCallback {

    private WeakReference<NotificationViewModel> mView;
    private NotificationInteractor mInteractor;

    public NotificationPresenter(NotificationViewModel view) {
        this.mView  = new WeakReference<>(view);
        mInteractor = new NotificationInteractor(this);
    }


    /**
     * Lifecycle methods from BaseFragment.
     */
    @Override
    public void onStart() {
        mView.get().setupList();
        mView.get().setupAdapter();
    }

    @Override
    public void onResume() {
        mInteractor.fetchNotifications();
    }

    @Override
    public void onStop() {
        mView = null;
    }



    /**
     * Available methods from Presenter to Interactor.
     */
    @Override
    public void onNotificationsFound(List<Notification> notifications) {
        mView.get().showResults(notifications);
    }

    @Override
    public void onFailedSearch() {

    }

    @Override
    public void onNetworkError() {

    }

    @Override
    public void onServerError() {

    }
}
