package com.example.githubandroid.bai33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.githubandroid.R;

import java.util.Random;

public class Bai33Activity extends AppCompatActivity {
    TextView txtDiem;
    ImageButton ibtnPlay;
    CheckBox cbOne,cbTwo,cbThree;
    SeekBar skOne,skTwo,skThree;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai33);
        AnhXa();
        CountDownTimer countDownTimer=new CountDownTimer(60000 ,300) {
            @Override
            public void onTick(long millisUntilFinished) {
                int number=5;
                Random random= new Random();
                int One=random.nextInt(number);
                int Twu=random.nextInt(number);
                int Three=random.nextInt(number);

                skOne.setProgress(skOne.getProgress() + One);
                skTwo.setProgress(skTwo.getProgress() + Twu);
                skThree.setProgress(skThree.getProgress() + Three);


            }

            @Override
            public void onFinish() {

            }
        };
        ibtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ibtnPlay.setVisibility(View.INVISIBLE);
                countDownTimer.start();
            }
        });
    }
        private void AnhXa(){
            txtDiem  =(TextView) findViewById(R.id.textviewdDiemso);
            ibtnPlay=( ImageButton) findViewById(R.id.buttonPlay);
            cbOne=(CheckBox) findViewById(R.id.checkboxOne);
            cbTwo=(CheckBox) findViewById(R.id.checkboxTwo);
            cbThree=(CheckBox) findViewById(R.id.checkboxthree);
            skOne=(SeekBar) findViewById(R.id.seekbarOne);
            skTwo=(SeekBar) findViewById(R.id.seekbartwo);
            skThree=(SeekBar) findViewById(R.id.seekbarThree);





    }
}