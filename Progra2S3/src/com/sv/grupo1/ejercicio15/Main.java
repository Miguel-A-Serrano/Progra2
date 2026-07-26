package com.sv.grupo1.ejercicio15;

public class Main {
    public static  void main(String[] args) {
        Camion miCamion = new Camion("P123-456", "Toyota", 3);
        System.out.println("--- Detalles del Vehiculo en Taller ---");

        System.out.println("Placa (Método heredado): " + miCamion.getPlaca());
        System.out.println("Marca (Método heredado): " + miCamion.getMarca());

        System.out.println("Número de Ejes (Método propio): " + miCamion.getNumeroEjes());
    }
}
