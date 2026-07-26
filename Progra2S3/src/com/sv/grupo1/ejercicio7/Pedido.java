package com.sv.grupo1.ejercicio7;

import java.util.ArrayList;

class Platillo {
    private String nombre;
    private double precio;

    // Constructor //
    public Platillo(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters and setters //
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

public class Pedido{
    ArrayList<Platillo> platillo;

    public Pedido(ArrayList<Platillo> platillo){
           this.platillo = platillo;
       }
       public double calcularTotal(){
           double suma = 0;
           for (int i = 0; i < platillo.size(); i++){
               suma += platillo.get(i).getPrecio();
           }
           System.out.println("El total de su pedido es de: $" + suma);
           return suma;
       }
}
