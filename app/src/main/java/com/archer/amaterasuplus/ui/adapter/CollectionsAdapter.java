package com.archer.amaterasuplus.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.domain.Collection;
import com.archer.amaterasuplus.utils.Helpers;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by archer on 02-01-17.
 */

public class CollectionsAdapter extends RecyclerView.Adapter<CollectionsAdapter.CollectionViewHolder> {

    private Context CONTEXT;
    private List<Collection> collectionList;

    public CollectionsAdapter(Context CONTEXT) {
        this.CONTEXT = CONTEXT;
        this.collectionList = new ArrayList<>();
    }

    /**
     * Add item in the last index
     *
     * @param collection The item to be inserted
     */
    public void addItem(Collection collection) {
        if (collection == null)
            throw new NullPointerException("The item cannot be null");

        collectionList.add(collection);
        notifyItemInserted(getItemCount() - 1);
    }

    /**
     * Add item in determined index
     *
     * @param collection The event to be inserted
     * @param position Index for the new event
     */
    public void addItem(Collection collection, int position) {
        if (collection == null)
            throw new NullPointerException("The item cannot be null");

        if (position < getItemCount() || position > getItemCount())
            throw new IllegalArgumentException("The position must be between 0 and lastIndex + 1");

        collectionList.add(position, collection);
        notifyItemInserted(position);
    }

    /**
     * Add a bunch of items
     *
     * @param collections Collection to add
     * */
    public void addAll(List<Collection> collections) {
        if (collections == null)
            throw new NullPointerException("The items cannot be null");

        this.collectionList.addAll(collections);
        notifyItemRangeInserted(getItemCount() - 1, collections.size());
    }

    public void replace(List<Collection> posts){
        this.collectionList = posts;
        notifyDataSetChanged();
    }

    /**
     * Delete all the items
     * */
    public void clear() {
        if (!collectionList.isEmpty()) {
            collectionList.clear();
            notifyDataSetChanged();
        }
    }




    @Override
    public CollectionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(CONTEXT).inflate(R.layout.item_collection_card, parent, false);
        return new CollectionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CollectionViewHolder holder, int position) {
        Collection currentCollection = collectionList.get(position);
        holder.setImage(currentCollection.getUrlImage());
        holder.setName(currentCollection.getName());
        holder.setOwner(currentCollection.getOwner());
    }

    @Override
    public int getItemCount() {
        return collectionList.size();
    }

    class CollectionViewHolder extends RecyclerView.ViewHolder  {

        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.owner)
        TextView owner;


        CollectionViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void setImage (String imageUrl) {
            Glide.with(CONTEXT).load(imageUrl).into(image);
        }

        void setName (String name) {
            this.name.setText(Helpers.cutText(name, 20));
        }

        void setOwner (String owner) {
            this.owner.setText(Helpers.cutText(owner, 20));
        }
    }

}


































