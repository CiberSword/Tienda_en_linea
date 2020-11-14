package com.poo.practica6.supermercado.departamentos.electronica;

import com.poo.practica6.supermercado.departamentos.Productos;

public abstract class Electrodomestico extends Productos{
    private float potencia;
    private float voltaje;
    private String color;

    public void setPotencia(float potencia){
        this.potencia = potencia;
    }

    public float getPotencia(){
        return potencia;
    }

    public void setVoltaje(float voltaje){
        this.voltaje = voltaje;
    }

    public float getVolaje(){
        return voltaje;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
