package com.archer.amaterasuplus.io.callback;

import com.archer.amaterasuplus.domain.Collection;

import java.util.List;

/**
 * Created by archer on 04-01-17.
 * Main callback to communicate search results to {@link com.archer.amaterasuplus.mvp.presenter.TopCollectionsPresenter}
 */

public interface CollectionSearchServerCallback extends ServerCallback {
    void onCollectionsFound(List<Collection> collections);

    void onFailedSearch();
}
