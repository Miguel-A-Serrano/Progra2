package com.sv.grupox.ejercicio13;

public class Main {
    public static void main(String[] args) {
        ArticuloFisico laptop = new ArticuloFisico(101, "Laptop Gamer", 1200.00, 2.5);
        ArticuloDigital ebook = new ArticuloDigital(102, "Ebook de Java POO", 15.00, "https://mi-tienda.com/downloads/java-poo.pdf");

        System.out.println("--- Artículo Físico ---");
        laptop.mostrarDetalles();

        System.out.println("\n--- Artículo Digital ---");
        ebook.mostrarDetalles();
    }
}