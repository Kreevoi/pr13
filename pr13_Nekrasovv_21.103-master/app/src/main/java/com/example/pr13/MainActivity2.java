package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity2 extends Activity implements View.OnClickListener{


    ImageButton one, two, three, four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        one = findViewById(R.id.imageButton1);
        two = findViewById(R.id.imageButton2);
        three = findViewById(R.id.imageButton3);
        four = findViewById(R.id.imageButton4);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
    }
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.imageButton1:
                Toast.makeText(this, "Спокойным", Toast.LENGTH_SHORT).show(); break;
            case R.id.imageButton2:
                Toast.makeText(this, "Расслабленным", Toast.LENGTH_SHORT).show(); break;
            case R.id.imageButton3:
                Toast.makeText(this, "Сосредоточенным", Toast.LENGTH_SHORT).show(); break;
            case R.id.imageButton4:
                Toast.makeText(this, "Взволнованным", Toast.LENGTH_SHORT).show(); break;
        }
    }
}