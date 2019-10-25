package com.devjare.cleantestjava.presentacion.vistas;

public abstract class VistaGeoreferenzacion extends Vista {
    // Para fragments en la misma actividad es Mostrar
    protected abstract void mostrarUnidadAtencion();

    protected abstract void mostrarVivienda();

    // Para actividades distintas en Navegar
    protected abstract void navegarNuevaEncuesta();

    protected abstract void navegarDatosGenerales();
}
