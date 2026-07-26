package com.sv.grupo1.ejercicio10;

import java.util.ArrayList;

public class AsociacionComunal {
    private String nombreComunidad;
    private ArrayList<Habitante> listaHabitantes;

    public AsociacionComunal(String nombreComunidad){
        this.nombreComunidad = nombreComunidad;
        this.listaHabitantes = new ArrayList<>();


    }
    public void agregarHabitante(Habitante habitante){
        listaHabitantes.add(habitante);
        System.out.println(habitante.toString() + " ha sido agregado a la comunidad exitosamente");
    }

    public int obtenerTotalHabitantes(){
        return listaHabitantes.size();
    }


    public void listarHabitantes(){
        if (listaHabitantes.isEmpty()){
            System.out.println("La comunidad no posee habitantes");
        }
        System.out.println("Habitantes pertenecientes a la comunidad:");
        for (int i = 0; i < listaHabitantes.size(); i++){
            System.out.println((i+1) + " " + listaHabitantes.get(i));
        }

    }

}
