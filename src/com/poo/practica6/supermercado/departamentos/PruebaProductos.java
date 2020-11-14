package com.poo.practica6.supermercado.departamentos;

import com.poo.practica6.supermercado.departamentos.*;
import com.poo.practica6.supermercado.departamentos.electronica.*;

public class PruebaProductos{

    public static void main(String [] args){
        Productos producto = new Samsung("Azul");
        Productos producto2 = new IPhone("Rosa");

        System.out.println(producto.getMarca());
        System.out.println(producto2.getMarca());
    }
}

