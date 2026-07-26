package com.sv.grupo1.ejercicio5;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n- - - Ejercicio 5 - - -");

        Libro[] libros = new Libro[3];

        libros[0] = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez");
        libros[1] = new Libro("El principito", "Antoine de Saint-Exupery");
        libros[2] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        System.out.println("Titulos registrados en el arreglo:");
        for (int i = 0; i < libros.length; i++) {
            System.out.println((i + 1) + ". " + libros[i].getTitulo());
        }
    }
}
