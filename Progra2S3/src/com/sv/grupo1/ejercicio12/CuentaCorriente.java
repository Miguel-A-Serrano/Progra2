package com.sv.grupo1.ejercicio12;

public class CuentaCorriente extends Cuenta {

    private final double limiteSobregiro = 115.00;

    public CuentaCorriente() {
        super();
    }

    private boolean puedeRetirar(double monto) {
        return monto <= (this.saldo + this.limiteSobregiro);
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a 0.");
            return false;
        }

        if (puedeRetirar(monto)) {
            this.saldo -= monto;
            return true;
        } else {
            return false;
        }
    }
}