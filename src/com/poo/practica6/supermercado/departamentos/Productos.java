package com.poo.practica6.supermercado.departamentos;

public abstract class Productos {
    private float precio;
    private String codigoIdentificacion;
    public String marca;

    abstract void setPrecio();

    abstract void setCodigoIdentificacion();

    abstract void setMarca();
}