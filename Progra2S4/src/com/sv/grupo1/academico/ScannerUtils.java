package com.sv.grupo1.academico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {

    public static final Scanner scanner = new Scanner(System.in);

    public static String capturarTexto(String mensaje){
        while (true) {
            System.out.print(mensaje + ": ");
            String entrada = scanner.nextLine().trim();

            if (!entrada.isEmpty() && entrada.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
                return entrada;
            } else {
                System.out.println("Error: El campo solo debe contener letras y no puede estar vacío.");
            }
        }
    }

    public static int capturarNumero(String mensaje) {
        while (true) {
            System.out.print(mensaje + ":");
            try {
                int valorEntrada = scanner.nextInt();
                scanner.nextLine();
                return valorEntrada;
            } catch (InputMismatchException error) {
                System.out.println("Error. El campo solo debe contener numeros. Intente de nuevo");
                scanner.nextLine();
            }
        }
    }

}
