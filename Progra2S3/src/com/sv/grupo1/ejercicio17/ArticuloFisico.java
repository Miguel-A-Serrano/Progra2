package com.sv.grupox.ejercicio17;

public class ArticuloFisico extends Articulo {

    private double pesoKg;

    public ArticuloFisico(int id, String descripcion, double precioBase, double pesoKg) {
        super(id, descripcion, precioBase);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("mostrarFicha() => Peso: " + pesoKg + " kg");
    }
}