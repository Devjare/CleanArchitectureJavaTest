package com.devjare.cleantestjava.datos.repositorios;

public abstract class RepositorioUsuario {

    public abstract int getUserId();

    protected void insertUser(){
        int id = getUserId();
        Object client;
        client.insertToDB(new user(id));
    }

}
