package com.example.sistempenilaiankaryawan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistempenilaiankaryawan.Model.Login;
import com.example.sistempenilaiankaryawan.R;

import java.util.List;

public class AdapterLogin extends RecyclerView.Adapter<AdapterLogin.AdapterLoginChild> {

    private List<Login> loginList;
    private Context context;
    public AdapterLogin(List<Login> loginList, Context context) {
        this.loginList = loginList;
        this.context = context;
    }
    @NonNull
    @Override
    public AdapterLoginChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.penilaian,null);
        AdapterLogin.AdapterLoginChild adapterLoginChild = new AdapterLogin.AdapterLoginChild(view);
        return adapterLoginChild;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLoginChild holder, int position) {
        holder.textView3.setText(loginList.get(position).Email);
        holder.textView4.setText(loginList.get(position).Pass);

    }

    @Override
    public int getItemCount()  {
        return loginList.size(); {
    }

    public class AdapterLoginChild extends RecyclerView.ViewHolder {
        public TextView  textView3, textView4;
    }
        public AdapterLoginChild(@NonNull View itemView) {
            super(itemView);

            textView3=itemView.findViewById(R.id.edtemail);
            textView4=itemView.findViewById(R.id.edtpss);
        }
    }
}
