package com.sv.grupo1.ejercicio16;

public class Estudiante extends Persona{
    private String carnet;

    public Estudiante(String nombre, String id, String carnet) {
        super(nombre, id);
        this.carnet = carnet;
    }
    public void mostrarDatosEstudiante(){
        System.out.println("Nombre: "+ nombre + "\nid: " + id + "\ncarnet: " + carnet);
    }
}
