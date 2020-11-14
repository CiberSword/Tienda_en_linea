package com.poo.practica6.supermercado.departamentos.viveres;

public class Manzanas extends Frutas{
    private String color;

    public Manzanas(){
        setPrecio((float) 29.90);
        setCodigoIdentificacion("MG1KG");
        setMarca("GOLDEN");
        setPeso(1);
        setColor("Verdes");
        setFechaCaducidad("30/NOV/2020");
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}