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
    Button btnlogin;
    SharedPreferencesLogin sharedPreferencesLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtpss = (EditText) findViewById(R.id.edtpss);

        sharedPreferencesLogin = new SharedPreferencesLogin(Home.this);

        btnlogin = (Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = edtemail.getText().toString();
                String Pass = edtpss.getText().toString();
                Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
                sharedPreferencesLogin.setemail(sharedPreferencesLogin.Email, Email);
                sharedPreferencesLogin.setpasswod(sharedPreferencesLogin.Pass, Pass);
                sharedPreferencesLogin.setsudahLogin(sharedPreferencesLogin.Sudah_Login, true);

               startActivity(new Intent(Home.this, Utama.class));
               finish();

                //addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));


            }
        });


    }

}