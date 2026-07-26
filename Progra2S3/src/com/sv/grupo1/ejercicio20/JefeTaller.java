package com.sv.grupox.ejercicio20;

public class JefeTaller extends EmpleadoTaller {

    public JefeTaller(String nombre, String id, int horasExtras) {
        super(nombre, id, horasExtras);
    }

    @Override
    public double calcularSalarioTotal() {
        double salarioBase = 600.0;
        double pagoHorasExtras = getHorasExtras() * 8.0;
        return salarioBase + pagoHorasExtras;
    }
}