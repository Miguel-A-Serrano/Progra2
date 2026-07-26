package com.sv.grupo1.ejercicio9;
import com.sv.grupo1.ejercicio7.Pedido;

public class Facturacion {
    private char metod;

    public Facturacion(char metod){
        this.metod = metod;
    }
    public void TipoPago(Pedido total){
        double suma = total.calcularTotal();
        switch (metod){
            case 'E':
                double descuento = suma * 0.10;
                suma -= descuento;
                System.out.println("Por pago en efectivo, su total con 10% de descuento es de $" + suma);
                break;
            case 'T':
                double recargo = suma * 0.03;
                suma += recargo;
                System.out.println("Por pago con tarjeta, su total con 3% de recargo es de $" + suma);
                break;
        }
    }

}
