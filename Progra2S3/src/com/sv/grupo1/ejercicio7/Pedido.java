package com.sv.grupo1.ejercicio7;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Platillo> platillo;

    public Pedido(ArrayList<Platillo> platillo) {
        this.platillo = platillo;
    }

    public double calcularTotal() {
        double suma = 0;
        for (int i = 0; i < platillo.size(); i++) {
            suma += platillo.get(i).getPrecio();
        }
        System.out.println("El total de su pedido es de: $" + suma);
        return suma;
    }
}