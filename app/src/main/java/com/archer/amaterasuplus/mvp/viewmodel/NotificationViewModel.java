package com.archer.amaterasuplus.mvp.viewmodel;

import com.archer.amaterasuplus.domain.Notification;

import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public interface NotificationViewModel {
    void setupList ();
    void setupAdapter ();
    void showResults (List<Notification> results);
    void showFailSearchMessage ();
}
