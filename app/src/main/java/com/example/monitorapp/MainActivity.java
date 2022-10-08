package com.example.monitorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.AccessibilityButtonController;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button_Login);//button_Login
        btn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(MainActivity.this,Monitor.class);
                startActivity(l);
            }
        }));


        btn2=(Button)findViewById(R.id.button_SignUp);//button_SignUp
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity_SignUp.class);
                startActivity(intent);
            }
        });
    }



    //se crea el método de tipo Inten del boton SignUp



}