package com.poo.practica6.supermercado.departamentos;

public abstract class Productos {
    private float precio;
    private String codigoIdentificacion;
    public String marca;

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion){
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getCodigoIdentificacion(){
        return codigoIdentificacion;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
}