package com.example.sistempenilaiankaryawan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistempenilaiankaryawan.R;

import java.util.List;

public class AdapterPenilai extends RecyclerView.Adapter<AdapterPenilai.AdapPenilaiChild> {
    private List<AdapterPenilai> adapterPenilaiList;
    private Context context;
    private Object AdapPenilaiChild;
    private Object email,password;

    public AdapterPenilai(List<AdapterPenilai> adapterPenilaiList, Context context){
        this.adapterPenilaiList = adapterPenilaiList;
        this.context=context;
    }

    @NonNull
    @Override
    public AdapterPenilai.AdapPenilaiChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.penilaian,null);
        AdapPenilaiChild adapPenilaiChild =new AdapPenilaiChild(view);
        return (AdapterPenilai.AdapPenilaiChild) AdapPenilaiChild;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPenilai.AdapPenilaiChild holder, int position) {
        holder.textViewemail.setText((Integer) adapterPenilaiList.get(position).email);
        holder.textViewpass.setText((Integer) adapterPenilaiList.get(position).password);
    }

    @Override
    public int getItemCount() {
        return adapterPenilaiList.size();
    }

    public class AdapPenilaiChild extends RecyclerView.ViewHolder {
        public TextView textViewemail, textViewpass;

        public AdapPenilaiChild(@NonNull View itemView){
            super(itemView);

            textViewemail=itemView.findViewById(R.id.edtemail);
            textViewpass=itemView.findViewById(R.id.edtpss);
        }

        {
        }
    }
}
