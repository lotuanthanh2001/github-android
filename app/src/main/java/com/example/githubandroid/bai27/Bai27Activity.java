package com.example.githubandroid.bai27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.githubandroid.R;

public class Bai27Activity extends AppCompatActivity {
    Switch swWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai27);
         swWifi=(Switch) findViewById(R.id.switchwifi);
         swWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked){
                     Toast.makeText(Bai27Activity.this,"bat WiFi", Toast.LENGTH_SHORT ).show();

                 }else {
                     Toast.makeText(Bai27Activity.this,"ban da tat WiFi",Toast.LENGTH_SHORT).show();
                 }


             }
         });
    }
}