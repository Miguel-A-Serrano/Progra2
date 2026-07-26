package com.sv.grupo1.ejercicio5;

public class ControlLibros {
    private Libro[] libros = new Libro[3];

    public void llenarArreglo() {
        libros[0] = new Libro("Cien años de soledad", "Gabriel García Márquez");
        libros[1] = new Libro("El principito", "Antoine de Saint-Exupéry");
        libros[2] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
    }

    public void mostrarTitulos() {
        System.out.println("Títulos registrados en el arreglo:");
        for (int i = 0; i < libros.length; i++) {
            System.out.print((i + 1) + ". ");
            libros[i].mostrarTitulo();
        }
    }
}
