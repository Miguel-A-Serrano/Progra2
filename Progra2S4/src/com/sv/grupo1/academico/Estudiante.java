package com.sv.grupo1.academico;

/**
 * La clase {@code Estudiante} representa a un alumno dentro del sistema académico.
 * Contiene la información básica personal y académica del estudiante, como su carnet,
 * nombre, edad y la carrera que cursa.
 *
 * @author Grupo 1
 * @version 1.0
 */
public class Estudiante {

    /** El número de identificación único del estudiante. */
    private int carnet;

    /** El nombre completo del estudiante. */
    private String nombre;

    /** La edad del estudiante en años. */
    private int edad;

    /** El nombre de la carrera en la que el estudiante está inscrito. */
    private String carrera;

    /**
     * Constructor de la clase {@code Estudiante}.
     * Inicializa un nuevo objeto con los datos proporcionados.
     *
     * @param carnet  El número de identificación único del estudiante.
     * @param nombre  El nombre del estudiante.
     * @param edad    La edad del estudiante.
     * @param carrera La carrera académica del estudiante.
     */
    public Estudiante(int carnet, String nombre, int edad, String carrera) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return Una cadena de texto con el nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del estudiante.
     *
     * @param nombre El nuevo nombre que se asignará al estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     *
     * @return Un número entero que representa la edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad del estudiante.
     *
     * @param edad La nueva edad que se asignará al estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la carrera del estudiante.
     *
     * @return Una cadena de texto con el nombre de la carrera.
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Modifica la carrera del estudiante.
     *
     * @param carrera El nuevo nombre de la carrera que se asignará al estudiante.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Obtiene el número de carnet del estudiante.
     *
     * @return El número de carnet del estudiante.
     */
    public int getCarnet() {
        return carnet;
    }

    /**
     * Modifica el número de carnet del estudiante.
     *
     * @param carnet El nuevo número de carnet que se asignará al estudiante.
     */
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    /**
     * Devuelve una representación en forma de cadena de texto (String) de los datos del estudiante.
     * El formato incluye saltos de línea para mostrar el nombre, edad, carrera y carnet de forma legible.
     *
     * @return Una cadena de texto con la información detallada del estudiante.
     */
    @Override
    public String toString(){
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\nCarrera: " + carrera + "\nCarnet: " + carnet;
    }
}