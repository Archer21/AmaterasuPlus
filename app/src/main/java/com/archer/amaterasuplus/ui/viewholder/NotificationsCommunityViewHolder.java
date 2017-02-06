package com.archer.amaterasuplus.ui.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.domain.Notification;
import com.archer.amaterasuplus.domain.Post;
import com.archer.amaterasuplus.utils.Helpers;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by alanaliaga on 4/1/17.
 */

public class NotificationsCommunityViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.image)
    CircleImageView image;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.last_publish)
    TextView lastPublish;

    public NotificationsCommunityViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setImage (Context context, String urlImage) {
        Glide.with(context).load(urlImage).into(image);
    }

    public void setName (String name ) {
        Helpers.cutText(name, 20);
    }

    public void setLastPublish (List<Post> lastPublish) {
        int size = lastPublish.size();
        Post last = lastPublish.get(0);

        if (size > 5) {
            this.lastPublish.setText(String.valueOf(last.getUsername() + " y muchas personas mas publicaron"));
        } else {
            this.lastPublish.setText(String.valueOf(last.getUsername() + " y " + size + " personas mas publicaron"));
        }
    }
}




























