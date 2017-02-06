package com.archer.amaterasuplus.io.callback;

/**
 * Created by archer on 04-01-17.
 * To simplified the communication between interactor and presenter will be custom callbacks that contains
 * only data needed from presenter.
 */

public interface ServerCallback {
    void onNetworkError();
    void onServerError();
}
