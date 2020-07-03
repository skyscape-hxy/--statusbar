package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //如果状态栏只是单纯的颜色
        StatusBarUtil.setStatusBarColor(this, Color.parseColor("#FF9800"));

        //图片
//        StatusBarUtil.setRootViewFitsSystemWindows(this, false);
//        StatusBarUtil.setTranslucentStatus(this);
    }
}