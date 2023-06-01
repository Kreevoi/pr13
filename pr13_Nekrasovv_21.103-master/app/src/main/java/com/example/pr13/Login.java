package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Login extends AppCompatActivity implements View.OnClickListener {
Button signIn;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signIn=findViewById(R.id.sign_in);
        signIn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
