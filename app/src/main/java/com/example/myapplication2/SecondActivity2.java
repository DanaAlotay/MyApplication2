package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        tv= findViewById(R.id.textView3);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        tv.setText("Hi "+ str + "!");
    }
}