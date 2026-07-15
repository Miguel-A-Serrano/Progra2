package reto3_inventario;

public class Producto {
    private String nombre;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public Producto(String nombre, String codigo) {
        this.nombre =  nombre;
        this.codigo =  codigo;
    }
}
