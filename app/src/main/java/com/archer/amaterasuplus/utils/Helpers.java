package com.archer.amaterasuplus.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;

import com.archer.amaterasuplus.R;

/**
 * Created by archer on 30-12-16.
 */

public class Helpers {

    public static void navigate (Activity currentActivity, Class destinyActivity) {
        Intent intent = new Intent(currentActivity, destinyActivity);
        currentActivity.startActivity(intent);
    }

    public static void setupFragment (FragmentManager fm, Fragment fragment, int resourceContainer) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(resourceContainer, fragment).addToBackStack(null).commit();
    }

    public static String cutText (String text, int maxSize) {
        int textLength = text.length();
        if (textLength > maxSize) {
            return text.substring(0, maxSize);
        }
        return text;
    }


    /**
     * Email and password check
     */
    public static boolean isEmailValid (String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public static boolean isPasswordValid (String password) {
        return (password.length() >= 6);
    }
}


































