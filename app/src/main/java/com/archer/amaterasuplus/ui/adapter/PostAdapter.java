package com.archer.amaterasuplus.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.domain.Post;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by archer on 31-12-16.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private Context CONTEXT;
    private int itemResource;
    private List<Post> postsList;

    public PostAdapter(Context context, int resource) {
        this.CONTEXT = context;
        this.itemResource = resource;
        this.postsList = new ArrayList<>();
    }

    /**
     * Add item in the last index
     *
     * @param post The item to be inserted
     */
    public void addItem(Post post) {
        if (post == null)
            throw new NullPointerException("The item cannot be null");

        postsList.add(post);
        notifyItemInserted(getItemCount() - 1);
    }

    /**
     * Add item in determined index
     *
     * @param post The event to be inserted
     * @param position Index for the new event
     */
    public void addItem(Post post, int position) {
        if (post == null)
            throw new NullPointerException("The item cannot be null");

        if (position < getItemCount() || position > getItemCount())
            throw new IllegalArgumentException("The position must be between 0 and lastIndex + 1");

        postsList.add(position, post);
        notifyItemInserted(position);
    }

    /**
     * Add a bunch of items
     *
     * @param posts Collection to add
     * */
    public void addAll(List<Post> posts) {
        if (posts == null)
            throw new NullPointerException("The items cannot be null");

        this.postsList.addAll(posts);
        notifyItemRangeInserted(getItemCount() - 1, posts.size());
    }

    public void replace(List<Post> posts){
        this.postsList = posts;
        notifyDataSetChanged();
    }

    /**
     * Delete all the items
     * */
    public void clear() {
        if (!postsList.isEmpty()) {
            postsList.clear();
            notifyDataSetChanged();
        }
    }


    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(CONTEXT).inflate(itemResource, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        Post currentPost = postsList.get(position);
        holder.setAvatar(currentPost.getAvatar());
        holder.setUsername(currentPost.getUsername());
        holder.setCollection(currentPost.getCollection());
        holder.setTime(currentPost.getTime());
        holder.setLikes(currentPost.getLikes());

        if (currentPost.getUrlImage() != null) {
            holder.setImage(currentPost.getUrlImage());
        }

        if (currentPost.getBody() != null) {
            holder.setBody(currentPost.getBody());
        }
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.avatar_post)
        CircleImageView avatar;
        @BindView(R.id.username_post)
        TextView username;
        @BindView(R.id.collection)
        TextView collection;
        @BindView(R.id.time_post)
        TextView time;
        @BindView(R.id.content_post)
        TextView body;
        @BindView(R.id.image_post)
        ImageView image;
        @BindView(R.id.count_plus_one)
        TextView likes;

        PostViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setAvatar (String urlAvatar) {
            Glide.with(CONTEXT).load(urlAvatar).into(avatar);
        }

        public void setUsername (String username) {
            this.username.setText(username);
        }

        public void setCollection (String collection) {
            this.collection.setText(collection);
        }

        public void setTime (String time) {
            this.time.setText(time);
        }

        public void setBody (String body) {
            int textLength = body.length();
            if (textLength > 50) {
                String subStringBody = body.substring(0, 50);
                this.body.setText(String.valueOf(subStringBody+"..."));
            } else {
                this.body.setText(body);
            }
        }

        public void setImage (String urlImage) {
            Glide.with(CONTEXT).load(urlImage).into(image);
        }

        public void setLikes (int likes) {
            this.likes.setText(String.valueOf(likes));
        }
    }
}






































