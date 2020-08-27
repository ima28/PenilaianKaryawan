package com.example.sistempenilaiankaryawan.Activity;

import android.content.Context;
import android.content.SharedPreferences;


public class SharedPreferencesLogin {
    private static SharedPreferencesLogin INSTANCE;
    private SharedPreferences sharedPreferences;

    public  static final String Sudah_Login= "sudahLogin";
    private SharedPreferences.Editor edi;

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

    public boolean getsudahLogin() {
            return sharedPreferences.getBoolean(Sudah_Login,false);
        }

    public void setsudahLogin(String keySP, boolean b) {
        edi.putBoolean(keySP,b);
        edi.commit();
    }
}