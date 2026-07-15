package reto2_cuenta_bancaria;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
    }
    // Getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    // Setters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("\nerror. el saldo no puede ser negativo");
        } else {
            this.saldo = saldo;
        }
    }

    public double depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("\nerror. el monto a depositar no puede ser negativo");
        }
        return saldo;
    }

    public double retirar(double monto) {
        if (saldo >= monto){
            saldo-=monto;
            return saldo;
        }else{
           System.out.println("\nerror. saldo insuficiente");
            return saldo;
        }

    }
}


