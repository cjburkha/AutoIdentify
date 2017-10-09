package com.example.cburkhar.mvvmdemo.controllers;

import com.example.cburkhar.mvvmdemo.models.PictureInfo;

/**
 * Created by cburkhar on 9/7/2017.
 */

public class PictureService {
    PictureInfo pictureInfo;
    String bindableName;

    public String getBindableName() {
        return bindableName;
    }

    public void setBindableName(String bindableName) {
        this.bindableName = bindableName;
    }

    public PictureService() {
        this.pictureInfo = new PictureInfo("Service", 22);
        this.bindableName = pictureInfo.getName();
    }

}
