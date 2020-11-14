package com.poo.practica6.supermercado.departamentos.electronica;

import com.poo.practica6.supermercado.departamentos.Productos;

/**La clase electrodomestico abarca una serie muy variada de productos, es por ello que fue
 * declarada como una clase abstracta, de ella heredaran atributos y metodos clases como
 * lavadora y refrigerador
 */

public abstract class Electrodomestico extends Productos{
    private float potencia;
    private float voltaje;
    private String color;

    /**Declaracion de getters y setters para la manipulacion de los atributos del método
     */

    public void setPotencia(float potencia){
        this.potencia = potencia;
    }

    public float getPotencia(){
        return potencia;
    }

    public void setVoltaje(float voltaje){
        this.voltaje = voltaje;
    }

    public float getVolaje(){
        return voltaje;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
