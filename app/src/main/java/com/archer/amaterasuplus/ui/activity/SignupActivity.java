package com.archer.amaterasuplus.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseActivity;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.mvp.viewmodel.SignupActivityViewModel;
import com.archer.amaterasuplus.utils.Helpers;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;

public class SignupActivity extends BaseActivity implements SignupActivityViewModel {

    @BindView(R.id.relative_layout)
    RelativeLayout relativeLayout;
    @BindView(R.id.coordinator_layout)
    CoordinatorLayout coordinatorLayout;

    @BindView(R.id.email_txt_input_layout)
    TextInputLayout emailInputLayout;
    @BindView(R.id.email_txt_input_edit_text)
    TextInputEditText emailInputEditText;

    @BindView(R.id.password_txt_input_layout)
    TextInputLayout passwordInputLayout;
    @BindView(R.id.password_txt_input_edit_text)
    TextInputEditText passwordInputEditText;

    @BindView(R.id.confirm_password_txt_input_layout)
    TextInputLayout confirmPasswordInputLayout;
    @BindView(R.id.confirm_password_txt_input_edit_text)
    TextInputEditText confirmPasswordInputEditText;

    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    FirebaseAuth auth;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        relativeLayout.getBackground().setAlpha(200);
        auth = FirebaseAuth.getInstance();
    }


    /**
     * Override methods from BaseActivity
     */
    @Override
    public int getLayout() {
        return R.layout.activity_signup;
    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    public void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    @Override
    public void showEmailError() {
        emailInputLayout.setErrorEnabled(true);
        emailInputLayout.setError(getString(R.string.err_msg_password));
        requestFocus(emailInputEditText);
    }

    @Override
    public void showPasswordError() {
        passwordInputLayout.setErrorEnabled(true);
        passwordInputLayout.setError(getString(R.string.err_msg_password_dont_match));
        requestFocus(passwordInputLayout);
    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressBar() {

    }

    @Override
    public void disableInputError(boolean disable) {

    }
}







































