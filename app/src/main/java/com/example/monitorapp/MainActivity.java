package com.example.monitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    EditText user, mail, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user= findViewById(R.id.Id_Nombre); //Id_Nombre
        mail= findViewById(R.id.Id_correo); //Id_correo
        pass= findViewById(R.id.Id_password); //Id_password

        btn1= findViewById(R.id.button_Login);//button_Login
        //Se mantiene a la escucha del click del botón para desplegar la validacion de credenciales...
        btn1.setOnClickListener((view -> {
            if (user.getText().toString().equals("Admin")&& mail.getText().toString().equals("admin@gmail.com")&& pass.getText().toString().equals("admin")){
                // ya validado el usuario ingresara al Activity Monitor con un mensaje de Bienvenida
                Intent p = new Intent(MainActivity.this, Monitor.class);
                Toast.makeText(MainActivity.this,"Bienvenido",Toast.LENGTH_LONG).show();
                startActivity(p);
            }
            else{
                // en caso de no ser validada la credencial, emergenra un mensaje de advertencia
                Toast.makeText(MainActivity.this,"Credenciales Invalidas",Toast.LENGTH_LONG).show();
            }
        }));

        btn2= findViewById(R.id.button_SignUp);//button_SignUp
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,MainActivity_SignUp.class);
            startActivity(intent);
        });
    }



}