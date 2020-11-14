package com.poo.practica6.supermercado.departamentos.zapatos;

import com.poo.practica6.supermercado.departamentos.Productos;

public abstract class Calzado extends Productos {
    private int tamano;
    private String material;
    private String diseno;
    private String suela;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }
}

class Sandalias extends Calzado {

    public Sandalias(){

    }

    private String tipoSandalia;

    public String getTipoSandalia() {
        return tipoSandalia;
    }

    public void setTipoSandalia(String tipoSandalia) {
        this.tipoSandalia = tipoSandalia;
    }
}

class Tenis extends Calzado {
    private boolean agujetas;

    public boolean isAgujetas() {
        return agujetas;
    }

    public void setAgujetas(boolean agujetas) {
        this.agujetas = agujetas;
    }
}

class Tacones extends Calzado {
    private int tamanoTacon;

    public int getTamanoTacon() {
        return tamanoTacon;
    }

    public void setTamanoTacon(int tamanoTacon) {
        this.tamanoTacon = tamanoTacon;
    }
}