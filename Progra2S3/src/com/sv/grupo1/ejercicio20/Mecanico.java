package com.sv.grupox.ejercicio20;

public class Mecanico extends EmpleadoTaller {

    public Mecanico(String nombre, String id, int horasExtras) {
        super(nombre, id, horasExtras);
    }

    @Override
    public double calcularSalarioTotal() {
        double salarioBase = 420.0;
        double pagoHorasExtras = getHorasExtras() * 5.0;
        return salarioBase + pagoHorasExtras;
    }
}