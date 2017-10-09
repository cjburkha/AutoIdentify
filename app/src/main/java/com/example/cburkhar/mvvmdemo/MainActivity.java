package com.example.cburkhar.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cburkhar.mvvmdemo.controllers.PictureService;
import com.example.cburkhar.mvvmdemo.databinding.ActivityMainBinding;
import com.example.cburkhar.mvvmdemo.models.PictureInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflate binding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //PictureInfo pic = new PictureInfo("Tom", 15);
        PictureService pService = new PictureService();
        binding.setPicService(pService);

        //setContentView(R.layout.activity_main);
    }
}
