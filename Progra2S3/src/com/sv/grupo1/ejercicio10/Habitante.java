package com.sv.grupo1.ejercicio10;

public class Habitante {
    private String nombre;
    private int edad;

    public Habitante( String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        return nombre +"." + " Edad: " + edad;
    }
}
