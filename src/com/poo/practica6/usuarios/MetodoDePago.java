package com.poo.practica6.usuarios;

import java.util.Scanner;

public class MetodoDePago {
    /**
     * Atributos
     */
    private long tarjeta;
    private int cvv;
    private float dinero;

    /**
     * Metodo Constructor
     */
    public MetodoDePago() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("M�todo de Pago\n   N�mero tarjeta: ");
        this.tarjeta = teclado.nextLong();
        System.out.print("   CVV: ");
        this.cvv = teclado.nextInt();

        this.dinero = 1000;
    }

    /**
     * Metodo Impresion Datos
     */
    public String ImprimirMetodoDePago() {
        String Impresion = "M�todo de pago\n   Tarjeta: " + this.getTarjeta() + "\n   CCV: " + this.getCVV();
        return Impresion;
    }

    /**
     * Getters
     */
    public long getTarjeta() {
        return tarjeta;
    }

    public int getCVV() {
        return cvv;
    }

    public float getDinero() {
        return dinero;
    }

    /**
     * Setters
     */
    public void setDinero(float Cantidad) {
        this.dinero = Cantidad;
    }
}