package com.sv.grupo1.academico;

/**
 * Clase principal que sirve como punto de entrada de la aplicación.
 * Proporciona un menú interactivo en consola para gestionar los registros
 * de los estudiantes, permitiendo al usuario realizar operaciones como visualizar,
 * buscar, agregar y modificar información utilizando la clase {@link GestorEstudiantes}.
 *
 * @author Grupo 1
 * @version 1.0
 */
public class Main {

    /** Constante para la opción del menú principal: Mostrar el número total de registros. */
    public static final int MOSTRAR_TOTAL_REGISTROS = 1;

    /** Constante para la opción del menú principal: Mostrar todos los detalles de los registros. */
    public static final int MOSTRAR_TODO = 2;

    /** Constante para la opción del menú principal: Buscar un estudiante específico por su carnet. */
    public static final int BUSCAR_POR_CARNET = 3;

    /** Constante para la opción del menú principal: Agregar un nuevo registro de estudiante. */
    public static final int AGREGAR = 4;

    /** Constante para la opción del menú principal: Modificar un registro de estudiante existente. */
    public static final int MODIFICAR_REGISTRO = 5;

    /** Constante para la opción del menú principal: Salir de la ejecución del programa. */
    public static final int SALIR = 6;

    /** Constante para el submenú de modificación: Cambiar el nombre del estudiante. */
    public static final int MODIFICAR_NOMBRE = 1;

    /** Constante para el submenú de modificación: Cambiar la edad del estudiante. */
    public static final int MODIFICAR_EDAD = 2;

    /** Constante para el submenú de modificación: Cambiar la carrera del estudiante. */
    public static final int MODIFICAR_CARRERA = 3;

    /** Constante para el submenú de modificación: Cancelar la operación y volver al menú principal. */
    public static final int CANCELAR = 4;

    /**
     * Método principal que inicia la ejecución de la aplicación.
     * Instancia el gestor, carga un set de datos de prueba y despliega un bucle
     * iterativo que captura la entrada del usuario a través de {@link ScannerUtils}
     * para navegar por las distintas opciones del sistema.
     *
     * @param args Argumentos de la línea de comandos (no son utilizados en esta implementación).
     */
    public static void main(String[] args) {

        // Menú
        GestorEstudiantes listaEstudiantes = new GestorEstudiantes();
        listaEstudiantes.cargarDatosIniciales();
        while (true) {
            int opcionElegida = ScannerUtils.capturarNumero("""
                    \nQue desea hacer en el gestor de estudiantes?
                    1. Mostrar numero total de registros
                    2. Mostrar los detalles de cada registro
                    3. Buscar un registro por numero de carnet
                    4. Agregar un registro 
                    5. Modificar un registro por numero de carnet
                    6. Salir del programa
                    """);
            System.out.println("\nOpcion elegida: " + opcionElegida);

            switch (opcionElegida){
                case MOSTRAR_TOTAL_REGISTROS -> {
                    int totalRegistros = listaEstudiantes.obtenerTotalRegistros();

                    System.out.println("Total de registros dentro del gestor: " + totalRegistros);
                }
                case MOSTRAR_TODO -> {
                    listaEstudiantes.mostrarRegistros();
                }
                case BUSCAR_POR_CARNET -> {
                    int carnetEstudiante = ScannerUtils.capturarNumero("Ingrese el carnet del registro que desea");
                    listaEstudiantes.buscarPorCarnet(carnetEstudiante);
                }
                case AGREGAR -> {

                    int carnetEstudiante = ScannerUtils.capturarNumero("Ingrese el numero de carnet del estudiante");
                    if (listaEstudiantes.existeEstudiante(carnetEstudiante)){
                        System.out.println("\nError. Ya existe un registro con este numero de carnet: " + carnetEstudiante);
                    }else {
                        String nombre = ScannerUtils.capturarTexto("Ingrese el nombre del estudiante");
                        int edad = ScannerUtils.capturarNumero("Ingrese la edad del estudiante");
                        String carrera = ScannerUtils.capturarTexto("Ingrese la carrera del estudiante");

                        System.out.println("\nRegistro del nuevo estudiante:");

                        Estudiante nuevoEstudiante = new Estudiante(carnetEstudiante, nombre, edad, carrera);
                        listaEstudiantes.agregarEstudiante(nuevoEstudiante);
                        listaEstudiantes.buscarPorCarnet(carnetEstudiante);
                    }

                }
                case MODIFICAR_REGISTRO -> {
                    int carnetEstudiante = ScannerUtils.capturarNumero("Ingrese el numero de carnet del registro que desea modificar");

                    if (listaEstudiantes.existeEstudiante(carnetEstudiante)) {
                        System.out.println("\nEstudiante encontrado. Datos actuales del registro: ");
                        listaEstudiantes.buscarPorCarnet(carnetEstudiante);
                        boolean modificando = true;
                        while(modificando) {
                            int opcionModificar = ScannerUtils.capturarNumero("""
                                    \nQue desea modificar del registro?
                                    1. Nombre
                                    2. Edad
                                    3. Carrera
                                    4. Cancelar
                                    """);
                            switch (opcionModificar) {
                                case MODIFICAR_NOMBRE -> {
                                    String nombreNuevo = ScannerUtils.capturarTexto("Ingrese el nombre: ");
                                    listaEstudiantes.modificarNombre(carnetEstudiante, nombreNuevo);

                                    System.out.println("\nRegistro actualizado:");
                                    listaEstudiantes.buscarPorCarnet(carnetEstudiante);
                                    modificando = false;
                                }
                                case MODIFICAR_EDAD -> {
                                    int edadNueva = ScannerUtils.capturarNumero("Ingrese la edad: ");
                                    listaEstudiantes.modificarEdad(carnetEstudiante, edadNueva);

                                    System.out.println("\nRegistro actualizado:");
                                    listaEstudiantes.buscarPorCarnet(carnetEstudiante);
                                    modificando = false;
                                }
                                case MODIFICAR_CARRERA -> {
                                    String carreraNueva = ScannerUtils.capturarTexto("Ingrese la carrera");
                                    listaEstudiantes.modificarCarrera(carnetEstudiante, carreraNueva);

                                    System.out.println("\nRegistro actualizado:");
                                    listaEstudiantes.buscarPorCarnet(carnetEstudiante);
                                    modificando = false;
                                }
                                case CANCELAR -> {
                                    System.out.println("\nRegresando al menu principal");
                                    modificando = false;
                                }
                                default -> {
                                    System.out.println("\nOpcion no valida. Intente de nuevo");
                                }
                            }
                        }
                    }else {
                        System.out.println("Error. No se ha encontrado a ningun estudiante con el carnet: " + carnetEstudiante);
                    }
                }
                case SALIR -> {
                    System.out.println("Gracias por utilizar nuestra plataforma.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opción no válida. Por favor, seleccione un número del 1 al 6.");
                }
            }
        }
    }
}