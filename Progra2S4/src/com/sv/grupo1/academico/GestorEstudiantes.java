package com.sv.grupo1.academico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorEstudiantes {
    private List<Estudiante> listaEstudiantes;

    public GestorEstudiantes() {
        this.listaEstudiantes = new ArrayList<>();
    }

    //Getter de la lista de estudiantes
    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    //Método para la muestra de datos
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

    //Métodos para validación al agregar un estudiante y muestras
    public boolean agregarEstudiante(Estudiante nuevoEstudiante) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCarnet() == nuevoEstudiante.getCarnet()) {
                System.out.println("Error. Ya existe un estudiante con el carnet: " + nuevoEstudiante.getCarnet());
                return false;
            }
        }
        return listaEstudiantes.add(nuevoEstudiante);
    }

    public void mostrarRegistros () {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
    public void buscarPorCarnet(int carnetEstudiante){
            for (Estudiante estudiante: this.listaEstudiantes){
                if (estudiante != null && estudiante.getCarnet() == carnetEstudiante){
                    System.out.println(estudiante);
                    return;
                }
            }
            System.out.println("No se ha encontrado ningun estudiante con el carnet: " + carnetEstudiante);
        }

        //Métodos para modificación de información
    public void modificarNombre(int carnetEstudiante, String nuevoNombre) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCarnet() == carnetEstudiante) {
                listaEstudiantes.get(i).setNombre(nuevoNombre);
                return;
            }
        }
        System.out.println("No se ha encontrado ningun estudiante con el carnet :" + carnetEstudiante);
    }

    public void modificarEdad(int carnetEstudiante, int nuevaEdad) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCarnet() == carnetEstudiante) {
                listaEstudiantes.get(i).setEdad(nuevaEdad);
                return;
            }
        }
        System.out.println("No se ha encontrado ningun estudiante con el carnet :" + carnetEstudiante);
    }

    public void modificarCarrera(int carnetEstudiante, String nuevaCarrera){
        for (int i = 0;i < listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getCarnet() == carnetEstudiante){
                listaEstudiantes.get(i).setCarrera(nuevaCarrera);
                return;
            }
        }
        System.out.println("No se ha encontrado ningun estudiante con el carnet :" + carnetEstudiante);
    }

    //Método de obtención de información y muestra
    public int obtenerTotalRegistros() {
        return listaEstudiantes.size();
    }

    public boolean existeEstudiante(int carnetEstudiante) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCarnet() == carnetEstudiante) {
                return true;
            }
        }
        return false;
    }

}
