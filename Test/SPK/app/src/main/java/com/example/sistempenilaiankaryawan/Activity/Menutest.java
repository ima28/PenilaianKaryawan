package com.example.sistempenilaiankaryawan.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sistempenilaiankaryawan.R;

public class Menutest extends AppCompatActivity {
  //  CardView nilai;
  //  CardView hsl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        //nilai = findViewById(R.id.menilai);
        //hsl = findViewById(R.id.hasilnya);

       /* nilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menutest.this, Penilai.class));

            }
        });


        hsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menutest.this, Hasilnya.class));
            }
        });

        */

    }
}