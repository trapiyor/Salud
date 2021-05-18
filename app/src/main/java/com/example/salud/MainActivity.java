package com.example.salud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Operaciones(View view) {
        startActivity(new Intent(this,Operaciones.class));

    }

    public void Salud(View view) {
        startActivity(new Intent(this,Salud.class));
    }

    public void Salir(View view) {
        finish();
    }

    public void Iconos(View view) { startActivity(new Intent(this,Iconos.class)); }

    public void Splash2(View view) {startActivity(new Intent(this,Splash1.class)); }

    public void Splash(View view) {startActivity(new Intent(this,Splash.class)); }
}