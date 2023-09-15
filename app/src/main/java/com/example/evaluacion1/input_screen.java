package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class input_screen extends AppCompatActivity {
    //Creamos las variables que trabajarán con los id de esta pantalla
    EditText texto;
    EditText costo;
    EditText hectarea;
    Button bttnCalcular;
    Button bttnLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_screen);

        //tomamos los campos number y los asignamos a costo y hectarea
        costo = findViewById(R.id.input_costoVerduras);
        hectarea = findViewById(R.id.input_totalHectarea);

        //asignamos los botones
        bttnCalcular = findViewById(R.id.bttnCalcular);
        bttnLimpiar = findViewById(R.id.bttnLimpiar);

        //enviamos el resultado a la siguiente pantalla
        bttnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), output_screen.class
                );
                intent.putExtra("mensaje", texto.getText().toString());
                startActivity(intent);
            }
        });

        //limpiamos los campos con el método creado bajo este.
        bttnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiarCampos();
            }
        });
    }
    private void limpiarCampos() {
        costo.setText("");
        hectarea.setText("");
    }
}