package com.example.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editNumero;
    Button buttonSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editNumero = findViewById(R.id.editNumero);
        buttonSumar = findViewById(R.id.buttonSumar);

        buttonSumar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickSumar();
            }
        });
    }

    private void onClickSumar(){
        Intent cambio = new Intent(this, segunda.class);
        cambio.putExtra("dato", editNumero.getText().toString());
        startActivity(cambio);
    }

}