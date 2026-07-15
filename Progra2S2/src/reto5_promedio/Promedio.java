package reto5_promedio;

public class Promedio {
    private Alumno[] alumnos;

    public Promedio(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    //setter
    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    //getter
    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public double calcularPromedioGlobal() {
        double suma = 0.0;
        for (Alumno alumno: alumnos) {
            suma += alumno.getCalificacion();
        }
        return suma/ this.alumnos.length;
    }
}
