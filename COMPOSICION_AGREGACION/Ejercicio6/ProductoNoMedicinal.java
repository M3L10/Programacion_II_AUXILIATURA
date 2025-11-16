public class ProductoNoMedicinal extends Producto {
    String categoria;
    String marca;

    public ProductoNoMedicinal(int id, String nombre, double precio, String categoria, String marca){
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    @Override
    public String toString(){
        return super.toString() + " (" + categoria + " - " + marca + ")";
    }
}
