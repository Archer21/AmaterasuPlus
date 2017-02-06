package com.archer.amaterasuplus.mvp.presenter;

import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Post;
import com.archer.amaterasuplus.mvp.interactor.HomeInteractor;
import com.archer.amaterasuplus.mvp.viewmodel.HomeViewModel;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public class HomePresenter extends BasePresenter {

    private WeakReference<HomeViewModel> mView;
    private HomeInteractor mInteractor;

    public HomePresenter(HomeViewModel mView) {
        this.mView  = new WeakReference<>(mView);
        mInteractor = new HomeInteractor(this);
    }

    /**
     * Lifecycle methods from BaseFragment.
     */

    @Override
    public void onStart() {
        mView.get().showProgressBar();
        mView.get().setupList();
        mView.get().setupAdapter();
    }

    @Override
    public void onResume() {
        mInteractor.fetchPosts();
    }

    @Override
    public void onStop() {
        mView = null;
    }



    /**
     * Available methods from Presenter to Interactor.
     */
    public void onFetchResults (List<Post> postsResults) {
        mView.get().hideProgressBar();
        mView.get().showResults(postsResults);
    }

    /**
     * TODO:Use this method with the error result of retrofit or your prefer library
     */
    public void onFetchFailure (String errorMessage) {

    }
}







































