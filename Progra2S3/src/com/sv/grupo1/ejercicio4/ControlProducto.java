package com.sv.grupo1.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlProducto {
    private ArrayList<Producto> productos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        productos.add(new Producto("Teclado", 25.50));

        int opcion = 0;
        while (opcion != 5) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    verPrecios();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    modificarNombre();
                    break;
                case 4:
                    agregarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        sc.close();
    }

    public void mostrarMenu() {
        System.out.println("\n===== MENU DE PRODUCTOS =====");
        System.out.println("1. Ver precio");
        System.out.println("2. Modificar precio");
        System.out.println("3. Modificar nombre de producto");
        System.out.println("4. Agregar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void verPrecios() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.print((i + 1) + ". ");
            productos.get(i).mostrarFicha();
        }
    }

    public void modificarPrecio() {
        verPrecios();
        System.out.print("Número del producto: ");
        int posicion = sc.nextInt();
        System.out.print("Nuevo precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        productos.get(posicion - 1).setPrecio(precio);
        System.out.println("Precio actualizado");
    }

    public void modificarNombre() {
        verPrecios();
        System.out.print("Número del producto: ");
        int posicion = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();

        productos.get(posicion - 1).setNombre(nombre);
        System.out.println("Nombre actualizado");
    }

    public void agregarProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        productos.add(new Producto(nombre, precio));
        System.out.println("Producto agregado");
    }
}
