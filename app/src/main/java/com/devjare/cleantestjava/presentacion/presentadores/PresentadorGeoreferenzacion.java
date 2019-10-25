package com.devjare.cleantestjava.presentacion.presentadores;

import android.view.View;

import com.devjare.cleantestjava.datos.modelos.Georeferenzacion;
import com.devjare.cleantestjava.dominio.implementaciones.CUInsertarGeoreferenzacion;
import com.devjare.cleantestjava.presentacion.vistas.Vista;
import com.devjare.cleantestjava.presentacion.vistas.VistaGeoreferenzacion;
import com.devjare.cleantestjava.servicios.ServicioWebEscritura;

import java.util.Map;

public class PresentadorGeoreferenzacion extends Presentador{

    private VistaGeoreferenzacion vista = null;
    CUInsertarGeoreferenzacion casodeuso = null;

    public PresentadorGeoreferenzacion(CUInsertarGeoreferenzacion casodeuso) {
        super();
        this.casodeuso = casodeuso;
    }

    @Override
    public void atarVista(Vista vista) {
        this.vista = (VistaGeoreferenzacion) vista;
    }

    @Override
    public void separarVista() {
        this.vista = null;
    }

    @Override
    public boolean esVistaAtada() {
        return this.vista != null;
    }

    public String insertarUnidad(Georeferenzacion georeferenzacion){

        String response = "";

        casodeuso.insertarUnidad(georeferenzacion);

        return "";
    }

    public String insertarVivienda(Georeferenzacion georeferenzacion){
        return "";
    }
}
