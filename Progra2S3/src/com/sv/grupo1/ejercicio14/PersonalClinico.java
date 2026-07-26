package com.sv.grupo1.ejercicio14;

public class PersonalClinico {
    protected String nombre;
    protected double salarioBase;

    public PersonalClinico(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioNeto() {
        return  this.salarioBase;
    }

    public String getNombre() {
        return nombre;
    }
}
