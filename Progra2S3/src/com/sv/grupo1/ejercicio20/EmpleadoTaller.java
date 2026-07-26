package com.sv.grupox.ejercicio20;

public class EmpleadoTaller {
    
    private String nombre;
    private String id;
    private int horasExtras;

    public EmpleadoTaller(String nombre, String id, int horasExtras) {
        this.nombre = nombre;
        this.id = id;
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double calcularSalarioTotal() {
        return 0.0;
    }
}