package com.archer.amaterasuplus.mvp.interactor;

import com.archer.amaterasuplus.io.callback.CollectionSearchServerCallback;
import com.archer.amaterasuplus.mvp.repository.CollectionRepository;

/**
 * Created by archer on 07-01-17.
 */

public class UserCollectionInteractor {
    private CollectionSearchServerCallback mPresenter;
    private CollectionRepository repository;

    public UserCollectionInteractor(CollectionSearchServerCallback mPresenter) {
        this.mPresenter = mPresenter;
        this.repository = new CollectionRepository();
    }

    public void fetchCollections () {
        mPresenter.onCollectionsFound(repository.fetchUserCollections());
    }
}
