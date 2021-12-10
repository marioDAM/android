package com.example.gymario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class TerceraActividad extends AppCompatActivity {
    private String nombreUsuario;
    private String ejercicioElegido;
    private String ejercicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_actividad);
        Bundle datos=getIntent().getExtras();
        nombreUsuario= datos.getString("usuario");
        ejercicioElegido=datos.getString("ejercicio");


       sacarInformacionEjercicio(ejercicioElegido);

    }

    private void sacarInformacionEjercicio(String ejercicioElegido) {
        switch (ejercicioElegido){
            case"biceps":
                ejercicioBiceps();
                break;
            case"pierna":
                ejercicioPierna();
                break;
            case"hombro":
                ejercicioHombro();
                break;
            case"espalda":
                ejercicioEspalda();
                break;

        }
    }

    private void ejercicioEspalda() {
        ImageView myImageView = (ImageView)findViewById(R.id.imageView6);
        myImageView.setImageResource(R.drawable.espalda);

        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox3);

        checkBox.setText(R.string.pecho);
        checkBox1.setText(R.string.dominadas);
        checkBox2.setText(R.string.remo);

    }

    private void ejercicioHombro() {
        ImageView myImageView = (ImageView)findViewById(R.id.imageView6);
        myImageView.setImageResource(R.drawable.hombro);

        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox3);

        checkBox.setText(R.string.presshombro);
        checkBox1.setText(R.string.elevacionesfrontales);
        checkBox2.setText(R.string.elevacioneslaterales);



    }

    private void ejercicioPierna() {
        ImageView myImageView = (ImageView)findViewById(R.id.imageView6);
        myImageView.setImageResource(R.drawable.pierna);

        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox3);

        checkBox.setText(R.string.sentadillas);
        checkBox1.setText(R.string.pesomuerto);
        checkBox2.setText(R.string.prensapierna);
    }

    private void ejercicioBiceps() {
        ImageView myImageView = (ImageView)findViewById(R.id.imageView6);
        myImageView.setImageResource(R.drawable.biceps);

        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox3);

        checkBox.setText(R.string.elevacionesmancuerna);
        checkBox1.setText(R.string.curlbicepsbarra);
        checkBox2.setText(R.string.curlbicepsmancuerna);


    }

}