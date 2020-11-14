package com.poo.practica6.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioNormal {
    /** Atributos */
    public String nombre;
    private MetodoDePago metodoDePago;
    private List<String> carrito;
    private List<Float> precios;

    /** Método Constructor */
    public UsuarioNormal() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nuevo Usuario\nIngrese Nombre Completo: ");
        this.nombre = teclado.nextLine();

        this.carrito = new ArrayList<String>();
        this.precios = new ArrayList<Float>();
    }

    /** Método Recorrer Supermercado */
    public void RecorrerSupermercado() {
        System.out.println("Pasillo: Viveres");
        //carrito.add(get.Producto());
        //precios.add(get.Precio());
        //System.out.println(get.Producto()+"Agregado al carrito");
        System.out.println("Pasillo: Papeleria");
        //carrito.add(get.Producto());
        //precios.add(get.Precio());
        //System.out.println(get.Producto()+"Agregado al carrito");
        System.out.println("Pasillo: Electronicos");
        //carrito.add(get.Producto());
        //precios.add(get.Precio());
        //System.out.println(get.Producto()+"Agregado al carrito");
        System.out.println("Pasillo: Ropa");
        //carrito.add(get.Producto());
        //precios.add(get.Precio());
        //System.out.println(get.Producto()+"Agregado al carrito");
        System.out.println("Pasillo: Zapatos");
        //carrito.add(get.Producto());
        //precios.add(get.Precio());
        //System.out.println(get.Producto()+"Agregado al carrito");
    }

    /** Método Pagar */
    public boolean Pagar(float CantidadAPagar) {
        if (CantidadAPagar > 0) {
            System.out.println("Pagando " + CantidadAPagar + " por " + carrito.size() + " productos");
            this.metodoDePago = new MetodoDePago();
            if (CantidadAPagar > metodoDePago.getDinero()) {
                System.out.println("Dinero Insuficiente");
                return false;
            } else
                return true;
        } else
            return false;
    }

    /** Método Impresión Elementos En Carrito */
    public void ImprimirElementosCarrito() {
        for (int i = 0; i < carrito.size(); i++)
            System.out.println(carrito.get(i));
    }

    /** Método Impresión de Datos */
    public String ImprimirDatos() {
        MetodoDePago imprimirMetodo = this.getMetodoDePago();
        String Impresion = "Usuario: " + this.nombre + "\n" + imprimirMetodo.ImprimirMetodoDePago();
        return Impresion;
    }

    /** Getters */
    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public List<String> getCarrito() {
        return carrito;
    }

    public List<Float> getPrecios() {
        return precios;
    }

}