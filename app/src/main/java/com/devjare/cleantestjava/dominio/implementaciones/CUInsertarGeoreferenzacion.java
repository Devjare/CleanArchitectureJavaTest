package com.devjare.cleantestjava.dominio.implementaciones;

import android.content.Context;

import com.devjare.cleantestjava.datos.modelos.Georeferenzacion;
import com.devjare.cleantestjava.dominio.CasoDeUso;

public class CUInsertarGeoreferenzacion extends CasoDeUso {

    public CUInsertarGeoreferenzacion(Context context, CasoDeUso.TaskListener listener){
        super(context, listener);
    }

    public String insertarUnidad(Georeferenzacion georeferenzacion){
        return "";
    }

    public String insertarVivienda(Georeferenzacion georeferenzacion){
        return "";
    }

}
