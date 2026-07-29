package com.sv.grupo1.academico;

public class Estudiante {
    private int carnet;
    private String nombre;
    private int edad;
    private String carrera;


    public Estudiante(int carnet, String nombre, int edad, String carrera) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;

    }

    //getter y setter de nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getter y setter de edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //getter y setter de carrera
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //getter y setter de carnet
    public int getCarnet() {
        return carnet;
    }
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString(){
        return "\nnombre: " + nombre +"\nEdad: " +edad + "\nCarrera: " + carrera +"\nCarnet: " + carnet;
    }
}
