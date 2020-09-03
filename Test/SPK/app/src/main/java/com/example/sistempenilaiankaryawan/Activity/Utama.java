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
    CardView nilai;
    CardView hsl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        nilai = findViewById(R.id.menilai);
        hsl = findViewById(R.id.hasilnya);

        nilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Utama.this, Penilai.class));

            }
        });


        hsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Utama.this, Hasilnya.class));
            }
        });

    }
}

