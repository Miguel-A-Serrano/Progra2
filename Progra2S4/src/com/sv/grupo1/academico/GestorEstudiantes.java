package com.sv.grupo1.academico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * La clase {@code GestorEstudiantes} se encarga de administrar una colección de objetos de tipo {@link Estudiante}.
 * Proporciona métodos para cargar datos de prueba, agregar nuevos estudiantes con validaciones,
 * buscar, mostrar y modificar la información de los estudiantes existentes.
 *
 * @author Grupo 1
 * @version 1.0
 */
public class GestorEstudiantes {

    /**
     * Lista que almacena los registros de los estudiantes.
     */
    private List<Estudiante> listaEstudiantes;

    /**
     * Constructor por defecto de la clase {@code GestorEstudiantes}.
     * Inicializa la lista de estudiantes como un {@link ArrayList} vacío.
     */
    public GestorEstudiantes() {
        this.listaEstudiantes = new ArrayList<>();
    }

    /**
     * Obtiene la lista completa de los estudiantes registrados.
     *
     * @return Una lista de tipo {@link List} que contiene los objetos {@code Estudiante}.
     */
    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    /**
     * Carga un conjunto de 25 registros iniciales (datos de prueba) en la lista de estudiantes.
     * Cada estudiante se genera automáticamente con un carnet secuencial a partir del 202601,
     * nombres genéricos y una edad alternada entre 18 y 19 años.
     */
    public void cargarDatosIniciales(){
        Estudiante[] arregloInicial = new Estudiante[25];
        for (int i = 0; i < arregloInicial.length; i++) {
            arregloInicial[i] = new Estudiante(
                    202600 + (i + 1),
                    "Estudiante" + (i + 1),
                    18 + (i%2),
                    "Ingenieria en Desarrollo de software"

            );
        }
        listaEstudiantes = new ArrayList<>(Arrays.asList(arregloInicial));
    }

    /**
     * Agrega un nuevo estudiante a la lista verificando que su carnet no esté duplicado.
     *
     * @param nuevoEstudiante El objeto {@code Estudiante} que se desea registrar.
     * @return {@code true} si el estudiante se agregó correctamente;
     *         {@code false} si ya existe un estudiante con el mismo carnet.
     */
    public boolean agregarEstudiante(Estudiante nuevoEstudiante) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCarnet() == nuevoEstudiante.getCarnet()) {
                System.out.println("Error. Ya existe un estudiante con el carnet: " + nuevoEstudiante.getCarnet());
                return false;
            }
        }
        return listaEstudiantes.add(nuevoEstudiante);
    }

    /**
     * Muestra por consola la información de todos los estudiantes registrados actualmente.
     */
    public void mostrarRegistros () {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }

    /**
     * Busca un estudiante en la lista utilizando su número de carnet e imprime su información
     * si lo encuentra. De lo contrario, notifica que no fue encontrado.
     *
     * @param carnetEstudiante El número de carnet del estudiante a buscar.
     */
    public void buscarPorCarnet(int carnetEstudiante){
        for (Estudiante estudiante: this.listaEstudiantes){
            if (estudiante != null && estudiante.getCarnet() == carnetEstudiante){
                System.out.println(estudiante);
                return;
            }
        }
        System.out.println("No se ha encontrado ningun estudiante con el carnet: " + carnetEstudiante);
    }

    /**
     * Modifica el nombre de un estudiante existente buscándolo por su carnet.
     *
     * @param carnetEstudiante El número de carnet del estudiante a modificar.
     * @param nuevoNombre El nuevo nombre que se le asignará al estudiante.
     */
    public void modificarNombre(int carnetEstudiante, String nuevoNombre) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCarnet() == carnetEstudiante) {
                listaEstudiantes.get(i).setNombre(nuevoNombre);
                return;
            }
        }
        System.out.println("No se ha encontrado ningun estudiante con el carnet :" + carnetEstudiante);
    }

    /**
     * Modifica la edad de un estudiante existente buscándolo por su carnet.
     *
     * @param carnetEstudiante El número de carnet del estudiante a modificar.
     * @param nuevaEdad La nueva edad que se le asignará al estudiante.
     */
    public void modificarEdad(int carnetEstudiante, int nuevaEdad) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCarnet() == carnetEstudiante) {
                listaEstudiantes.get(i).setEdad(nuevaEdad);
                return;
            }
        }
        System.out.println("No se ha encontrado ningun estudiante con el carnet :" + carnetEstudiante);
    }

    /**
     * Modifica la carrera de un estudiante existente buscándolo por su carnet.
     *
     * @param carnetEstudiante El número de carnet del estudiante a modificar.
     * @param nuevaCarrera El nuevo nombre de la carrera que se le asignará.
     */
    public void modificarCarrera(int carnetEstudiante, String nuevaCarrera){
        for (int i = 0;i < listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getCarnet() == carnetEstudiante){
                listaEstudiantes.get(i).setCarrera(nuevaCarrera);
                return;
            }
        }
        System.out.println("No se ha encontrado ningun estudiante con el carnet :" + carnetEstudiante);
    }

    /**
     * Obtiene la cantidad total de estudiantes registrados en el sistema.
     *
     * @return El número total de registros en la lista.
     */
    public int obtenerTotalRegistros() {
        return listaEstudiantes.size();
    }

    /**
     * Verifica si un estudiante existe en el registro mediante su número de carnet.
     *
     * @param carnetEstudiante El número de carnet a verificar.
     * @return {@code true} si el estudiante se encuentra registrado; {@code false} en caso contrario.
     */
    public boolean existeEstudiante(int carnetEstudiante) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCarnet() == carnetEstudiante) {
                return true;
            }
        }
        return false;
    }

}