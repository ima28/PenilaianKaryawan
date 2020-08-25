package com.example.sistempenilaiankaryawan;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Map;
import java.util.Set;

import static com.example.sistempenilaiankaryawan.Home.MyPREFERENCES;

public class SharedPreferences {
    private static SharedPreferences INSTANCE;
    private SharedPreferences sharedPreferences;

    private SharedPreferences(Context context) {
        SharedPreferences sharedpreferences = (SharedPreferences) context.getApplicationContext().getSharedPreferences("simple.android.app", Context.MODE_PRIVATE);
    }

    public static SharedPreferences getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = new SharedPreferences(context);
        }
        return INSTANCE;
    }

    public Boolean iniLogin(){
        return sharedPreferences.getBoolean("iniLogin",false);
    }

    public void setLog(Boolean isCall){
        sharedPreferences.edit().putBoolean("iniLogin",isCall).apply();
    }

    public void setEmail(String iniEmail){
        sharedPreferences.edit().putString("iniEmail",iniEmail).apply();
    }

    public String getEmail(){
        return sharedPreferences.getString("iniEmail","");
    }

    public void setPss (String iniPss){
        sharedPreferences.edit().putString("iniPss",iniPss).Apply();
    }

    public String getPss({
        return  sharedPreferences.getString("iniPss","");
    }

}