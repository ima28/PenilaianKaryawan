package com.example.sistempenilaiankaryawan;

import android.content.Context;
import android.content.SharedPreferences;


public class SharedPreferencesLogin {
    private static SharedPreferencesLogin INSTANCE;
    private SharedPreferences sharedPreferences;

    private SharedPreferencesLogin(Context context) {
        sharedPreferences = context.getApplicationContext().getSharedPreferences("simple.android.app", Context.MODE_PRIVATE);
    }

    public static SharedPreferencesLogin getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = new SharedPreferencesLogin(context);
        }
        return INSTANCE;
    }

    public SharedPreferences Prefe() { return  sharedPreferences; }

    public boolean isLog(){ return sharedPreferences.getBoolean("isLog", false); }

    public void setLogin(boolean b) {
        sharedPreferences.edit().putBoolean("isLog", b).apply();
    }

    public void setEmail(String isEmail) {
        sharedPreferences.edit().putString("isEmail", isEmail).apply();
    }
    public String getEmail(){return  sharedPreferences.getString("isEmail",""); }

    public void setPass(String isPass) {
        sharedPreferences.edit().putString("isPass", isPass).apply();
    }
    public String getPass(){return  sharedPreferences.getString("isPass",""); }
}