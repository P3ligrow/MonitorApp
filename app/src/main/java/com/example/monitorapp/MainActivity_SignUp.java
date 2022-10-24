package com.example.monitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_SignUp extends AppCompatActivity {

    Button btn3, btn4, btn5;
    EditText mail, pass1, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);

        mail=findViewById(R.id.id_correo); //id_correo
        pass1=findViewById(R.id.id_contraseña); // id_contraseña
        pass2=findViewById(R.id.id_confirmContraseña); // id_confirmContraseña

        //simularemos un ingreso de nuevo de credenciales
        btn3=findViewById(R.id.button_Sign_Up);//button_Sign_Up
        btn3.setOnClickListener(view -> {
            if (mail.getText().toString().equals("admin@gmail.com")&&pass1.getText().toString().equals("admin")&&pass2.getText().toString().equals("admin")){
                Intent a = new Intent(MainActivity_SignUp.this, Monitor.class);
                Toast.makeText(MainActivity_SignUp.this,"Bienvenido",Toast.LENGTH_LONG).show();
                startActivity(a);
                // desde aqui codigo transisition de pantalla y limíar layou
            }
            else{
                // en caso de no ser validada la credencial, emergenra un mensaje de advertencia
                finish();
                Toast.makeText(MainActivity_SignUp.this,"Intente Nuevamente",Toast.LENGTH_LONG).show();
            }

        });

        //Asignaremos este boton solo para regresar al login
        btn4=findViewById(R.id.button_Login_signup);//button_Login_signup
        btn4.setOnClickListener(view -> {
            Intent b = new Intent(MainActivity_SignUp.this,MainActivity.class);
            startActivity(b);
            overridePendingTransition(R.anim.from_left,R.anim.to_right);
        });

        //asignaremos este boton solo para la recuperacion de contraseña al MaintActivity_Forgot_Password
        btn5=findViewById(R.id.button_Forgot_Pass);//button_Forgot_Pass
        btn5.setOnClickListener(view -> {
            Intent c = new Intent(MainActivity_SignUp.this,MainActivity_Forgot_Password.class);
            startActivity(c);
            overridePendingTransition(R.anim.to_left,R.anim.from_rigth);
        });
    }

}