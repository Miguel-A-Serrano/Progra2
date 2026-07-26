package com.sv.grupo1.ejercicio19;

public class CuentaCorriente extends Cuenta {

    private final double limiteSobregiro = 115.00;

    public CuentaCorriente() {
        super();
    }

    private boolean puedeRetirar(double monto) {
        return monto <= (this.saldo + this.limiteSobregiro);
    }

    public void retirar(double monto) throws Exception {
        if (monto <= 0) {
            throw new Exception("Error: El monto a retirar debe ser mayor a 0.");
        }

        if (puedeRetirar(monto)) {
            this.saldo -= monto;
        } else {
            throw new Exception(
                    "Error de Retiro: Fondos insuficientes. El monto solicitado supera el saldo actual y el sobregiro autorizado."
            );
        }
    }
}