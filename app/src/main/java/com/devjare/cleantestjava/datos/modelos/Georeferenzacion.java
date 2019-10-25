package com.devjare.cleantestjava.datos.modelos;

public class Georeferenzacion {

    private int jurisdiccion;
    private int municipio;
    private int centroDeSalud;

    private String codigoPostal;
    private int localidad;
    private String calle;
    private int noInterior;
    private int noExterior;
    private String manzana;
    private int lote;
    private String telefono;
    private String referenciaUbicacion;

    public Georeferenzacion() {
    }

    public int getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(int jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getCentroDeSalud() {
        return centroDeSalud;
    }

    public void setCentroDeSalud(int centroDeSalud) {
        this.centroDeSalud = centroDeSalud;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNoInterior() {
        return noInterior;
    }

    public void setNoInterior(int noInterior) {
        this.noInterior = noInterior;
    }

    public int getNoExterior() {
        return noExterior;
    }

    public void setNoExterior(int noExterior) {
        this.noExterior = noExterior;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getReferenciaUbicacion() {
        return referenciaUbicacion;
    }

    public void setReferenciaUbicacion(String referenciaUbicacion) {
        this.referenciaUbicacion = referenciaUbicacion;
    }
}
