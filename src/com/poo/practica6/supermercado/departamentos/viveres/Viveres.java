package com.poo.practica6.supermercado.departamentos.viveres;

import com.poo.practica6.supermercado.departamentos.Productos;

public class Viveres extends Productos {
    private String fechaCaducidad;

    public void setFechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
}
