package com.example.monitorapp;

import android.content.Intent;
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
        //el boton se mantiene a la escucha para volver al Login en el MainActivity
        btn8.setOnClickListener(view -> {
            Intent intent = new Intent(Monitor.this,MainActivity.class);
            startActivity(intent);
            //se incorpora una transicion hacia la izquierda para salir
            overridePendingTransition(R.anim.from_left,R.anim.to_right);
            finish();

        });



    }
}

