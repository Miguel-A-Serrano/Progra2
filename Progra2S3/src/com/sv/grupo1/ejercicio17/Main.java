package com.sv.grupox.ejercicio17;

public class Main {
    public static void main(String[] args) {

        ArticuloFisico monitor = new ArticuloFisico(201, "Monitor 27 pulgadas", 250.00, 4.8);

        System.out.println("main() => --- Ficha del Artículo Físico ---");
        monitor.mostrarFicha();
    }
}