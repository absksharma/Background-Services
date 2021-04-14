package com.example.backgroudservicces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == btn1) {
            Intent i = new Intent(MainActivity.this, MyService.class);
            startService(i);

        } else if (v == btn2) {
            Intent i = new Intent(MainActivity.this, MyService.class);
            stopService(i);

        } else if (v == btn3) {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);
        }
    }
}