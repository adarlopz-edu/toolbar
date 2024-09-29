package com.example.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    EditText editNumero;
    Button buttonSumar;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editNumero = findViewById(R.id.editNumero);
        buttonSumar = findViewById(R.id.buttonSumar);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.opc1){
            Toast.makeText(this, "ayuda", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.opc2){
            Toast.makeText(this, "brad", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}