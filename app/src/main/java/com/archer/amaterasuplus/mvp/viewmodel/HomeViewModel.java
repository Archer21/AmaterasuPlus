package com.archer.amaterasuplus.mvp.viewmodel;

import com.archer.amaterasuplus.domain.Post;

import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public interface HomeViewModel {
    void setupList ();
    void setupAdapter ();
    void showResults (List<Post> results);
    void showFailSearchMessage ();
    void showProgressBar ();
    void hideProgressBar ();
}
