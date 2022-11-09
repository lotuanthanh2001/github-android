package com.example.githubandroid.bai32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

import com.example.githubandroid.R;

public class Bai32Activity extends AppCompatActivity {
    SeekBar skSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai32);
        skSound= (SeekBar) findViewById(R.id.seekBarSound);
        skSound.getProgress();
        skSound.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("AAA", "gia tri:"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Start");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Stop");
            }
        });
    }
}