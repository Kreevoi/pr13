package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity implements View.OnClickListener  {
ImageView s;
ImageView d;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        s=findViewById(R.id.logo);
        s.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, Onboarding.class));
    }
}