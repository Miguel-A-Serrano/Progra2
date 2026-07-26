package com.sv.grupox.ejercicio18;

public class Enfermera extends EmpleadoHospital {

    public Enfermera(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }

    @Override
    public void ejecutarTurno() {
        System.out.println("ejecutarTurno() => Enfermero/a " + getNombre() + " (" + getIdEmpleado() + ") -> Turno Nocturno: Monitoreando pacientes y administrando medicamentos.");
    }
}