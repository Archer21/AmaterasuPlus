package com.archer.amaterasuplus.mvp.viewmodel;

import com.archer.amaterasuplus.domain.Community;

import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public interface RecommendedCommunitiesViewModel {
    void setupList ();
    void setupAdapter ();
    void showResults (List<Community> results);
    void showFailSearchMessage ();
}
