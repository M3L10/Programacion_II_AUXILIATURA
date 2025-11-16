public class Producto {
    int id;
    String nombre;
    double precio;

    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "[" + id + "] " + nombre + " - $" + precio;
    }
}
