package com.example.monitorapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Monitor extends AppCompatActivity {

    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);

        btn8=findViewById(R.id.id_salir); //id_salir
        btn8.setOnClickListener(view -> finish());//al ser click se cierra el programa


    }
}