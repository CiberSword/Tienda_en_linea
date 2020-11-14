package com.poo.practica6.supermercado.departamentos.papeleria;

import com.poo.practica6.supermercado.departamentos.Productos;

public class Cuadernos extends Productos{
    private String tipoHoja;
    private int numeroHojas;

    public Cuadernos(){
        setPrecio((float) 37.40);
        setCodigoIdentificacion("CS100H");
        setMarca("SCRIBE");
        setTipoHoja("Cuadro chico");
        setNumeroHojas(100);
    }

    public void setTipoHoja(String tipoHoja){
        this.tipoHoja = tipoHoja;
    }

    public String getTipoHoja(){
        return tipoHoja;
    }

    public void setNumeroHojas(int numeroHojas){
        this.numeroHojas = numeroHojas;
    }

    public int getNumeroHojas(){
        return numeroHojas;
    }
}
