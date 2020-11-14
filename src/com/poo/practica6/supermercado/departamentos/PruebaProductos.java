package com.poo.practica6.supermercado.departamentos;

import com.poo.practica6.supermercado.departamentos.*;
import com.poo.practica6.supermercado.departamentos.electronica.*;
import com.poo.practica6.supermercado.departamentos.papeleria.*;

public class PruebaProductos{

    public static void main(String [] args){
        Productos cel1 = new Samsung("Azul");
        Productos cel2 = new IPhone("Rosa");
        Productos cel3 = new Huawei("Blanco");

        System.out.println("Celular " + cel1.getMarca());
        System.out.println("Celular " + cel2.getMarca());
        System.out.println("Celular " + cel3.getMarca());

        Productos elec1 = new Lavadora();
        Productos elec2 = new Refrigerador();

        System.out.println("Lavadora " + elec1.getMarca());
        System.out.println("Refrigerador " +  elec2.getMarca());

        Productos pap1 = new Cuadernos();
    }
}

