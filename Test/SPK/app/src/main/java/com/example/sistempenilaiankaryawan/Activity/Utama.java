package com.example.sistempenilaiankaryawan.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.sistempenilaiankaryawan.R;

public class Utama extends AppCompatActivity {
    CardView nilai,hsl,ttg,profile;
    ImageView menilai,hasil,info,profil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        nilai.findViewById(R.id.menilai);
        menilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent penilaii = new Intent(Utama.this, penilai.class);
                startActivity(penilaii);
            }
        });

        hsl.findViewById(R.id.hasilnya);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hasill = new Intent(Utama.this, hasilnya.class);
                startActivity(hasill);
            }
        });

        ttg.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inpoo = new Intent(Utama.this, inpo.class);
                startActivity(inpoo);
            }
        });

        profile.findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profilee = new Intent(Utama.this, com.example.sistempenilaiankaryawan.Activity.profile.class);
                startActivity(profilee);
            }
        });

    }
}

