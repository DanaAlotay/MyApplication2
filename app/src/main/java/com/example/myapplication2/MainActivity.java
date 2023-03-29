package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.button);

        e=findViewById(R.id.editTextTextPersonName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= e.getText().toString();
                Intent intent = new Intent(getApplicationContext(),SecondActivity2.class);
                intent.putExtra("message_key",str);
                startActivity(intent);
            }
        });

    }
}