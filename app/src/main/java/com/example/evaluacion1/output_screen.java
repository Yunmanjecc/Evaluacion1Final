package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class output_screen extends AppCompatActivity {
    TextView result;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_screen);
        double resultado = getIntent().getDoubleExtra("resultado", 0.0);
        volver = findViewById(R.id.bttnVolver);
        result = findViewById(R.id.txtResultado);
        result.setText("$"+resultado);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), input_screen.class
                );
                startActivity(intent);
            }
        });
    }
}