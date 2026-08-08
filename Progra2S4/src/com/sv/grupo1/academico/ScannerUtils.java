package com.sv.grupo1.academico;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase utilitaria para la captura y validación de datos ingresados por consola.
 * Proporciona métodos seguros para leer texto y números, manejando excepciones
 * y evitando que la aplicación se detenga por entradas de datos incorrectas.
 *
 * @author Grupo 1
 * @version 1.0
 */
public class ScannerUtils {

    /**
     * Instancia global y constante de {@link Scanner} compartida por toda la clase
     * para leer los flujos de entrada del sistema (consola).
     */
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * Muestra un mensaje en consola y captura una cadena de texto ingresada por el usuario.
     * Este método valida que la entrada no esté vacía y que contenga únicamente letras
     * (incluyendo acentos y la letra 'ñ') y espacios en blanco. Si la entrada es inválida,
     * solicita el dato nuevamente hasta que sea correcto.
     *
     * @param mensaje El texto que se mostrará en consola para solicitar el dato al usuario.
     * @return La cadena de texto validada y sin espacios en blanco al inicio o al final.
     */
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

    /**
     * Muestra un mensaje en consola y captura un número entero ingresado por el usuario.
     * Este método maneja internamente la excepción {@link InputMismatchException} para
     * evitar que el programa falle si el usuario ingresa texto en lugar de un número.
     * Si la entrada es inválida, limpia el buffer de entrada y solicita el dato nuevamente.
     *
     * @param mensaje El texto que se mostrará en consola para solicitar el número al usuario.
     * @return El número entero válido ingresado por el usuario.
     */
    public static int capturarNumero(String mensaje) {
        while (true) {
            System.out.print(mensaje + ":");
            try {
                int valorEntrada = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                return valorEntrada;
            } catch (InputMismatchException error) {
                System.out.println("Error. El campo solo debe contener numeros. Intente de nuevo");
                scanner.nextLine(); // Limpiar el buffer de entrada en caso de error
            }
        }
    }

}