package com.sv.grupox.ejercicio13;

public class ArticuloDigital extends Articulo {

    private String urlDescarga;

    public ArticuloDigital(int id, String descripcion, double precioBase, String urlDescarga) {
        super(id, descripcion, precioBase);
        this.urlDescarga = urlDescarga;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("mostrarDetalles() => URL de descarga: " + urlDescarga);
    }
}