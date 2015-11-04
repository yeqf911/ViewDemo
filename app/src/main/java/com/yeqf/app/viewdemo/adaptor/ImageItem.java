package com.yeqf.app.viewdemo.adaptor;

import android.widget.ImageSwitcher;

import java.security.PublicKey;

/**
 * Created by yeqf on 2015/11/1.
 */
public class ImageItem {
    private int imageRes;
    private String description;

    public ImageItem(int imageRes, String description) {
        this.imageRes = imageRes;
        this.description = description;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
