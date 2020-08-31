package com.example.sistempenilaiankaryawan.View;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistempenilaiankaryawan.Adapter.AdapterPenilai;
import com.example.sistempenilaiankaryawan.Model.Login;
import com.example.sistempenilaiankaryawan.R;

import java.util.ArrayList;
import java.util.List;

public class LayoutRv extends AppCompatActivity {
    private List<Login> loginList;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private AdapterPenilai adapterPenilai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penilaian);

        loginList = new ArrayList<>();
        loginList.add(new Login("email","password"));
        loginList.add(new Login("email","password"));
        loginList.add(new Login("email","password"));
        loginList.add(new Login("email","password"));

        //recyclerView.findViewById(R.id.);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        //adapterPenilai = new AdapterPenilai(loginList,LayoutRv.this);

        recyclerView.setAdapter(adapterPenilai);

    }

}
