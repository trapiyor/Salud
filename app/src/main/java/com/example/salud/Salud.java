package com.example.salud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Salud extends AppCompatActivity {

    // Declarar variables globales para los controles
    EditText etNombre, etAltura, etPeso;
    RadioButton rbHombre,rbMujer;
    Button btnCalcular,btnLimpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
        rbHombre = (RadioButton) findViewById(R.id.rbHombre);
        rbMujer = (RadioButton) findViewById(R.id.rbMujer);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);

        btnLimpiar.setOnClickListener((v) ->{Limpiar();});
        btnCalcular.setOnClickListener((v) ->{CalcularIMC();});
    }

    private void Limpiar() {
        etNombre.setText("");
        etAltura.setText("");
        etPeso.setText("");
    }

    private String MensajeIMC(double IMC)
    {
        String mensaje ="";
        if(IMC<16)
            mensaje = " Peso bajo muy grave";
        else if (IMC>=16&IMC<17)
            mensaje =" Peso bajo grave";
        else
            mensaje = " Otro tipo de IMC";
        return mensaje;
    }

    private void CalcularIMC()
    {
        String nombre = etNombre.getText().toString();
        Double altura = Double.valueOf(etAltura.getText().toString());
        Double peso = Double.valueOf(etPeso.getText().toString());
        double IMC = peso / Math.pow(altura,2);
        Toast.makeText(this,"Tu IMC es " + String.format("%.2f",IMC)+ MensajeIMC(IMC),Toast.LENGTH_SHORT).show();
        if (rbMujer.isChecked()==true)
            Toast.makeText(this,"Eres mujer", Toast.LENGTH_SHORT).show();
        else if (rbHombre.isChecked()==true)
            Toast.makeText(this,"Eres varon", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"No eligio sexo", Toast.LENGTH_SHORT).show();
    }
}