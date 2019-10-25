package com.devjare.cleantestjava.dominio;

import android.content.Context;

public abstract class CasoDeUso {

    public interface TaskListener{
        void onSuccess();
        void onFailure(String message);
    }

    Context context;
    TaskListener listener;

    protected CasoDeUso(Context context, TaskListener listener){
        this.context = context;
        this.listener = listener;
    }
}
