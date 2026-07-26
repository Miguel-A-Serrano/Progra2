package com.sv.grupo1.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Teclado", 25.50));

        System.out.println("\n- - - Ejercicio 4 - - -");

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n===== MENU DE PRODUCTOS =====");
            System.out.println("1. Ver precio");
            System.out.println("2. Modificar precio");
            System.out.println("3. Modificar nombre de producto");
            System.out.println("4. Agregar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < productos.size(); i++) {
                        Producto p = productos.get(i);
                        System.out.println((i + 1) + ". " + p.getNombre() + " // Precio: $" + p.getPrecio());
                    }
                    break;
                case 2:
                    System.out.print("Numero del producto: ");
                    int posPrecio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    productos.get(posPrecio - 1).setPrecio(precio);
                    System.out.println("Precio actualizado");
                    break;
                case 3:
                    System.out.print("Numero del producto: ");
                    int posNombre = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    productos.get(posNombre - 1).setNombre(sc.nextLine());
                    System.out.println("Nombre actualizado");
                    break;
                case 4:
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio del producto: ");
                    double precioNuevo = sc.nextDouble();
                    sc.nextLine();
                    productos.add(new Producto(nombre, precioNuevo));
                    System.out.println("Producto agregado");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

        sc.close();
    }
}
