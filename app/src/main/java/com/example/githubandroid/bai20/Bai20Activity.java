package com.example.githubandroid.bai20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.githubandroid.R;

import java.util.Random;

public class Bai20Activity extends AppCompatActivity {
    TextView txtNumber;
    Button btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai20);
        txtNumber =(TextView) findViewById(R.id.textViewNumber);
        btnRandom=(Button) findViewById(R.id.buttonRandom);
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt();
                txtNumber.setText(number+"");
            }
        });
    }
}