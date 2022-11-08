package com.example.githubandroid.bai28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.githubandroid.R;

public class Bai28Activity extends AppCompatActivity {
    CheckBox cbAndroid,cbIOS,cbPHP;
    Button btnxacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai28);
        Anhxa();
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monhoc="ban da chon he dieu hanh:\n";
                if(cbAndroid.isChecked()){
                    monhoc+=cbAndroid.getText()+"\n";
                }
                if(cbIOS.isChecked()){
                    monhoc+=cbIOS.getText()+"\n";
                }

                if(cbPHP.isChecked()){
                    monhoc+=cbPHP.getText()+"\n";
                }
                Toast.makeText(Bai28Activity.this,monhoc,Toast.LENGTH_SHORT).show();
            }
        });
        cbAndroid .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(Bai28Activity.this,"ban da chon andoid",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(Bai28Activity.this,"ban bo chon android",Toast.LENGTH_SHORT).show();

                }
            }
        });
        cbIOS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(Bai28Activity.this,"ban chon ios",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Bai28Activity.this,"ban bo chon ios",Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbPHP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(Bai28Activity.this,"ban chon php",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Bai28Activity.this,"ban bo chon php",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Anhxa() {
        cbAndroid=(CheckBox)  findViewById(R.id.checkBoxAndroid);
        cbIOS=(CheckBox) findViewById(R.id.checkBoxIOS);
        cbPHP=(CheckBox) findViewById(R.id.checkBoxPHP);
        btnxacnhan=(Button) findViewById(R.id.btnDangKy);



    }
}