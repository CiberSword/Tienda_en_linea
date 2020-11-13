package com.poo.practica6;

import usuarios.*;
import formasDeEntrega.*;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        /** Se crea al usuario y administrador involucrados en la prueba */
        Administradores admin = new Administradores("Juan",123);
        UsuarioNormal usuario = new UsuarioNormal();


        /** Simulaci�n */
        usuario.RecorrerSupermercado();

        //Para entrar a la simulacion - se debe borrar despues de implementar productos
        float CantidadAPagar = 1000;

        //float CantidadAPagar = admin.EmitirRecibo(usuario.getPrecios());	//This is el bueno :D
        if (usuario.Pagar(CantidadAPagar) == true ) {
            admin.RecibirPago(usuario.getMetodoDePago(),CantidadAPagar);

            /** Elegir M�todo de Entrega */
            int Opcion;
            do{
                System.out.println("�Cu�l m�todo de entrega desea ocupar?");
                System.out.print("1)En tienda \n2)A domicilio \nOpcion: ");
                Scanner teclado = new Scanner(System.in);
                Opcion = teclado.nextInt();
                switch(Opcion){
                    case 1:
                        long CantidadDeProductos = (usuario.getCarrito()).size();
                        EnTienda tienda = new EnTienda(CantidadDeProductos);
                        tienda.ImprimirRecibo(admin.nombre, usuario.getCarrito(), usuario.getPrecios(), CantidadAPagar);
                        tienda.Empaquetar();
                        break;
                    case 2:
                        ADomicilio domicilio = new ADomicilio();
                        System.out.println("Fecha tentativa de entrega: "+domicilio.FechaDeEntrega());
                        System.out.println(domicilio.PaqueteRecibido());
                        break;
                }
            } while (Opcion > 1 && Opcion < 2);
            System.out.println("Gracias por comprar con nosotros");
        }
        else
            System.out.println("...bai");
    }

}