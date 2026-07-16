import reto1_empleado.Empleado;
import reto2_cuenta_bancaria.CuentaBancaria;
import reto3_inventario.Inventario;
import reto3_inventario.Producto;
import reto4_jugador.Jugador;
import reto5_promedio.Alumno;
import reto5_promedio.Promedio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n- - - Reto 1 - - -");

        System.out.println("\nconstructor default:");
    Empleado empleado1 = new Empleado();
    empleado1.imprimirDetalles();

    Empleado empleado2 = new Empleado("1", 400.4);
        System.out.println("constructor con parametros idEmpleado y salario:");
    empleado2.imprimirDetalles();

        System.out.println("Validar salario no negativo:");
    empleado2.setSalario(-400.23);
    empleado2.imprimirDetalles();

        System.out.println("\n- - - Reto 2 - - -");

    CuentaBancaria cuenta1 = new CuentaBancaria(1, -1);

    cuenta1.setSaldo(500);
        System.out.println("\nsaldo inicial: "+ cuenta1.getSaldo());

    cuenta1.depositar(100.50);
        System.out.println("\ndeposito exitoso. saldo actual: "+ cuenta1.getSaldo());

    cuenta1.retirar(500);
        System.out.println("\nretiro exitoso. saldo actual: "+ cuenta1.getSaldo());

    cuenta1.retirar(1000);

        System.out.println("\n- - - Reto 3 - - -");

    Producto p1 = new Producto("p1", "1");
    Producto p2 = new Producto("p2", "2");
    Producto p3 = new Producto("p3", "3");

    Inventario inventario = new Inventario(new Producto[]{p1,p2,p3});

        Producto resultado1 = inventario.buscarPorCodigo("1");

        if (resultado1 != null) {
            System.out.println("\nEl producto con codigo '1' es: " + resultado1.getNombre());
        } else {
            System.out.println("Producto con código '1' no encontrado.");
        }

        Producto resultado3 = inventario.buscarPorCodigo("3");

        if (resultado3 != null) {
            System.out.println("\nEl producto con codigo '3' es: " + resultado3.getNombre());
        } else {
            System.out.println("\nProducto con código '3' no encontrado.");
        }

        System.out.println("\n- - - Reto 4 - - -");

        Scanner teclado = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("         AVENTURA EN LA SELVA");
        System.out.println("=========================================");
        System.out.println("Tu misión es sobrevivir mientras exploras");
        System.out.println("una selva llena de peligros.");
        System.out.println();

        System.out.print("Ingresa el nombre del jugador: ");
        String nombre = teclado.nextLine();

        Jugador jugador = new Jugador(nombre);

        int opcion;

        do {

            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Explorar la selva");
            System.out.println("2. Enfrentarse a un animal");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    jugador.explorar();
                    break;

                case 2:
                    jugador.pelear();
                    break;

                case 3:
                    System.out.println("\n¡Gracias por jugar Aventura en la Selva!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            if (jugador.vida == 0) {
                System.out.println("Game Over.");
                break;
            }

        } while (opcion != 3);

        teclado.close();




        System.out.println("\n- - - Reto 5 - - -");

    Alumno alumno1 = new Alumno("Alumno1", 9);
    Alumno alumno2 = new Alumno("Alumno2", 6.4);
    Alumno alumno3 = new Alumno("Alumno3", 8.4);

    Promedio promedio = new Promedio(new Alumno[] {alumno1, alumno2, alumno3});

    double resultadoPromedio = promedio.calcularPromedioGlobal();

        System.out.println("\npromedio global del salon:" +resultadoPromedio);
    }
}
