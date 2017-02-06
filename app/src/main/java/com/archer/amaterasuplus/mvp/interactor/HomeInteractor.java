package com.archer.amaterasuplus.mvp.interactor;

import com.archer.amaterasuplus.mvp.presenter.HomePresenter;
import com.archer.amaterasuplus.mvp.repository.PostRepository;

/**
 * Created by archer on 07-01-17.
 */

public class HomeInteractor {
    private HomePresenter presenter;
    private PostRepository repository;

    public HomeInteractor(HomePresenter presenter) {
        this.presenter = presenter;
        repository = new PostRepository();
    }

    public void fetchPosts () {
        presenter.onFetchResults(repository.fetchPosts());
    }
}
