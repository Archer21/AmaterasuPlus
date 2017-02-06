package com.archer.amaterasuplus.ui.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.utils.Helpers;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by archer on 03-01-17.
 */

public class RecommendedCommunitiesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.owner)
    TextView owner;


    public RecommendedCommunitiesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setImage (Context context, String urlImage) {
        Glide.with(context).load(urlImage).into(image);
    }

    public void setName (String name) {
        Helpers.cutText(name, 20);
    }

    public void setOwner (String owner) {
        Helpers.cutText(owner, 20);
    }

}











































