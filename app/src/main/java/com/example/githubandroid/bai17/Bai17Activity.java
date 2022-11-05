package com.example.githubandroid.bai17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.githubandroid.R;

public class Bai17Activity extends AppCompatActivity {
    TextView textView20;
    Button bntclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai17);
        textView20 = (TextView) findViewById(R.id.textView20);
        bntclick =(Button) findViewById(R.id.bntclick );
        textView20.setText("lap trinh android");
        bntclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView20.setText("lap trinh android");
            }
        });
    }
}