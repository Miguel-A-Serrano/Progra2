package com.sv.grupo1.ejercicio14;

public class Medico extends PersonalClinico {
    private String especialidad;
    private final double bono_especialidad = 800.00;

    public Medico(String nombre, double salarioBase, String especialidad) {
        super(nombre, salarioBase);
        this.especialidad = especialidad;
    }

    public double calcularSalarioNeto() {
        return super.calcularSalarioNeto() + bono_especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
