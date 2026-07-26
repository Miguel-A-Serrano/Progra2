package com.sv.grupo1.ejercicio7;
import com.sv.grupo1.ejercicio8.ClienteGimnasio;
import com.sv.grupo1.ejercicio9.Facturacion;
import java.util.ArrayList;

public class Controlador {
    static void main(String[] args) {

        System.out.println("--- EJERCICIO 7 ---");

        Platillo mesa1 = new Platillo("Pasta", 6.75);
        Platillo mesa2 = new Platillo("Pupusas", 1.50);
        Platillo mesa3 = new Platillo("Tacos", 3.95);
        Platillo mesa4 = new Platillo("Churrasco", 12.00);

        System.out.println("Su orden es:");
        System.out.println("Plato: " + mesa1.getNombre() + "// Precio: $" + mesa1.getPrecio());
        System.out.println("Plato: " + mesa2.getNombre() + "// Precio: $" + mesa2.getPrecio());
        System.out.println("Plato: " + mesa3.getNombre() + "// Precio: $" + mesa3.getPrecio());
        System.out.println("Plato: " + mesa4.getNombre() + "// Precio: $" + mesa4.getPrecio());

        ArrayList<Platillo> lista1 = new ArrayList<>();
        lista1.add(mesa1);
        lista1.add(mesa2);
        lista1.add(mesa3);
        lista1.add(mesa4);

        Pedido pedido1 = new Pedido(lista1);
        pedido1.calcularTotal();

        System.out.println("--- EJERCICIO 8 ---");

        ClienteGimnasio p1 = new ClienteGimnasio("Javier Gonzalez");
        p1.registrarEntrada();
        p1.registrarEntrada();
        p1.registrarEntrada();

        System.out.println("--- EJERCICIO 9 ---");

        Facturacion bill = new Facturacion('T');
        bill.TipoPago(pedido1);
    }
}
