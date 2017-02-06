package com.archer.amaterasuplus.mvp.presenter;

import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Collection;
import com.archer.amaterasuplus.io.callback.CollectionSearchServerCallback;
import com.archer.amaterasuplus.mvp.interactor.FollowingCollectionInteractor;
import com.archer.amaterasuplus.mvp.viewmodel.FollowingCollectionViewModel;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public class FollowingCollectionsPresenter extends BasePresenter implements CollectionSearchServerCallback {

    private WeakReference<FollowingCollectionViewModel> mView;
    private FollowingCollectionInteractor mInteractor;

    public FollowingCollectionsPresenter(FollowingCollectionViewModel view) {
        this.mView  = new WeakReference<>(view);
        mInteractor = new FollowingCollectionInteractor(this);
    }

    @Override
    public void onStart() {
        mView.get().setupList();
        mView.get().setupAdapter();
    }

    /**
     * Lifecycle methods from BasePresenter
     */

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

































