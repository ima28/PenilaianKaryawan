package com.example.sistempenilaiankaryawan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Utama extends AppCompatActivity {
    ImageButton menilai,hasil,info,profil;

    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        menilai=(ImageButton)findViewById(R.id.menilai);
        menilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent penilaii = new Intent(Utama.this, penilai.class);
                startActivity(penilaii);
            }
        });

        hasil=(ImageButton)findViewById(R.id.hasil);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hasill = new Intent(Utama.this, hasilnya.class);
                startActivity(hasill);
            }
        });

        info=(ImageButton)findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inpoo = new Intent(Utama.this, inpo.class);
                startActivity(inpoo);
            }
        });

        profil=(ImageButton)findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profilee = new Intent(Utama.this, profile.class);
                startActivity(profilee);
            }
        });

    }
}
