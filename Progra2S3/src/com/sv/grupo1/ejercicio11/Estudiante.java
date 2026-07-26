package com.sv.grupo1.ejercicio11;

public class Estudiante extends Persona {
    private String carnet;

    public Estudiante(String nombre, String id, String carnet) {
        this.nombre = nombre;
        this.id = id;
        this.carnet = carnet;
    }
    public void mostrarDatosEstudiante(){
        System.out.println("Nombre: "+ nombre + "\nid: " + id + "\ncarnet: " + carnet);
    }
}
