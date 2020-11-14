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

class Pantalon extends Ropa {
    private String tipo;
    private int numBolsillos;

    public Pantalon(String tamano, String color, String genero, String material, String tipo, int numBolsillos) {
        super(tamano, color, genero, material);
        this.tipo = tipo;
        this.numBolsillos = numBolsillos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumBolsillos() {
        return numBolsillos;
    }

    public void setNumBolsillos(int numBolsillos) {
        this.numBolsillos = numBolsillos;
    }
}

class Camisa extends Ropa {
    private int numBotones;
    private String diseno;
    private String tipocuello;

    public Camisa(String tamano, String color, String genero, String material, int numBotones, String diseno, String tipocuello) {
        super(tamano, color, genero, material);
        this.numBotones = numBotones;
        this.diseno = diseno;
        this.tipocuello = tipocuello;
    }

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getTipocuello() {
        return tipocuello;
    }

    public void setTipocuello(String tipocuello) {
        this.tipocuello = tipocuello;
    }
}

class Calcetines extends Ropa {
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