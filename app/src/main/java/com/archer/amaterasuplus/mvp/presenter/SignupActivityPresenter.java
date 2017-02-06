package com.archer.amaterasuplus.mvp.presenter;

import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.io.callback.SignupActivitySearchCallback;
import com.archer.amaterasuplus.mvp.interactor.SignupActivityInteractor;
import com.archer.amaterasuplus.mvp.viewmodel.SignupActivityViewModel;

import java.lang.ref.WeakReference;

/**
 * Created by alanaliaga on 2/2/17.
 */

public class SignupActivityPresenter extends BasePresenter implements SignupActivitySearchCallback {

    private WeakReference<SignupActivityViewModel> mView;
    private SignupActivityInteractor mInteractor;

    public SignupActivityPresenter(SignupActivityViewModel view) {
        this.mView = new WeakReference<>(view);
        this.mInteractor = new SignupActivityInteractor(this);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStop() {
        mView = null;
    }

    @Override
    public void onUserCreated() {

    }

    @Override
    public void onUserCreationFailed() {

    }


    /**
     * Validation methods
     */


}
