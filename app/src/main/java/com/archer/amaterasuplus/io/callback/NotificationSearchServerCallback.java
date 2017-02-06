package com.archer.amaterasuplus.io.callback;

import com.archer.amaterasuplus.domain.Notification;

import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public interface NotificationSearchServerCallback extends ServerCallback {
    void onNotificationsFound(List<Notification> notifications);

    void onFailedSearch();
}
