package com.archer.amaterasuplus.mvp.interactor;

import com.archer.amaterasuplus.domain.Notification;
import com.archer.amaterasuplus.domain.Post;
import com.archer.amaterasuplus.io.callback.NotificationSearchServerCallback;
import com.archer.amaterasuplus.mvp.repository.NotificationRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public class NotificationInteractor {
    NotificationSearchServerCallback presenter;
    NotificationRepository repository;

    public NotificationInteractor (NotificationSearchServerCallback presenter) {
        this.presenter = presenter;
        this.repository = new NotificationRepository();
    }

    public void fetchNotifications () {
        presenter.onNotificationsFound(repository.fetchNotifications());
    }
}
































