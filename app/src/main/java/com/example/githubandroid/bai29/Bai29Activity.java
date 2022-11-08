package com.example.githubandroid.bai29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.githubandroid.R;

public class Bai29Activity extends AppCompatActivity {
    RadioGroup radioGrouptime;
    RadioButton rdshinning,rdafternoon,rddark;
    Button buttonxacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai29);

        radioGrouptime =(RadioGroup) findViewById(R.id.radioGroupthoigian);
        buttonxacnhan=(Button)findViewById(R.id.btnxacnhanradio);
        rdshinning =(RadioButton)findViewById(R.id.radioButtonshining);
        rdafternoon=(RadioButton)findViewById(R.id.radioButtonafternoon);
        rddark=(RadioButton)findViewById(R.id.radioButtondark);



        buttonxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(rdshinning.isChecked()){
            Toast.makeText(Bai29Activity.this,rdshinning.getText(), Toast.LENGTH_SHORT).show();
            }
            if (rdafternoon.isChecked()){
                Toast.makeText(Bai29Activity.this,rdafternoon.getText(),Toast.LENGTH_SHORT).show();
            }
            if (rddark.isChecked()){
                Toast.makeText(Bai29Activity.this,rddark.getText(),Toast.LENGTH_SHORT).show();
            }
            }
        });
        radioGrouptime.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonshining:
                        Toast.makeText(Bai29Activity.this,"ban chon shining",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtonafternoon:
                        Toast.makeText(Bai29Activity.this,"ban chon afternoon",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtondark:
                        Toast.makeText(Bai29Activity.this,"ban chon dark",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}