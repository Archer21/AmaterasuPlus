package com.archer.amaterasuplus.mvp.interactor;

import com.archer.amaterasuplus.domain.Community;
import com.archer.amaterasuplus.mvp.presenter.RecommendedCommunitiesPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archer on 04-01-17.
 */

public class CommunityInteractor {
    private RecommendedCommunitiesPresenter presenter;

    public CommunityInteractor(RecommendedCommunitiesPresenter presenter) {
        this.presenter = presenter;
    }

    /**
     * Fetch dummie data for development
     */
    public void fetchRecommendedCommunities() {
        List<Community> collectionlist = new ArrayList<>();
        Community collection1 = new Community();
        collection1.setName("Cosplay");
        collection1.setOwner("Mr. Hayabusa");
        collection1.setUrlImage("https://lh3.googleusercontent.com/N_qV3HfqMo-7hFr0It4rrUxvS_ZMas4r7R9B5N3DVFsRh-w5WGELlRr8XdIeywWHM1_ek6FismU=w320-h180-p");

        Community collection2 = new Community();
        collection2.setName("Fan-art's, imágenes, photos");
        collection2.setOwner("Igor Spopovich");
        collection2.setUrlImage("https://lh3.googleusercontent.com/gyLEaugWRlHU_c8K8HyEDb3Ok7OacqbSKH5oTl6u4AyrfDo5CZVpaWG953-xVl5-dWKS6zJV=w320-h180-p");

        Community collection3 = new Community();
        collection3.setName("Final Fantasy");
        collection3.setOwner("Oni Tsukuyomi");
        collection3.setUrlImage("https://lh3.googleusercontent.com/TBu_oUmIHW_zGWhhg-GGFPuwZnKkm3G9wsxUDAGq8dU=w320-h180-p");

        Community collection4 = new Community();
        collection4.setName("Cosplay Plus");
        collection4.setOwner("Kyuubey Kurei-sama Kazama for you");
        collection4.setUrlImage("https://lh3.googleusercontent.com/g7qwT5oYtkSNzrUwPY8aXQDRiPJHSa5t8qdVtSk9ol_C=w320-h180-p");

        collectionlist.add(collection3);
        collectionlist.add(collection2);
        collectionlist.add(collection4);
        collectionlist.add(collection1);
        collectionlist.add(collection4);
        collectionlist.add(collection3);

        presenter.onFetchResults(collectionlist);
    }





    /**
     * TODO:Fetch real data from an API or some Backend.
     */

}































