package com.example.gymario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String nombreUsuario;
    private String password;
    private EditText usuario;
    private EditText passwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.usuario);
        passwd = findViewById(R.id.password);

    }

    public void entrar(View view) {
        nombreUsuario = usuario.getText().toString();
        password = passwd.getText().toString();
        if (usuario == null && passwd == null) {
            Toast.makeText(this,"Introduce algo valor en las casillas", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Muy bien", Toast.LENGTH_SHORT).show();

        }
        Intent i = new Intent(this, SegundaActividad.class);
        i.putExtra("usuario", nombreUsuario);
        i.putExtra("passwd", password);
        startActivity(i);
    }

}