package com.archer.amaterasuplus.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseActivity;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.utils.Helpers;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.coordinator_layout)
    CoordinatorLayout coordinatorLayout;
    @BindView(R.id.relative_layout)
    RelativeLayout relativeLayout;
    @BindView(R.id.email_txt_input_layout)
    TextInputLayout emailInputLayout;
    @BindView(R.id.password_txt_input_layout)
    TextInputLayout passwordInputLayout;
    @BindView(R.id.email_txt_input_edit_text)
    TextInputEditText emailInputEditText;
    @BindView(R.id.password_txt_input_edit_text)
    TextInputEditText passwordInputEditText;

//    @BindView(R.id.progress_bar)
//    ProgressBar progressBar;
    FirebaseAuth auth;

    /**
     * Activity lifecycle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        relativeLayout.getBackground().setAlpha(200);
        auth = FirebaseAuth.getInstance();
    }


    /**
     * Activity methods
     */

    public void goSignupPage (View view) {
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
    }

    public void loginUser (View v) {
        String email = emailInputEditText.getText().toString().trim();
        String password = passwordInputEditText.getText().toString().trim();

        if (!confirmEmail(email)) {
            return;
        }

        if (!confirmPassword(password)) {
            return;
        }

        emailInputLayout.setErrorEnabled(false);
        passwordInputLayout.setErrorEnabled(false);

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (!task.isSuccessful()) {
                        // there was an error
                        Snackbar snackbar = Snackbar.make(coordinatorLayout, getString(R.string.signup_failed_error_message), Snackbar.LENGTH_LONG);
                        snackbar.show();

                    } else {
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });
    }

    public boolean confirmEmail (String email) {
        if (email.isEmpty() || !Helpers.isEmailValid(email)) {
            emailInputLayout.setErrorEnabled(true);
            emailInputLayout.setError(getString(R.string.err_msg_password));
            requestFocus(emailInputEditText);
            return false;
        }
        emailInputLayout.setErrorEnabled(false);
        return true;
    }

    public boolean confirmPassword (String password) {
        if (password.isEmpty() || !Helpers.isPasswordValid(password)) {

            passwordInputLayout.setErrorEnabled(true);
            passwordInputLayout.setError(getString(R.string.err_msg_required));
            requestFocus(passwordInputLayout);
            return false;
        }


        passwordInputLayout.setErrorEnabled(false);
        return true;
    }

    public void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    /**
     * Onclick methods
     */

    public void submitSignupForm (View v) {
        String email = emailInputEditText.getText().toString().trim();
        String password = passwordInputEditText.getText().toString().trim();

        if (!confirmEmail(email)) {
            return;
        }

        if (!confirmPassword(password)) {
            return;
        }

        emailInputLayout.setErrorEnabled(false);
        passwordInputLayout.setErrorEnabled(false);


        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (!task.isSuccessful()) {
                            Snackbar snackbar = Snackbar.make(coordinatorLayout, getString(R.string.signup_failed_error_message), Snackbar.LENGTH_LONG);
                            snackbar.show();
                        } else {
                            Helpers.navigate(LoginActivity.this, LoginActivity.class);
                            finish();
                        }
                        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Exitosamente registrado", Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
                });
    }

    public void goToLoginScreen (View v) {
        Helpers.navigate(LoginActivity.this, MainActivity.class);
    }





    /**
     * Override methods from BaseActivity
     */
    @Override
    public int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }


}































