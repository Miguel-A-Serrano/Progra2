package com.sv.grupo1.ejercicio14;

public class Main {
    public static  void main(String[] args) {
        PersonalClinico enfermero = new PersonalClinico("Miguel", 600.00);
        Medico cirujano = new Medico("Dr. Ivan", 1200.00, "Neurocirujia");

        System.out.println("--- Nomina del Personal ---");
        System.out.println("Personal: " + enfermero.getNombre());
        System.out.println("Salario Neto: $" + enfermero.calcularSalarioNeto());

        System.out.println("---------------------------");

        System.out.println("Médico: " + cirujano.getNombre());
        System.out.println("Especialidad: " + cirujano.getEspecialidad());
        System.out.println("Salario Neto (Base + Bono): $" + cirujano.calcularSalarioNeto());
    }
}
