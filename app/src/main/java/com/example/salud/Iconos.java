package com.example.salud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Iconos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iconos);
    }

    public void Buscador(View view) {
        startActivity(getPackageManager().getLaunchIntentForPackage("com.android.chrome"));
    }

    public void Facebook(View view) {
        startActivity(getPackageManager().getLaunchIntentForPackage("com.facebook.lite"));
    }

    public void Google(View view) {
        startActivity(getPackageManager().getLaunchIntentForPackage("com.android.vending"));
    }

    public void Pinterest(View view) {
        startActivity(getPackageManager().getLaunchIntentForPackage("com.pinterest"));
    }

    public void Correo(View view) {
        startActivity(getPackageManager().getLaunchIntentForPackage("com.android.contacts"));
    }
}