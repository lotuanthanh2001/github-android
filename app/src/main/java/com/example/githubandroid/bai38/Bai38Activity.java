package com.example.githubandroid.bai38;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.githubandroid.R;

public class Bai38Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai38);
        SinhVien sinhVien=new SinhVien("lo tuan thanh","thai nguyen",2001);
//        sinhVien.HoTen="lo tuan thanh ";
//        sinhVien.DiaChi="thai nguyen";
////        sinhVien.Namsinh=2001;
//        sinhVien.SetNamSinh(2001);
        Toast.makeText(this,sinhVien.getHoTen(), Toast.LENGTH_SHORT).show();
    }
}