package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class input_screen extends AppCompatActivity {
    //Creamos las variables que trabajarán con los id de esta pantalla
    EditText texto;
    EditText costo;
    EditText hectarea;
    Button bttnCalcular;
    Button bttnLimpiar;

    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_screen);

        costo = findViewById(R.id.input_costo);
        hectarea = findViewById(R.id.input_hectarea);

        //asignamos los botones
        bttnCalcular = findViewById(R.id.bttnCalcular);
        bttnLimpiar = findViewById(R.id.bttnLimpiar);

        //enviamos el resultado a la siguiente pantalla
        bttnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //obtenemos la cadena de texto para luego hacerle un parseDouble.
                String nums1 = costo.getText().toString();
                String nums2 = hectarea.getText().toString();
                double num1 = Double.parseDouble(nums1);
                double num2 = Double.parseDouble(nums2);
                double resultado = num1 * num2;
                Intent intent = new Intent(
                        getApplicationContext(), output_screen.class
                );
                intent.putExtra("resultado", texto.getText().toString());
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