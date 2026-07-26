package com.sv.grupo1.ejercicio19;

public class Cuenta {
    protected double saldo;

    public Cuenta() {
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}