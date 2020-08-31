package com.example.sistempenilaiankaryawan.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistempenilaiankaryawan.Activity.SharedPreferencesLogin;
import com.example.sistempenilaiankaryawan.R;

import static androidx.core.content.ContextCompat.startActivity;

public class UserLogin extends AppCompatActivity {
    private EditText edtemail, edtpass;
    private Button btnlogin;
    private SharedPreferencesLogin sharedPreferencesLogin;
    private int setContentView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView =(R.layout.activity_home);
        edtemail.findViewById(R.id.edtemail);
        edtpass.findViewById(R.id.edtpss);
        btnlogin.findViewById(R.id.btnlogin);

        sharedPreferencesLogin = new SharedPreferencesLogin(UserLogin.this);

        if (sharedPreferencesLogin.getsudahLogin()){
            startActivity(new Intent(UserLogin.this,LayoutRv.class )
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK));
            
        }


        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String Email = edtemail.getText().toString();
                String pass = edtpass.getText().toString();

                Toast.makeText(UserLogin.this, "BERHASIL LOGIN", Toast.LENGTH_SHORT).show();
                sharedPreferencesLogin.setsudahLogin(SharedPreferencesLogin.Sudah_Login, true);
                startActivity(new Intent(UserLogin.this, LayoutRv.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK));
                finish();
            }
    });
}

}
