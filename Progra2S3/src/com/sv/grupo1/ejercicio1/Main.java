package com.sv.grupo1.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Paciente paciente = new Paciente();

        System.out.print("Ingrese el nombre del paciente: ");
        paciente.setNombre(entrada.nextLine());

        System.out.print("Ingrese la edad: ");
        paciente.setEdad(entrada.nextInt());

        System.out.print("Ingrese el peso (kg): ");
        paciente.setPeso(entrada.nextDouble());

        paciente.mostrarFicha();

        entrada.close();
    }
}
