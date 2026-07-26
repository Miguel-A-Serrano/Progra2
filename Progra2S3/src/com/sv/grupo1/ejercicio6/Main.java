package com.sv.grupo1.ejercicio6;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n- - - Ejercicio 6 - - -");

        ControlBiblioteca control = new ControlBiblioteca();
        control.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        control.agregarLibro(new Libro("El principito", "Antoine de Saint-Exupéry"));
        control.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));

        control.listarLibros();

        Libro encontrado = control.buscarPorTitulo("El principito");
        if (encontrado != null) {
            System.out.print("\nLibro encontrado: ");
            encontrado.mostrarFicha();
        } else {
            System.out.println("\nLibro no encontrado");
        }
    }
}
