package com.devjare.cleantestjava.presentacion.presentadores;

import android.view.View;

import com.devjare.cleantestjava.presentacion.vistas.Vista;

public abstract class Presentador {

    interface TaskListener{
        void onSuccess();
        void onFailure(String message);
    }

    public abstract void atarVista(Vista vista);
    public abstract void separarVista();
    public abstract boolean esVistaAtada();
}
