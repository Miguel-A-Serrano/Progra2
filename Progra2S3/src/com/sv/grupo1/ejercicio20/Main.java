package com.sv.grupox.ejercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<EmpleadoTaller> plantilla = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int contadorJefes = 0;
        int contadorMecanicos = 0;

        final int MAX_JEFES = 4;
        final int MAX_MECANICOS = 20;

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("main() => \n--- SIMULADOR SISTEMA DE TALLER MECANICO ---");
            System.out.println("main() => 1. Agregar Jefe de Taller (" + contadorJefes + "/" + MAX_JEFES + ")");
            System.out.println("main() => 2. Agregar Mecanico (" + contadorMecanicos + "/" + MAX_MECANICOS + ")");
            System.out.println("main() => 3. Calcular y mostrar nomina total");
            System.out.println("main() => 4. Salir");
            System.out.print("main() => Selecciona una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (contadorJefes < MAX_JEFES) {
                        System.out.print("main() => Nombre del Jefe: ");
                        String nombreJefe = scanner.nextLine();
                        System.out.print("main() => ID: ");
                        String idJefe = scanner.nextLine();
                        System.out.print("main() => Horas extras trabajadas: ");
                        int horasJefe = scanner.nextInt();

                        plantilla.add(new JefeTaller(nombreJefe, idJefe, horasJefe));
                        contadorJefes++;
                        System.out.println("main() => Jefe registrado exitosamente");
                    } else {
                        System.out.println("main() => Se ha alcanzado el limite maximo de " + MAX_JEFES + " jefes.");
                    }
                    break;

                case 2:
                    if (contadorMecanicos < MAX_MECANICOS) {
                        System.out.print("main() => Nombre del Mecanico: ");
                        String nombreMec = scanner.nextLine();
                        System.out.print("main() => ID: ");
                        String idMec = scanner.nextLine();
                        System.out.print("main() => Horas extras trabajadas: ");
                        int horasMec = scanner.nextInt();

                        plantilla.add(new Mecanico(nombreMec, idMec, horasMec));
                        contadorMecanicos++;
                        System.out.println("main() => ¡Mecanico registrado exitosamente!");
                    } else {
                        System.out.println("main() => Se ha alcanzado el limite maximo de " + MAX_MECANICOS + " mecAnicos.");
                    }
                    break;

                case 3:
                    if (plantilla.isEmpty()) {
                        System.out.println("main() => No hay empleados registrados en el taller todavia.");
                    } else {
                        double nominaTotal = 0.0;
                        System.out.println("main() => \n--- DESGLOSE DE NoMINA DE EMPLEADOS ---");

                        for (EmpleadoTaller emp : plantilla) {
                            double pagoEmpleado = emp.calcularSalarioTotal();
                            nominaTotal += pagoEmpleado;

                            String puesto = (emp instanceof JefeTaller) ? "Jefe de Taller" : "Mecanico";
                            System.out.println("main() => ID: " + emp.getId() + " | " + puesto + ": " + emp.getNombre() +
                                    " | Horas Extra: " + emp.getHorasExtras() + " | Total a pagar: $" + pagoEmpleado);
                        }

                        System.out.println("main() => -------------------------------------------");
                        System.out.println("main() => NoMINA TOTAL DEL TALLER: $" + nominaTotal);
                    }
                    break;

                case 4:
                    System.out.println("main() => Saliendo del sistema de gestion del taller...");
                    break;

                default:
                    System.out.println("main() => Opcion no valida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }
}