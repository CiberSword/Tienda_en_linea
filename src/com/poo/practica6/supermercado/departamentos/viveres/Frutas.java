package com.poo.practica6.supermercado.departamentos.viveres;

public abstract class Frutas extends Viveres{
    private float pesoKG;

    public void setPeso(float pesoKG){
        this.pesoKG = pesoKG;
    }

    public float getPeso(){
        return pesoKG;
    }
}


