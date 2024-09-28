package com.example.toolbar;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class segunda extends AppCompatActivity {

    TextView textViewSegunda;
    String paso, datoSalida;
    Double datoIn, datoOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        textViewSegunda = findViewById(R.id.textViewSegunda);
        pase();

    }

    private void pase(){
        paso = getIntent().getStringExtra("dato");
        datoIn=Double.parseDouble(paso);
        datoOut=datoIn+13.6+15.30+20.5;
        datoSalida = "" + datoOut;
        textViewSegunda.setText(datoSalida);
    }

}