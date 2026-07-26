package com.sv.grupo1.ejercicio6;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n- - - Ejercicio 6 - - -");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel Garcia Marquez"));
        biblioteca.agregarLibro(new Libro("El principito", "Antoine de Saint-Exupery"));
        biblioteca.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));

        System.out.println("Libros de la biblioteca:");
        biblioteca.listarLibros();

        Libro encontrado = biblioteca.buscarPorTitulo("El principito");
        if (encontrado != null) {
            System.out.println("\nLibro encontrado: " + encontrado.getTitulo() + " // Autor: " + encontrado.getAutor());
        } else {
            System.out.println("\nLibro no encontrado");
        }
    }
}
