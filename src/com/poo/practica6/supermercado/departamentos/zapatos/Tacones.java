package com.poo.practica6.supermercado.departamentos.zapatos;

public class Tacones extends Calzado{
    private int tamanoTacon;

    public Tacones(){
        setPrecio((float) 300.00);
    }

    public int getTamanoTacon() {
        return tamanoTacon;
    }

    public void setTamanoTacon(int tamanoTacon) {
        this.tamanoTacon = tamanoTacon;
    }
}
