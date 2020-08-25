package com.example.sistempenilaiankaryawan;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    EditText edtemail,edtpss;
    ImageButton btnlogin;
    //Intent in;

    public static  final String MyPREFERENCES = "mypre";
    public static  final String email = "emailKey";
    public static  final String pass = "passKey";
    SharedPreferencess sharedPreferencess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        edtemail=(EditText)findViewById(R.id.edtemail);
        edtpss=(EditText)findViewById(R.id.edtpss);

        btnlogin=(ImageButton)findViewById(R.id.btnlogin);
        sharedPreferencess = (SharedPreferencess) getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        btnlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String e = edtemail.getText().toString();
                String p = edtpss.getText().toString();

                SharedPreferences.Editor edi = sharedPreferencess.edit();
                edi.putString(email, e);
                edi.putString(pass, p);
                edi.commit();

                startActivity(new Intent(Home.this, Utama.class));

                Intent utama=new Intent(Home.this, Utama.class);
                startActivity(utama);

            }
        });
    }
}