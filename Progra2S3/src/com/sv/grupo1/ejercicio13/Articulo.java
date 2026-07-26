package com.sv.grupox.ejercicio13;

public class Articulo {

    private int id;
    private String descripcion;
    private double precioBase;

    public Articulo(int id, String descripcion, double precioBase) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void mostrarDetalles() {
        System.out.println("mostrarDetalles() => ID: " + id + " | Descripción: " + descripcion + " | Precio Base: $" + precioBase);
    }
}