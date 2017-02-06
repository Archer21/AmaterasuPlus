package com.archer.amaterasuplus.mvp.interactor;

import com.archer.amaterasuplus.mvp.presenter.TopCollectionsPresenter;
import com.archer.amaterasuplus.mvp.repository.CollectionRepository;

/**
 * Created by archer on 07-01-17.
 */

public class TopCollectionsInteractor {
    private TopCollectionsPresenter mPresenter;
    private CollectionRepository repository;

    public TopCollectionsInteractor(TopCollectionsPresenter mPresenter) {
        this.mPresenter = mPresenter;
        repository = new CollectionRepository();
    }

    public void fetchCollections () {
        mPresenter.onCollectionsFound(repository.fetchTopCollections());
    }
}
