package com.sv.grupo1.ejercicio10;

public class Main {
    public static void main(String[] args) {
        AsociacionComunal asociacion = new AsociacionComunal("Comunidad San José");

        System.out.println();

        Habitante h1 = new Habitante("Carlos Mendoza", 34);
        Habitante h2 = new Habitante("Ana Lucía Gómez", 28);
        Habitante h3 = new Habitante("Roberto Flores", 52);

        asociacion.agregarHabitante(h1);
        asociacion.agregarHabitante(h2);
        asociacion.agregarHabitante(h3);

        System.out.println();
        asociacion.listarHabitantes();

        System.out.println("\nTotal de habitantes registrados: " + asociacion.obtenerTotalHabitantes());
    }
}