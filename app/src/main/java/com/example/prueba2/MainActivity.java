package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    EditText textoContador;
    Button button;

    int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= findViewById(R.id.textView);
        button= findViewById(R.id.button);
        et= findViewById(R.id.editTextTextPersonName);
        textoContador= findViewById(R.id.textoContador);

    }


    public void patata(View view) {

        String nombre= et.getText().toString();
        if (nombre.isEmpty()){
            tv.setText("ERROR: tienes que introducir un nombre");
        }else {

            tv.setText("Hola, " + nombre);
            contador++;
            textoContador.setText(contador);
        }

    }
}