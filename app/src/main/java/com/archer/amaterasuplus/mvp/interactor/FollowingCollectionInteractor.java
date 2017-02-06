package com.archer.amaterasuplus.mvp.interactor;

import com.archer.amaterasuplus.io.callback.CollectionSearchServerCallback;
import com.archer.amaterasuplus.mvp.presenter.FollowingCollectionsPresenter;
import com.archer.amaterasuplus.mvp.repository.CollectionRepository;

/**
 * Created by archer on 07-01-17.
 */

public class FollowingCollectionInteractor {
    private CollectionSearchServerCallback mPresenter;
    private CollectionRepository repository;

    public FollowingCollectionInteractor (CollectionSearchServerCallback presenter) {
        this.mPresenter = presenter;
        this.repository = new CollectionRepository();
    }

    public void fetchCollections () {
        mPresenter.onCollectionsFound(repository.fetchFollowingCollections());
    }
}
