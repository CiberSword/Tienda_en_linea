package com.poo.practica6.supermercado.departamentos.ropa;

import com.poo.practica6.supermercado.departamentos.Productos;

public abstract class Ropa extends Productos {
    private String tamano;
    private String color;
    private String genero;
    private String material;

    public Ropa(String tamano, String color, String genero, String material) {
        this.tamano = tamano;
        this.color = color;
        this.genero = genero;
        this.material = material;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}



