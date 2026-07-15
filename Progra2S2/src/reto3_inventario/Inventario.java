package reto3_inventario;

public class  Inventario {
    private Producto[] productos;

    public Inventario(Producto[] productos) {
        this.productos = productos;
    }
    //setter
    public void setProducto(Producto[] productos) {
        this.productos = productos;
    }
    //getter
    public Producto[] getProducto() {
        return productos;
    }


    public Producto buscarPorCodigo(String codigoBuscado){
        for (int i=0; i < this.productos.length; i++){
            if (this.productos[i].getCodigo().equals(codigoBuscado)){
                return this.productos[i];
            }
        }
        return null;
    }
}
