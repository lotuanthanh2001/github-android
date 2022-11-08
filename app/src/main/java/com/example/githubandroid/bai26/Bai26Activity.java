package com.example.githubandroid.bai26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.githubandroid.R;

import java.util.ArrayList;
import java.util.Random;

public class Bai26Activity extends AppCompatActivity {
    LinearLayout linearLayout;
    ArrayList<Integer> arrayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai26);
        linearLayout =(LinearLayout) findViewById(R.id.myLinearLayout);
        arrayImage=new ArrayList<>();
        arrayImage.add(R.drawable.minhinh1);
        arrayImage.add(R.drawable.manhinh2);
        arrayImage.add(R.drawable.manhinh3);
        Random random=new Random();
        int location =random.nextInt(arrayImage.size());
        linearLayout.setBackgroundResource(arrayImage.get(location));

    }
}