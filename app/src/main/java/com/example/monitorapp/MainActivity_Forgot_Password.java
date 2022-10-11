package com.example.monitorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity_Forgot_Password extends AppCompatActivity {

    Button btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_forgot_password);

        btn6=findViewById(R.id.button_send); //button_send



        btn7=findViewById(R.id.button_login); //button_login
        //Asignaremos este boton solo para regresar al login
        btn7.setOnClickListener(view -> {
            Intent b = new Intent(MainActivity_Forgot_Password.this,MainActivity.class);
            startActivity(b);
        });


    }
}