package com.example.cburkhar.mvvmdemo.models;

import android.databinding.Bindable;
import android.databinding.BaseObservable;

/**
 * Created by cburkhar on 9/5/2017.
 */

public class PictureInfo extends BaseObservable {

    public PictureInfo() {

        this("Chris", 17);
    }

    public PictureInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;
    String name;

}
