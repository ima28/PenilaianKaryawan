package com.example.sistempenilaiankaryawan.Activity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.sistempenilaiankaryawan.R;

public class Home extends AppCompatActivity {
    EditText edtemail,edtpss;
    ImageButton btnlogin;
    SharedPreferencesLogin Share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtpss = (EditText) findViewById(R.id.edtpss);

        Share = SharedPreferencesLogin.getInstance(getApplicationContext());

        btnlogin = (ImageButton) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = edtemail.getText().toString();
                String Pass = edtpss.getText().toString();
                Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
                Share.setLogin(true);
                Share.setEmail(Email);
                Share.setPass(Pass);

                finish();
                startActivity(new Intent(Home.this, Utama.class));
            }
        });

    }
}