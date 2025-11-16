import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos; // composición
    private List<Registro> registros; // agregación

    public Inventario(){
        this.productos = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    // Composición: Inventario contiene y controla la colección de productos
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void listarProductos(){
        System.out.println("Productos en inventario:");
        for(Producto p: productos) System.out.println("  " + p);
    }

    // Agregación: registro creado afuera y referenciado aquí
    public void agregarRegistro(Registro r){
        registros.add(r);
    }

    public void listarRegistros(){
        System.out.println("Registros asociados:");
        for(Registro r: registros) System.out.println("  " + r);
    }

    // Buscar medicamento por nombre (case-insensitive)
    public Medicamento buscarMedicamento(String nombre){
        for(Producto p: productos){
            if(p instanceof Medicamento && p.nombre.equalsIgnoreCase(nombre)){
                return (Medicamento)p;
            }
        }
        return null;
    }
}
