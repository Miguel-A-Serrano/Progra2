package com.sv.grupo1.ejercicio19;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente miCuenta = new CuentaCorriente();

        System.out.println("--- Sistema Bancario (Manejo de Excepciones) ---");
        miCuenta.depositar(500);
        System.out.println("Saldo inicial tras depósito: $" + miCuenta.getSaldo());

        System.out.println("\n-> Intentando retirar $300...");
        try {
            miCuenta.retirar(300);
            System.out.println("Retiro exitoso. Saldo actual: $" + miCuenta.getSaldo());
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        System.out.println("\n-> Intentando retirar $400...");
        try {
            miCuenta.retirar(400);
            System.out.println("Retiro exitoso. Saldo actual: $" + miCuenta.getSaldo());
        } catch (Exception e) {
            System.out.println("¡Excepción capturada!");
            System.out.println("Detalle: " + e.getMessage());
        }

        System.out.println("\nEl programa no se cerró de forma abrupta y continúa su ejecución con normalidad.");
        System.out.println("Saldo final intacto tras el error: $" + miCuenta.getSaldo());
    }
}