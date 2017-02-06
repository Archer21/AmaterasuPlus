package com.archer.amaterasuplus.mvp.presenter;

import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Community;
import com.archer.amaterasuplus.mvp.interactor.CommunityInteractor;
import com.archer.amaterasuplus.mvp.viewmodel.RecommendedCommunitiesViewModel;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public class RecommendedCommunitiesPresenter extends BasePresenter {

    private WeakReference<RecommendedCommunitiesViewModel> mView;
    private CommunityInteractor mInteractor;

    public RecommendedCommunitiesPresenter(RecommendedCommunitiesViewModel view) {
        this.mView = new WeakReference<>(view);
        this.mInteractor = new CommunityInteractor(this);
    }

    /**
     * Override methods from BasePresenter
     */
    @Override
    public void onStart() {
        mView.get().setupList();
        mView.get().setupAdapter();
    }

    @Override
    public void onResume() {
        mInteractor.fetchRecommendedCommunities();
    }

    @Override
    public void onStop() {
        mView = null;
    }

    /**
     * Available methods from Presenter to Interactor
     */

    public void onFetchResults (List<Community> results) {
        mView.get().showResults(results);
    }
}































