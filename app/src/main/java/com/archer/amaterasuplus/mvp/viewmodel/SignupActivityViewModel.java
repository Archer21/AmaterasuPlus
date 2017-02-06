package com.archer.amaterasuplus.mvp.viewmodel;

import android.view.View;

/**
 * Created by alanaliaga on 2/2/17.
 */

public interface SignupActivityViewModel {
    public void requestFocus (View view);
    public void showEmailError ();
    public void showPasswordError ();
    public void showProgressBar ();
    public void hideProgressBar ();
    public void disableInputError (boolean disable);
}
