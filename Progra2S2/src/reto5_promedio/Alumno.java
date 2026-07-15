package reto5_promedio;

public class Alumno {
    private String nombre;
    private double calificacion;

    public Alumno(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    //getters
    public double getCalificacion() {
        return calificacion;
    }
    public String getNombre() {
        return nombre;
    }
    //setters
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
