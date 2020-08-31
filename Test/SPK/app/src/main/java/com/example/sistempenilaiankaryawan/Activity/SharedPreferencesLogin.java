package com.example.sistempenilaiankaryawan.Activity;

import android.content.Context;
import android.content.SharedPreferences;


public class SharedPreferencesLogin {
    private static SharedPreferencesLogin INSTANCE;
    private SharedPreferences sharedPreferences;

    public  static final String Sudah_Login= "sudahLogin";
    public static final String Email="email_user";
    public static final String Pass="password_user";
    private SharedPreferences.Editor edi;

    public SharedPreferencesLogin(Context context) {
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


    //public void setEmail(String isEmail) {
        //sharedPreferences.edit().putString("isEmail", isEmail).apply();
    //}
    //public String getEmail(){return  sharedPreferences.getString("isEmail",""); }

    //public void setPass(String isPass) {
       // sharedPreferences.edit().putString("isPass", isPass).apply();
    //}

    public boolean getsudahLogin() {
            return sharedPreferences.getBoolean(Sudah_Login,false);
        }

    public void setsudahLogin(String keySP, boolean b) {
        edi.putBoolean(keySP,b);
        edi.commit();
    }
    public void setemail(String keySP, String email) {
        edi.putString(keySP,email);
        edi.commit();
    }
    public void setpasswod(String keySP, String password) {
        edi.putString(keySP,password);
        edi.commit();
    }

    public String getemail() {
        return sharedPreferences.getString(Email,"");
    }
    public String getpassword() {
        return sharedPreferences.getString(Pass,"");
    }
}