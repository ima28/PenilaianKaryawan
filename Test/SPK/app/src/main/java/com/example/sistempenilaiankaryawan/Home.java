package com.example.sistempenilaiankaryawan;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    EditText edtemail,edtpss;
    Button btnlogin;
    SharedPreferencesLogin Share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtpss = (EditText) findViewById(R.id.edtpss);

        Share = SharedPreferencesLogin.getInstance(getApplicationContext());

        btnlogin = (Button) findViewById(R.id.btnlogin);
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