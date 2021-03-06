package com.archer.amaterasuplus.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import butterknife.ButterKnife;

/**
 * Created by archer on 30-12-16.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayout());
        injectViews();
    }

    @Override
    public void onStart() {
        super.onStart();
        if (getPresenter() != null) {
            getPresenter().onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getPresenter() != null) {
            getPresenter().onResume();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (getPresenter() != null) {
            getPresenter().onStop();
        }
    }

    /**
     * Public methods
     */
    public void injectViews () {
        ButterKnife.bind(this);
    }

    public void setupToolbar (Toolbar toolbar) {
        if (toolbar != null) {
            // will be automatically injected with butterknife
            // if a toolbar was defined
            setSupportActionBar(toolbar);
        } else {
            Log.e("BaseActivity", "ERROR IN THIS IMPLEMENTATION");
        }
    }

    /**
     * Abstract methods for all the activities
     */
    public abstract int getLayout ();
    public abstract Toolbar getToolbar ();
    public abstract BasePresenter getPresenter ();
}





































