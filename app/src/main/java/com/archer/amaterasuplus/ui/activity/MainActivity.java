package com.archer.amaterasuplus.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.ui.fragment.MainFragment;
import com.archer.amaterasuplus.ui.fragment.SearchFragment;
import com.archer.amaterasuplus.utils.Helpers;
import com.archer.amaterasuplus.utils.SetupNavigationDrawer;

import butterknife.BindView;

public class MainActivity extends SetupNavigationDrawer {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.navigation_view)
    NavigationView navigationView;

    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupToolbar(toolbar);
        configDrawer(R.string.open_drawer, R.string.close_drawer);


        if (savedInstanceState == null) {
            Helpers.setupFragment(fragmentManager, new MainFragment(), R.id.main_container);
        }
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    public Toolbar getToolbar() {
        return toolbar;
    }

    @Override
    public DrawerLayout getDrawer() {
        return drawer;
    }

    @Override
    public NavigationView getNavigationView() {
        return navigationView;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.drawer_home) {
            Helpers.setupFragment(fragmentManager, new MainFragment(), R.id.main_container);
        } else if (id == R.id.drawer_search) {
            Helpers.setupFragment(fragmentManager, new SearchFragment(), R.id.main_container);
        } else if (id == R.id.drawer_log_out) {
            Log.d(LOG_TAG, "Logout of the application");
        }

        getDrawer().closeDrawer(GravityCompat.START);
        return true;
    }
}






























