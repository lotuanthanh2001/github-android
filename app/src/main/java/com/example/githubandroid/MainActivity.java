package com.example.githubandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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
import com.example.githubandroid.bai23.Bai23Activity;
import com.example.githubandroid.bai26.Bai26Activity;
import com.example.githubandroid.bai27.Bai27Activity;
import com.example.githubandroid.bai28.Bai28Activity;
import com.example.githubandroid.bai29.Bai29Activity;
import com.example.githubandroid.bai30.Bai30Activity;
import com.example.githubandroid.bai32.Bai32Activity;
import com.example.githubandroid.bai33.Bai33Activity;
import com.example.githubandroid.bai38.Bai38Activity;
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
        Button btn16 = findViewById(R.id.btnbai16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai16Activity.class);
                startActivity(intent);
            }
        });
        Button btn17 = findViewById(R.id.btnbai17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai17Activity.class);
                startActivity(intent);
            }
        });
        Button btn19 = findViewById(R.id.btnbai19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai19Activity.class);
                startActivity(intent);
            }
        });
        Button btn20 = findViewById(R.id.btnbai20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai20Activity.class);
                startActivity(intent);
            }
        });
        Button btn21 = findViewById(R.id.btnbai21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai21Activity.class);
                startActivity(intent);
            }
        });
        Button btn23 = findViewById(R.id.btnbai23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai23Activity.class);
                startActivity(intent);
            }
        });
        Button btn26 = findViewById(R.id.btnbai26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai26Activity.class);
                startActivity(intent);
            }
        });
        Button btn27= findViewById(R.id.btnbai27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai27Activity.class);
                startActivity(intent);
            }
        });
        Button btn28= findViewById(R.id.btnbai28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bai28Activity.class);
                startActivity(intent);
            }
        });
        Button btn29= findViewById(R.id.btnbai29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai29Activity.class);
                startActivity(intent);
            }
        });
        Button btn30= findViewById(R.id.btnbai30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai30Activity.class);
                startActivity(intent);
            }
        });
        Button btn32= findViewById(R.id.btnbai32);
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai32Activity.class);
                startActivity(intent);
            }
        });
        Button btn33= findViewById(R.id.bntbai33);
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai33Activity.class);
                startActivity(intent);
            }
        });
        Button btn38= findViewById(R.id.btnbai38);
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai38Activity.class);
                startActivity(intent);
            }
        });
        Button btnRLV= findViewById(R.id.btnRecyclerView);
        btnRLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewgi.class);
                startActivity(intent);
            }
        });



    }

}
