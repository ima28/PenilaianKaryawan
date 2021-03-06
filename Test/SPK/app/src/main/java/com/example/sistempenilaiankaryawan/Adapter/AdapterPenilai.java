package com.example.sistempenilaiankaryawan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistempenilaiankaryawan.Model.Nilai;
import com.example.sistempenilaiankaryawan.R;

import java.util.List;

public class AdapterPenilai extends RecyclerView.Adapter<AdapterPenilai.AdapterPenilaiChild> {
    private List<Nilai> nilaiList;
    private Context context;
    public AdapterPenilai(List<Nilai> nilaiList, Context context){
        this.nilaiList = nilaiList;
        this.context=context;

    }

    @NonNull
    @Override
    public AdapterPenilaiChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.penilaian,null);
        AdapterPenilaiChild adapterPenilaiChild = new AdapterPenilaiChild(view);
        return adapterPenilaiChild;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPenilaiChild holder, int position) {
        holder.textView1.setText(nilaiList.get(position).TanggungJawab);
        holder.textView2.setText(nilaiList.get(position).Kedisiplinan);
        holder.textView3.setText(nilaiList.get(position).Kerapian);
        holder.textView4.setText(nilaiList.get(position).Komunikasi);
    }

    @Override
    public int getItemCount() {
        return nilaiList.size();
    }


    public class AdapterPenilaiChild extends RecyclerView.ViewHolder {
        public TextView textView1, textView2, textView3, textView4;

        public AdapterPenilaiChild(@NonNull View itemView) {
            super(itemView);

            textView1=itemView.findViewById(R.id.tv_tj);
            textView2=itemView.findViewById(R.id.tv_k);
            textView3=itemView.findViewById(R.id.tv_ke);
            textView4=itemView.findViewById(R.id.tv_ko);

        }
    }
}
