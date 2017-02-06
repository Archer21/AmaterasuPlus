package com.archer.amaterasuplus.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.domain.Community;
import com.archer.amaterasuplus.ui.viewholder.MemberCommunityViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archer on 03-01-17.
 */

public class MemberCommunityAdapter extends RecyclerView.Adapter<MemberCommunityViewHolder> {

    private Context CONTEXT;
    private List<Community> communityList;

    public MemberCommunityAdapter(Context CONTEXT) {
        this.CONTEXT = CONTEXT;
        this.communityList = new ArrayList<>();
    }

    /**
     * Add item in the last index
     *
     * @param community The item to be inserted
     */
    public void addItem(Community community) {
        if (community == null)
            throw new NullPointerException("The item cannot be null");

        communityList.add(community);
        notifyItemInserted(getItemCount() - 1);
    }

    /**
     * Add item in determined index
     *
     * @param community The event to be inserted
     * @param position Index for the new event
     */
    public void addItem(Community community, int position) {
        if (community == null)
            throw new NullPointerException("The item cannot be null");

        if (position < getItemCount() || position > getItemCount())
            throw new IllegalArgumentException("The position must be between 0 and lastIndex + 1");

        communityList.add(position, community);
        notifyItemInserted(position);
    }

    /**
     * Add a bunch of items
     *
     * @param communities Collection to add
     * */
    public void addAll(List<Community> communities) {
        if (communities == null)
            throw new NullPointerException("The items cannot be null");

        this.communityList.addAll(communities);
        notifyItemRangeInserted(getItemCount() - 1, communities.size());
    }

    public void replace(List<Community> communities){
        this.communityList = communities;
        notifyDataSetChanged();
    }

    /**
     * Delete all the items
     * */
    public void clear() {
        if (!communityList.isEmpty()) {
            communityList.clear();
            notifyDataSetChanged();
        }
    }

    @Override
    public MemberCommunityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(CONTEXT).inflate(R.layout.item_member_community_card, parent, false);
        return new MemberCommunityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MemberCommunityViewHolder holder, int position) {
        Community currentCommunity = communityList.get(position);
        holder.setImage(CONTEXT, currentCommunity.getUrlImage());
        holder.setName(currentCommunity.getName());
        holder.setMembers(currentCommunity.getMembers());
    }

    @Override
    public int getItemCount() {
        return communityList.size();
    }

}
























