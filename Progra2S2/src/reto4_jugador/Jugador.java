package reto4_jugador;

public class Jugador {

    String nombre;
    public int vida;
    public int nivel;

    // Constructor sin parámetros
    public Jugador() {
        this("Jugador");
    }

    // Constructor con nombre
    public Jugador(String nombre) {
        this(nombre, 100);
    }

    // Constructor con nombre y vida
    public Jugador(String nombre, int vida) {
        this(nombre, vida, 1);
    }

    // Constructor principal
    public Jugador(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    // Método para recibir daño
    public void recibirDanio(int danio) {

        vida -= danio;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nombre + " recibió " + danio + " puntos de daño.");
        System.out.println("Vida actual: " + vida);

        if (vida == 0) {
            System.out.println(nombre + " ha muerto.");
        }

        System.out.println();
    }

    // Acción: Explorar
    public void explorar() {
        System.out.println(nombre + " exploró la selva y encontró un camino peligroso.");
        recibirDanio(10);
    }

    // Acción: Enfrentarse a un animal
    public void pelear() {
        System.out.println(nombre + " fue atacado por un animal salvaje.");
        recibirDanio(25);
    }

}