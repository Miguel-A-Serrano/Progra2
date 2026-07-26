package com.sv.grupo1.ejercicio6;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void listarLibros() {
        for (int i = 0; i < listaLibros.size(); i++) {
            System.out.println((i + 1) + ". " + listaLibros.get(i).getTitulo());
        }
    }

    // Busqueda secuencial: recorre la lista posicion por posicion
    // hasta encontrar el titulo. Devuelve null si no existe.
    public Libro buscarPorTitulo(String titulo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return listaLibros.get(i);
            }
        }
        return null;
    }
}
