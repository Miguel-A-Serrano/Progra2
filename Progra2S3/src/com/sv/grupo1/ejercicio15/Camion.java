package com.sv.grupo1.ejercicio15;

public class Camion extends Vehiculo {
    private int numeroEjes;

    public  Camion(String placa, String marca, int numeroEjes) {
        super(placa, marca);
        this.numeroEjes = numeroEjes;
    }

    public  int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
