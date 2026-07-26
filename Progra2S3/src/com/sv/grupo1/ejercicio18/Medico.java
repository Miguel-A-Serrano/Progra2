package com.sv.grupox.ejercicio18;

public class Medico extends EmpleadoHospital {

    public Medico(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }

    @Override
    public void ejecutarTurno() {
        System.out.println("ejecutarTurno() => Dr/a. " + getNombre() + " (" + getIdEmpleado() + ") -> Turno Matutino: Pasando consulta y realizando diagnósticos.");
    }
}