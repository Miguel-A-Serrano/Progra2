package com.sv.grupo1.ejercicio9;

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

    public double calcularFacturaConDescuento(char tipoPago) {
        double totalBase = calcularTotal();
        double totalFinal = totalBase;

        switch (Character.toUpperCase(tipoPago)) {

            case 'E':
                double descuento = totalBase * 0.10; // 10% de descuento
                totalFinal = totalBase - descuento;
                System.out.println("Descuento aplicado (10% por efectivo): $" + descuento);
                break;

            case 'T':
                double recargo = totalBase * 0.03; // 3% de recargo
                totalFinal = totalBase + recargo;
                System.out.println("Recargo aplicado (3% por tarjeta): $" + recargo);
                break;

            default:
                System.out.println("Tipo de pago no válido. No se aplicó descuento ni recargo.");
                break;
        }

        System.out.println("Monto final a pagar: $" + totalFinal);
        return totalFinal;
    }
}