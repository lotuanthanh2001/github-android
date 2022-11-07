package com.example.githubandroid.bai19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.githubandroid.R;

public class Bai19Activity extends AppCompatActivity {


    EditText edtNoiDung;
    Button bntclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai19);
        edtNoiDung =(EditText)  findViewById((R.id .editTextName));
        bntclick =(Button) findViewById(R.id.button3);
        bntclick . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noiDung = edtNoiDung.getText().toString();
                Toast.makeText(Bai19Activity.this, noiDung,Toast.LENGTH_LONG).show();
            }
        });
    }
}