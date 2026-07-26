package com.sv.grupo1.ejercicio6;

import java.util.ArrayList;

public class ControlBiblioteca {
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void listarLibros() {
        System.out.println("Libros de la biblioteca:");
        for (int i = 0; i < listaLibros.size(); i++) {
            System.out.print((i + 1) + ". ");
            listaLibros.get(i).mostrarFicha();
        }
    }

    // Búsqueda secuencial: recorre la lista posición por posición
    // hasta encontrar el título. Devuelve null si no existe.
    public Libro buscarPorTitulo(String titulo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return listaLibros.get(i);
            }
        }
        return null;
    }
}
