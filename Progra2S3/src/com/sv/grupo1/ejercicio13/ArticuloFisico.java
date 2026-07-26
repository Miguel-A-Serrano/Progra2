package com.sv.grupox.ejercicio13;

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
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("mostrarDetalles() => Peso: " + pesoKg + " kg");
    }
}