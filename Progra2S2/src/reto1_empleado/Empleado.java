package reto1_empleado;

public class Empleado {
    private String idEmpleado;
    private double salario;

    //Constructor 1: sin parametros, el salario por defecto es 0
    public Empleado(){
        this.idEmpleado = "ID no encontrada";
        this.salario = 0.0;
    }
    //Constructor 2: Acepta ambos parametros
    public Empleado(String idEmpleado, double salario ) {
        this.idEmpleado = idEmpleado;
        setSalario(salario);
    }
    public void imprimirDetalles() {
        System.out.println("\nID :" + idEmpleado + "\nsalario:" + salario);
    }
    // Getters
    public String getIdEmpleado() {
        return idEmpleado;
    }
    public double getSalario() {
        return salario;
    }
    // Setters
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public void setSalario(double salario) {
        if (salario >= 0){
            this.salario = salario;
        }else {
            System.out.println("\nerror. el salario no puede ser negativo");
            this.salario = 0.0;
        }
    }
}
