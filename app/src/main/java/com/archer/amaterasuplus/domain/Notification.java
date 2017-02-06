package com.archer.amaterasuplus.domain;

import java.util.List;

/**
 * Created by alanaliaga on 4/1/17.
 */

public class Notification {
    private String name;
    private List<Post> publishBy;
    private String urlImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPublishBy() {
        return publishBy;
    }

    public void setPublishBy(List<Post> publish_by) {
        this.publishBy = publish_by;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}



























