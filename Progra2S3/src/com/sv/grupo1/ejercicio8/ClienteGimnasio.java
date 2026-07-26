package com.sv.grupo1.ejercicio8;

public class ClienteGimnasio {
    private String nombre;
    private int asistencia = 0;

    public ClienteGimnasio(String nombre){
        this.nombre = nombre;
    }

    // Getters and setters //
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public void registrarEntrada(){
        this.asistencia ++;
        System.out.println(nombre + ", bienvenido al GYM HERCULES.");
        System.out.println("Tus asistencias en el mes son de: " + asistencia );
    }
}
