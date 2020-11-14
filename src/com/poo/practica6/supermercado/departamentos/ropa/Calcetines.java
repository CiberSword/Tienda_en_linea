package com.poo.practica6.supermercado.departamentos.ropa;

public class Calcetines extends Ropa {
    private String dibujo;

    public Calcetines(String tamano, String color, String genero, String material, String dibujo) {
        super(tamano, color, genero, material);
        this.dibujo = dibujo;
    }

    public String getDibujo() {
        return dibujo;
    }

    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }
}
