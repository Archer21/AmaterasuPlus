package com.archer.amaterasuplus.mvp.presenter;

import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Collection;
import com.archer.amaterasuplus.io.callback.CollectionSearchServerCallback;
import com.archer.amaterasuplus.mvp.interactor.UserCollectionInteractor;
import com.archer.amaterasuplus.mvp.viewmodel.UserCollectionViewModel;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public class UserCollectionPresenter extends BasePresenter implements CollectionSearchServerCallback {

    private WeakReference<UserCollectionViewModel> mView;
    private UserCollectionInteractor mInteractor;

    public UserCollectionPresenter(UserCollectionViewModel view) {
        this.mView  = new WeakReference<>(view);
        mInteractor = new UserCollectionInteractor(this);
    }

    /**
     * Lifecycle methods from BasePresenter to BaseFragment
     */
    @Override
    public void onStart() {
        mView.get().setupList();
        mView.get().setupAdapter();
    }

    @Override
    public void onResume() {
        mInteractor.fetchCollections();
    }

    @Override
    public void onStop() {
        mView = null;
    }


    /**
     * Available methods of Presenter to Interactor
     */
    @Override
    public void onCollectionsFound(List<Collection> collections) {
        mView.get().showResults(collections);
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
