package com.example.sistempenilaiankaryawan.View;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistempenilaiankaryawan.Adapter.AdapterPenilai;
import com.example.sistempenilaiankaryawan.Model.Nilai;
import com.example.sistempenilaiankaryawan.R;

import java.util.ArrayList;
import java.util.List;

public class LayoutRv extends AppCompatActivity {
    private List<Nilai>nilaiList;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private AdapterPenilai adapterPenilai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penilaian);

        nilaiList = new ArrayList<>();
        nilaiList.add(new Nilai("email","password"));
        nilaiList.add(new Nilai("email","password"));
        nilaiList.add(new Nilai("email","password"));
        nilaiList.add(new Nilai("email","password"));

        //recyclerView.findViewById(R.id.);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        adapterPenilai = new AdapterPenilai(nilaiList,LayoutRv.this);

        recyclerView.setAdapter(adapterPenilai);

    }

}
