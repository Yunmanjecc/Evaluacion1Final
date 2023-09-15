package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class output_screen extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_screen);

        result = findViewById(R.id.txtResultado);
        String resultado = getIntent().getStringExtra("resultado");
        result.setText(resultado);
    }
}