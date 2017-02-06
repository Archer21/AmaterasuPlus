package com.archer.amaterasuplus.mvp.repository;

import com.archer.amaterasuplus.domain.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archer on 07-01-17.
 */

public class CollectionRepository {
    public List<Collection> fetchTopCollections () {
        List<Collection> collectionlist = new ArrayList<>();
        Collection collection1 = new Collection();
        collection1.setName("Cosplay");
        collection1.setOwner("Mr. Hayabusa");
        collection1.setUrlImage("https://lh3.googleusercontent.com/N_qV3HfqMo-7hFr0It4rrUxvS_ZMas4r7R9B5N3DVFsRh-w5WGELlRr8XdIeywWHM1_ek6FismU=w320-h180-p");
        collection1.setFollowing(true);

        Collection collection2 = new Collection();
        collection2.setName("Fan-art's, imágenes, photos");
        collection2.setOwner("Igor Spopovich");
        collection2.setUrlImage("https://lh3.googleusercontent.com/gyLEaugWRlHU_c8K8HyEDb3Ok7OacqbSKH5oTl6u4AyrfDo5CZVpaWG953-xVl5-dWKS6zJV=w320-h180-p");
        collection2.setFollowing(false);

        Collection collection3 = new Collection();
        collection3.setName("Final Fantasy");
        collection3.setOwner("Oni Tsukuyomi");
        collection3.setUrlImage("https://lh3.googleusercontent.com/TBu_oUmIHW_zGWhhg-GGFPuwZnKkm3G9wsxUDAGq8dU=w320-h180-p");
        collection3.setFollowing(false);

        Collection collection4 = new Collection();
        collection4.setName("Cosplay Plus");
        collection4.setOwner("Kyuubey Kurei-sama Kazama for you");
        collection4.setUrlImage("https://lh3.googleusercontent.com/g7qwT5oYtkSNzrUwPY8aXQDRiPJHSa5t8qdVtSk9ol_C=w320-h180-p");
        collection4.setFollowing(true);

        collectionlist.add(collection1);
        collectionlist.add(collection2);
        collectionlist.add(collection3);
        collectionlist.add(collection4);
        collectionlist.add(collection1);
        collectionlist.add(collection2);
        collectionlist.add(collection3);
        collectionlist.add(collection4);

        return collectionlist;
    }

    public List<Collection> fetchFollowingCollections () {
        List<Collection> collectionlist = new ArrayList<>();
        Collection collection1 = new Collection();
        collection1.setName("Cosplay");
        collection1.setOwner("Mr. Hayabusa");
        collection1.setUrlImage("https://lh3.googleusercontent.com/N_qV3HfqMo-7hFr0It4rrUxvS_ZMas4r7R9B5N3DVFsRh-w5WGELlRr8XdIeywWHM1_ek6FismU=w320-h180-p");
        collection1.setFollowing(true);

        Collection collection2 = new Collection();
        collection2.setName("Fan-art's, imágenes, photos");
        collection2.setOwner("Igor Spopovich");
        collection2.setUrlImage("https://lh3.googleusercontent.com/gyLEaugWRlHU_c8K8HyEDb3Ok7OacqbSKH5oTl6u4AyrfDo5CZVpaWG953-xVl5-dWKS6zJV=w320-h180-p");
        collection2.setFollowing(false);

        Collection collection3 = new Collection();
        collection3.setName("Final Fantasy");
        collection3.setOwner("Oni Tsukuyomi");
        collection3.setUrlImage("https://lh3.googleusercontent.com/TBu_oUmIHW_zGWhhg-GGFPuwZnKkm3G9wsxUDAGq8dU=w320-h180-p");
        collection3.setFollowing(false);

        Collection collection4 = new Collection();
        collection4.setName("Cosplay Plus");
        collection4.setOwner("Kyuubey Kurei-sama Kazama for you");
        collection4.setUrlImage("https://lh3.googleusercontent.com/g7qwT5oYtkSNzrUwPY8aXQDRiPJHSa5t8qdVtSk9ol_C=w320-h180-p");
        collection4.setFollowing(true);

        collectionlist.add(collection3);
        collectionlist.add(collection2);
        collectionlist.add(collection4);
        collectionlist.add(collection1);
        collectionlist.add(collection4);
        collectionlist.add(collection3);

        return collectionlist;
    }

    public List<Collection> fetchUserCollections () {
        List<Collection> collectionlist = new ArrayList<>();
        Collection collection1 = new Collection();
        collection1.setName("Cosplay");
        collection1.setOwner("Mr. Hayabusa");
        collection1.setUrlImage("https://lh3.googleusercontent.com/N_qV3HfqMo-7hFr0It4rrUxvS_ZMas4r7R9B5N3DVFsRh-w5WGELlRr8XdIeywWHM1_ek6FismU=w320-h180-p");
        collection1.setFollowing(true);

        Collection collection2 = new Collection();
        collection2.setName("Fan-art's, imágenes, photos");
        collection2.setOwner("Igor Spopovich");
        collection2.setUrlImage("https://lh3.googleusercontent.com/gyLEaugWRlHU_c8K8HyEDb3Ok7OacqbSKH5oTl6u4AyrfDo5CZVpaWG953-xVl5-dWKS6zJV=w320-h180-p");
        collection2.setFollowing(false);

        Collection collection3 = new Collection();
        collection3.setName("Final Fantasy");
        collection3.setOwner("Oni Tsukuyomi");
        collection3.setUrlImage("https://lh3.googleusercontent.com/TBu_oUmIHW_zGWhhg-GGFPuwZnKkm3G9wsxUDAGq8dU=w320-h180-p");
        collection3.setFollowing(false);

        Collection collection4 = new Collection();
        collection4.setName("Cosplay Plus");
        collection4.setOwner("Kyuubey Kurei-sama Kazama for you");
        collection4.setUrlImage("https://lh3.googleusercontent.com/g7qwT5oYtkSNzrUwPY8aXQDRiPJHSa5t8qdVtSk9ol_C=w320-h180-p");
        collection4.setFollowing(true);

        collectionlist.add(collection3);
        collectionlist.add(collection1);
        collectionlist.add(collection4);
        collectionlist.add(collection3);
        collectionlist.add(collection2);
        collectionlist.add(collection4);

        return collectionlist;
    }
}
