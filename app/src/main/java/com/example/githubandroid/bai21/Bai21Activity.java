
package com.example.githubandroid.bai21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.githubandroid.R;

import java.util.Random;

public class Bai21Activity extends AppCompatActivity {
    TextView txtNumber;
    EditText edtNumber1;
    EditText edtNumber2;
    Button btnRandom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai21);
        txtNumber =(TextView) findViewById(R.id.textViewNumber);
        btnRandom=(Button) findViewById(R.id.buttonRandom);
        edtNumber1=(EditText) findViewById(R.id.editTextTextNunber1);
        edtNumber2=(EditText)findViewById(R.id.editTextTextNunber2);
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 =edtNumber1.getText().toString().trim();
                String chuoi2 = edtNumber2.getText().toString().trim();
                if(chuoi1.length()==0||chuoi2.length()==0) {
                    Toast.makeText(Bai21Activity.this,"vui long nhap dung",Toast.LENGTH_SHORT).show();
                }else {
//                ép chuỗi
                    int min = Integer.parseInt(chuoi1);
                    int max = Integer.parseInt(chuoi2);
                    Random random = new Random();
                    int number = random.nextInt(max - min + 1) + min;
                    txtNumber.setText(String.valueOf(number));//number+""
                }
            }
        });
    }
}