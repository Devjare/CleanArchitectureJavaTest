package com.devjare.cleantestjava.presentacion.vistas;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class Vista extends AppCompatActivity {

    public void toast(android.content.Context context, String mensaje, int duracion){
        Toast.makeText(context, mensaje, duracion).show();
    }
    protected abstract void showError(String mensajeError);
}
