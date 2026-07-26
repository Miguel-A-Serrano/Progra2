package com.sv.grupo1.ejercicio9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n- - - Ejercicio 9 - - -");


        ArrayList<Platillo> lista1 = new ArrayList<>();

        lista1.add(new Platillo("Hamburguesa", 8.50));
        lista1.add(new Platillo("Papas Fritas", 3.00));
        lista1.add(new Platillo("Bebida", 2.00));

        Pedido pedido = new Pedido(lista1);

        System.out.println("\n- - - Prueba con Tarjeta - - -");
        pedido.calcularFacturaConDescuento('T');

        System.out.println("\n- - - Prueba con Efectivo - - -");
        pedido.calcularFacturaConDescuento('E');
    }
}