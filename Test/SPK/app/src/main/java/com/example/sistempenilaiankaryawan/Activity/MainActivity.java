package com.example.sistempenilaiankaryawan.Activity;


import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistempenilaiankaryawan.R;

public class MainActivity extends AppCompatActivity {
    private int load=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home=new Intent(MainActivity.this, Home.class);
                startActivity(home);

            }
        },load);
    }
}