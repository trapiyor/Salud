package com.example.salud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Operaciones extends AppCompatActivity {
    // Declarac variables globales para los controles
    EditText et01, et02, etResultado;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnSalir2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        //Escuchar los controles de la vista
        et01 = (EditText) findViewById(R.id.et01);
        et02 = (EditText) findViewById(R.id.et02);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnSalir2 = (Button) findViewById(R.id.btnSalir2);

        // Proceso de evento

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restar();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiplicar();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dividir();
            }
        });

        btnSalir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Salir();
            }
        });
    }
    private void Salir() {
        finish();
    }

    private void Dividir() {
        double nro1 = Double.valueOf(et01.getText().toString());
        double nro2 = Double.valueOf(et02.getText().toString());
        if(nro2!=0){
            double cociente = nro1/nro2;
            etResultado.setText(String.valueOf(cociente));
        }else{
            etResultado.setText("Error no se puede divdir entre 0");
        }
    }

    private void Multiplicar() {
        double nro1 = Double.valueOf(et01.getText().toString());
        double nro2 = Double.valueOf(et02.getText().toString());
        double producto = nro1*nro2;
        etResultado.setText(String.valueOf(producto));
    }

    private void Restar() {
        double nro1 = Double.valueOf(et01.getText().toString());
        double nro2 = Double.valueOf(et02.getText().toString());
        double resta = nro1 - nro2;
        etResultado.setText(String.valueOf(resta));
    }

    private void Sumar() {
        double nro1 = Double.valueOf(et01.getText().toString());
        double nro2 = Double.valueOf(et02.getText().toString());
        double suma = nro1 + nro2;
        etResultado.setText(String.valueOf(suma));
    }
}