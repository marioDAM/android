package com.example.gymario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        Intent i = new Intent(this, SegundaActividad.class);
        i.putExtra("usuario",nombreUsuario);
        i.putExtra("passwd",password);
        startActivity(i);
    }

}