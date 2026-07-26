package com.sv.grupox.ejercicio18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<EmpleadoHospital> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Medico("Carlos Gómez", "M001"));
        listaEmpleados.add(new Enfermera("María Rodríguez", "E001"));
        listaEmpleados.add(new Medico("Ana Martínez", "M002"));
        listaEmpleados.add(new Enfermera("Laura Pérez", "E002"));

        System.out.println("main() => --- REGISTRO DE TURNOS DEL HOSPITAL ---\n");

        for (EmpleadoHospital empleado : listaEmpleados) {
            empleado.ejecutarTurno();
        }
    }
}