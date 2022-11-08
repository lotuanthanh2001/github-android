package com.example.githubandroid.bai23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.githubandroid.R;

public class Bai23Activity extends AppCompatActivity {
    ImageView imgHinh;
    RelativeLayout manhinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai23);
        manhinh= (RelativeLayout ) findViewById(R.id.manhinh);
        manhinh.setBackgroundResource(R.drawable.background_2 );
        imgHinh= (ImageView) findViewById(R.id.imageViewHinh);
        imgHinh.setImageResource(R.drawable.android_icon1);
    }
}