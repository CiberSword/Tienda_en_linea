package com.poo.practica6.formas_de_entrega;

public class ADomicilio {
    /** Atributos */
    private Direccion direccion;

    /** Metodo Constructor */
    public ADomicilio() {
        this.direccion = new Direccion();
    }

    /**
     * Metodo Programar fecha de entrega
     */
    public String FechaDeEntrega() {
        return "31-Feb-2020";
    }

    /**
     * Metodo Paquete enviado
     */
    public String PaqueteRecibido() {
        String Impresion = "Su paquete lo esta esperando en la puerta del domicilio:" + direccion.ImprimirDireccion();
        return Impresion;
    }
}