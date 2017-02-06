package com.archer.amaterasuplus.mvp.viewmodel;

import com.archer.amaterasuplus.domain.Collection;

import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public interface TopCollectionsViewModel {
    void setupList ();
    void setupAdapter ();
    void showResults (List<Collection> results);
    void showFailSearchMessage ();
}
