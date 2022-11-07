package com.example.githubandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.githubandroid.bai11.Bai11Activity;
import com.example.githubandroid.bai12.Bai12Activity;
import com.example.githubandroid.bai13.Bai13Activity;
import com.example.githubandroid.bai14.Bai14Activity;
import com.example.githubandroid.bai15.Bai15Activity;
import com.example.githubandroid.bai16.Bai16Activity;
import com.example.githubandroid.bai17.Bai17Activity;
import com.example.githubandroid.bai19.Bai19Activity;
import com.example.githubandroid.bai20.Bai20Activity;
import com.example.githubandroid.bai21.Bai21Activity;
import com.example.githubandroid.bai9.Bai9Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnActivity1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai9Activity.class);
                startActivity(intent);
            }
        });

        Button btn11 = findViewById(R.id.btnBai11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai11Activity.class);
                startActivity(intent);
            }
        });


        Button btn12 = findViewById(R.id.btnBai12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai12Activity.class);
                startActivity(intent);
            }
        });

        Button btn13 = findViewById(R.id.btnBai13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai13Activity.class);
                startActivity(intent);
            }
        });
        Button btn14 = findViewById(R.id.btnbai14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai14Activity.class);
                startActivity(intent);
            }
        });
        Button btn15 = findViewById(R.id.bntbai15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai15Activity.class);
                startActivity(intent);
            }
        });
        Button btn16 = findViewById(R.id.bntbai16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai16Activity.class);
                startActivity(intent);
            }
        });
        Button btn17 = findViewById(R.id.bntbai17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai17Activity.class);
                startActivity(intent);
            }
        });
        Button btn19 = findViewById(R.id.bntbai19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai19Activity.class);
                startActivity(intent);
            }
        });
        Button btn20 = findViewById(R.id.bntbai20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai20Activity.class);
                startActivity(intent);
            }
        });
        Button btn21 = findViewById(R.id.bntbai21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai21Activity.class);
                startActivity(intent);
            }
        });
    }

}
