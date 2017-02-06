package com.archer.amaterasuplus.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.common.BaseFragment;
import com.archer.amaterasuplus.common.BasePresenter;
import com.archer.amaterasuplus.domain.Community;
import com.archer.amaterasuplus.ui.adapter.MemberCommunityAdapter;
import com.archer.amaterasuplus.utils.ItemOffsetDecorator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MemberCommunitiesFragment extends BaseFragment {

    private static final int NUM_COLS = 2;
    @BindView(R.id.member_communities_recycler_view)
    RecyclerView recyclerView;

    private MemberCommunityAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new MemberCommunityAdapter(CONTEXT);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecyclerList();
        setupDummieContent();
    }


    /**
     * Dummie Data
     */

    private void setupRecyclerList () {
        GridLayoutManager layoutManager= new GridLayoutManager(CONTEXT, NUM_COLS);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new ItemOffsetDecorator(CONTEXT, R.integer.community_offset));
        recyclerView.setAdapter(adapter);
    }

    private void setupDummieContent () {
        List<Community> collectionlist = new ArrayList<>();
        Community collection1 = new Community();
        collection1.setName("Cosplay");
        collection1.setMembers(1359);
        collection1.setUrlImage("https://lh3.googleusercontent.com/N_qV3HfqMo-7hFr0It4rrUxvS_ZMas4r7R9B5N3DVFsRh-w5WGELlRr8XdIeywWHM1_ek6FismU=w320-h180-p");

        Community collection2 = new Community();
        collection2.setName("Fan-art's, imágenes, photos");
        collection2.setMembers(8962);
        collection2.setUrlImage("https://lh3.googleusercontent.com/gyLEaugWRlHU_c8K8HyEDb3Ok7OacqbSKH5oTl6u4AyrfDo5CZVpaWG953-xVl5-dWKS6zJV=w320-h180-p");

        Community collection3 = new Community();
        collection3.setName("Final Fantasy");
        collection3.setMembers(3545);
        collection3.setUrlImage("https://lh3.googleusercontent.com/TBu_oUmIHW_zGWhhg-GGFPuwZnKkm3G9wsxUDAGq8dU=w320-h180-p");

        Community collection4 = new Community();
        collection4.setName("Cosplay Plus");
        collection4.setMembers(7892);
        collection4.setUrlImage("https://lh3.googleusercontent.com/g7qwT5oYtkSNzrUwPY8aXQDRiPJHSa5t8qdVtSk9ol_C=w320-h180-p");

        collectionlist.add(collection3);
        collectionlist.add(collection2);
        collectionlist.add(collection4);
        collectionlist.add(collection1);
        collectionlist.add(collection4);
        collectionlist.add(collection3);
        adapter.addAll(collectionlist);
    }



    /**
     * Overrided methods from BaseFragment
     */
    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_member_communities;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }
}


































