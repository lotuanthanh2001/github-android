package com.example.githubandroid.bai33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.githubandroid.R;

import java.util.Random;

public class Bai33Activity extends AppCompatActivity {
    TextView txtDiem;
    ImageButton ibtnPlay;
    CheckBox cbOne,cbTwo,cbThree;
    SeekBar skOne,skTwo,skThree;
    int soDiem=100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai33);
        AnhXa();
        skOne.setEnabled(false);
        skTwo.setEnabled(false);
        skThree.setEnabled(false);
        txtDiem.setText(soDiem+"");
        CountDownTimer countDownTimer=new CountDownTimer(60000 ,300) {
            @Override
            public void onTick(long millisUntilFinished) {
                int number=5;
                Random random= new Random();
                int One=random.nextInt(number);
                int Twu=random.nextInt(number);
                int Three=random.nextInt(number);
                if(skOne.getProgress()>=skOne.getMax()){
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(Bai33Activity.this,"nguoi so 1 win",Toast.LENGTH_SHORT).show();
                    if (cbOne.isChecked()){
                        soDiem+=10;
                        Toast.makeText(Bai33Activity.this, "chuc mung ban da thang", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem-=5;
                        Toast.makeText(Bai33Activity.this, "ban doan sai", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                    Enablecheckbox();
                }
                if(skTwo.getProgress()>=skTwo.getMax()){
                    this.cancel();
                    ibtnPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(Bai33Activity.this,"nguoi so 2 win",Toast.LENGTH_SHORT).show();
                    if (cbTwo.isChecked()){
                        soDiem+=10;
                        Toast.makeText(Bai33Activity.this, "chuc mung ban da thang", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem-=5;
                        Toast.makeText(Bai33Activity.this, "ban doan sai", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                    Enablecheckbox();
                }
                if ((skThree.getProgress()>=skThree.getMax())){
                    ibtnPlay.setVisibility(View.VISIBLE);
                    this.cancel();
                    Toast.makeText(Bai33Activity.this,"nguoi so 3 win",Toast.LENGTH_SHORT).show();
                    if (cbThree.isChecked()){
                        soDiem+=10;
                        Toast.makeText(Bai33Activity.this, "chuc mung ban da thang", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem-=5;
                        Toast.makeText(Bai33Activity.this, "ban doan sai", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                    Enablecheckbox();

                }
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
                if (cbOne.isChecked() || cbTwo.isChecked() || cbThree.isChecked()) {
                    skOne.setProgress(0);
                    skTwo.setProgress(0);
                    skThree.setProgress(0);

                    ibtnPlay.setVisibility(View.INVISIBLE);
                    Disablecheckbox();
                    countDownTimer.start();
                }else {
                    Toast.makeText(Bai33Activity.this,"vui long dat cuoc truoc khi choi",Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbTwo.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbOne.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbOne.setChecked(false);
                    cbTwo.setChecked(false);
                }
            }
        });
    }
    private void Enablecheckbox(){
        cbOne.setEnabled(true);
        cbTwo.setEnabled(true);
        cbThree.setEnabled(true);
    }
    private void Disablecheckbox(){
        cbOne.setEnabled(false);
        cbTwo.setEnabled(false);
        cbThree.setEnabled(false);
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