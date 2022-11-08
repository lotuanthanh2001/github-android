package com.example.githubandroid.bai30;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.githubandroid.R;

public class Bai30Activity extends AppCompatActivity {
    Button bntDownland;
    ProgressBar pbxuly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai30);
        bntDownland=(Button) findViewById(R.id.buttondownload);
        pbxuly=(ProgressBar) findViewById(R.id.progressBarxuly);
        bntDownland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int curren = pbxuly.getProgress();
                 if (curren>=pbxuly.getMax()){
                     curren=0;
                 }
                 pbxuly.setProgress(curren+10);
            }
        });
    }
}