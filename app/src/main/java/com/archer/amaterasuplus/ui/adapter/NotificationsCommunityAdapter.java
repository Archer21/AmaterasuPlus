package com.archer.amaterasuplus.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.archer.amaterasuplus.R;
import com.archer.amaterasuplus.domain.Notification;
import com.archer.amaterasuplus.ui.viewholder.NotificationsCommunityViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanaliaga on 4/1/17.
 */

public class NotificationsCommunityAdapter extends RecyclerView.Adapter<NotificationsCommunityViewHolder>{

    private Context CONTEXT;
    private List<Notification> notificationList;

    public NotificationsCommunityAdapter(Context CONTEXT) {
        this.CONTEXT = CONTEXT;
        this.notificationList = new ArrayList<>();
    }


    /**
     * Add item in the last index
     *
     * @param notification The item to be inserted
     */
    public void addItem(Notification notification) {
        if (notification == null)
            throw new NullPointerException("The item cannot be null");

        notificationList.add(notification);
        notifyItemInserted(getItemCount() - 1);
    }

    /**
     * Add item in determined index
     *
     * @param notification The event to be inserted
     * @param position Index for the new event
     */
    public void addItem(Notification notification, int position) {
        if (notification == null)
            throw new NullPointerException("The item cannot be null");

        if (position < getItemCount() || position > getItemCount())
            throw new IllegalArgumentException("The position must be between 0 and lastIndex + 1");

        notificationList.add(position, notification);
        notifyItemInserted(position);
    }

    /**
     * Add a bunch of items
     *
     * @param notifications Collection to add
     * */
    public void addAll(List<Notification> notifications) {
        if (notifications == null)
            throw new NullPointerException("The items cannot be null");

        this.notificationList.addAll(notifications);
        notifyItemRangeInserted(getItemCount() - 1, notifications.size());
    }

    public void replace(List<Notification> notifications){
        this.notificationList = notifications;
        notifyDataSetChanged();
    }

    /**
     * Delete all the items
     * */
    public void clear() {
        if (!notificationList.isEmpty()) {
            notificationList.clear();
            notifyDataSetChanged();
        }
    }


    @Override
    public NotificationsCommunityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(CONTEXT).inflate(R.layout.item_notification_community_card, parent, false);
        return new NotificationsCommunityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotificationsCommunityViewHolder holder, int position) {
        Notification currentNotification = notificationList.get(position);
        holder.setImage(CONTEXT, currentNotification.getUrlImage());
        holder.setName(currentNotification.getName());
        holder.setLastPublish(currentNotification.getPublishBy());
    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }
}
























