package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Onboarding extends AppCompatActivity implements View.OnClickListener {
Button btn;
TextView textAccount;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        btn=findViewById(R.id.account);
        btn.setOnClickListener(this);
        textAccount=findViewById(R.id.textAccount);
        textAccount.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.account) startActivity(new Intent(this, Login.class));
        else startActivity(new Intent(this,Registration.class));
    }
}