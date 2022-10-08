package com.example.monitorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_SignUp extends AppCompatActivity {

    Button btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);

        btn3=(Button) findViewById(R.id.button_Sign_Up);//button_Sign_Up
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity_SignUp.this,Monitor.class);
                startActivity(a);
            }
        });

        btn4=(Button) findViewById(R.id.button_Login_signup);//button_Login_signup
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity_SignUp.this,MainActivity.class);
                startActivity(b);
            }
        });
    }

    //creamos los metodos de tipo Intent

}