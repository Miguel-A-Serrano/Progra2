package com.sv.grupox.ejercicio18;

public class EmpleadoHospital {

    private String nombre;
    private String idEmpleado;

    public EmpleadoHospital(String nombre, String idEmpleado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void ejecutarTurno() {
        System.out.println("ejecutarTurno() => " + nombre + " está iniciando su turno general.");
    }
}