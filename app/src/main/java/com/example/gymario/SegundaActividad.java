package com.example.gymario;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {
    private String nombreUsuario;
    private String ejercicioElegido;
    private TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        Bundle datos= getIntent().getExtras();
        nombreUsuario=datos.getString("usuario");

        nombre = findViewById(R.id.nombre);

    }

    public void siguiente(View view) {
        Intent i = new Intent(this, TerceraActividad.class);
        i.putExtra("usuario", nombreUsuario);
        i.putExtra("ejercicio", ejercicioElegido);
        startActivity(i);
    }

    public void seleccionEjercicio(View view) {
        RadioButton radio = (RadioButton) view;
        boolean estado = ((RadioButton) view).isChecked();



        switch (view.getId()) {
            case R.id.biceps:
                if (estado)
                    ejercicioElegido="biceps";
                    break;
            case R.id.pierna:
                    ejercicioElegido="pierna";
                if (estado)
                    break;
            case R.id.hombro:
                    ejercicioElegido="hombro";
                if (estado)
                    break;
            case R.id.espalda:
                if (estado)
                    ejercicioElegido="espalda";
                    break;
            default:
                break;

        }


    }
}