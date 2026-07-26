package com.sv.grupo1.ejercicio3;

public class CuentaAhorros {

    private String numeroCuenta;
    private double saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void aplicarInteresAnual(double porcentaje) {

        double tiempo = 8.0 / 12.0;

        double interes = saldo * porcentaje * tiempo;

        saldo = saldo + interes;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Interés ganado: $" + interes);
        System.out.println("Saldo final: $" + saldo);

    }

}
