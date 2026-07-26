package com.sv.grupo1.ejercicio12;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente miCuenta = new CuentaCorriente();

        System.out.println("\n- - - Ejercicio 12 - - -");

        imprimirEncabezado();
        imprimirFila("Inicializa saldo", "0.0", "0");

        miCuenta.depositar(500);
        imprimirFila("Deposita a cuenta", "500$", miCuenta.getSaldo() + "$");

        procesarRetiro(miCuenta, 300);

        procesarRetiro(miCuenta, 200);

        procesarRetiro(miCuenta, 115);

        procesarRetiro(miCuenta, 10);

        miCuenta.depositar(200);

        imprimirFila("Abono", "200", miCuenta.getSaldo() + "$");
    }

    private static void procesarRetiro(CuentaCorriente cuenta, double monto) {
        boolean exito = cuenta.retirar(monto);
        if (exito) {
            imprimirFila("Retiro", monto + "$", cuenta.getSaldo() + "$");
        } else {
            imprimirFila("Retiro", monto + "$", "No procede retiro");
        }
    }

    private static void imprimirEncabezado() {
        System.out.printf("%-25s | %-10s | %-20s%n", "Acción", "Monto", "saldo");
        System.out.println("------------------------------------------------------------------");
    }

    private static void imprimirFila(String accion, String monto, String saldo) {
        saldo = saldo.replace(".0$", "$");
        monto = monto.replace(".0$", "$");
        System.out.printf("%-25s | %-10s | %-20s%n", accion, monto, saldo);
    }
}