package com.example.githubandroid.bai30;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.githubandroid.R;
import com.example.githubandroid.bai29.Bai29Activity;

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
                CountDownTimer countDownTimer=new CountDownTimer(10000,500) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int curren = pbxuly.getProgress();
                        if (curren>=pbxuly.getMax()){
                            curren=0;
                        }
                        pbxuly.setProgress(curren+10);


                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(Bai30Activity.this,"downland thanh cong",Toast.LENGTH_SHORT).show();

                    }
                };
                countDownTimer.start();
            }
        });
    }
}