package com.example.khaerulumam.khaerulumam_1202154148_modul3;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout a,b;
    private Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        a = (TextInputLayout) findViewById(R.id.username);
        b = (TextInputLayout) findViewById(R.id.password);

        String nama = a.getEditText().getText().toString();
        String pass = b.getEditText().getText().toString();

        if (nama.isEmpty() && pass.isEmpty()){
            Toast.makeText(this,"Isi dulu bro",Toast.LENGTH_LONG).show();
        } else  if (nama.equals("EAD")  && pass.equals("MOBILE")){
            Toast.makeText(this,"Login Success",Toast.LENGTH_LONG).show();
            Intent a = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(a);
        } else if (!nama.equals("EAD")  && !pass.equals("MOBILE")){
            Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show();
        }
    }
}
