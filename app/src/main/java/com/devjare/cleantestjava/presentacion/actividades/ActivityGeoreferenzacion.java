package com.devjare.cleantestjava.presentacion.actividades;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.devjare.cleantestjava.R;
import com.devjare.cleantestjava.dominio.CasoDeUso;
import com.devjare.cleantestjava.dominio.implementaciones.CUInsertarGeoreferenzacion;
import com.devjare.cleantestjava.presentacion.presentadores.Presentador;
import com.devjare.cleantestjava.presentacion.presentadores.PresentadorGeoreferenzacion;
import com.devjare.cleantestjava.presentacion.vistas.NuevaEncuesta;
import com.devjare.cleantestjava.presentacion.vistas.VistaGeoreferenzacion;
import com.devjare.cleantestjava.datos.modelos.Georeferenzacion;

class ActivityGeoreferenzacion extends VistaGeoreferenzacion {

    private PresentadorGeoreferenzacion presentador = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_georeferenzacion);

        presentador = new PresentadorGeoreferenzacion(
                new CUInsertarGeoreferenzacion(
                        this, new CasoDeUso.TaskListener() {
                    @Override
                    public void onSuccess() {
                        toast(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT);
                    }

                    @Override
                    public void onFailure(String message) {
                        toast(getApplicationContext(), "Failed", Toast.LENGTH_SHORT);
                    }
                }
                ));
        presentador.atarVista(this);
    }

    @Override
    protected void mostrarUnidadAtencion() {
        // Mostrar fragment unidad atencion
    }

    @Override
    protected void mostrarVivienda() {
        // Mostrar fragment vivienda
        Georeferenzacion georeferenzacion = new Georeferenzacion();
        presentador.insertarUnidad(georeferenzacion);
    }

    @Override
    protected void navegarNuevaEncuesta() {
        Intent intent = new Intent(this, NuevaEncuesta.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void navegarDatosGenerales() {

    }

    @Override
    public void showError(String mensajeError) {
        toast(this, mensajeError, Toast.LENGTH_SHORT);
    }
}
