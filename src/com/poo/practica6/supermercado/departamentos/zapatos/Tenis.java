package com.poo.practica6.supermercado.departamentos.zapatos;

public class Tenis extends Calzado{
    private boolean agujetas;

    public Tenis(){
        setPrecio((float) 300.00);
    }

    public boolean isAgujetas() {
        return agujetas;
    }

    public void setAgujetas(boolean agujetas) {
        this.agujetas = agujetas;
    }
}
