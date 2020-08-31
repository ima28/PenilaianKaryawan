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
        if (Share.getsudahLogin()){
            startActivity(new Intent(Home.this, Utama.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        }

        btnlogin = (ImageButton) findViewById(R.id.btnlogin);

        btnLogin();

    }

    public void btnLogin(){
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = edtemail.getText().toString();
                String Pass = edtpss.getText().toString();
                Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
               // Share.setLogin(true);
                //Share.setEmail(Email);
                //Share.setPass(Pass);
                Share.setemail(Share.Email, Email);
                Share.setpasswod(Share.Pass, Pass);
                // Shared Pref ini berfungsi untuk menjadi trigger session login
                Share.setsudahLogin(Share.Sudah_Login, true);

                startActivity(new Intent(Home.this, Utama.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                finish();

            }
        });


    }
}