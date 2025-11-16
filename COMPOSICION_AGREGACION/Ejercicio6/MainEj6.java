public class MainEj6 {
    public static void main(String[] args){
        Inventario inv = new Inventario();

        // Creación de productos (se agregan al inventario)
        Medicamento m1 = new Medicamento(1, "Paracetamol", 2.5, "500mg", "2026-12-31");
        Medicamento m2 = new Medicamento(2, "Ibuprofeno", 3.0, "400mg", "2025-06-30");
        ProductoNoMedicinal p1 = new ProductoNoMedicinal(10, "Shampoo", 5.0, "Higiene", "MarcaX");

        inv.agregarProducto(m1);
        inv.agregarProducto(m2);
        inv.agregarProducto(p1);

        // Listar productos (demuestra composición)
        inv.listarProductos();

        // Crear registro fuera (agregación) y asociarlo
        Registro r1 = new Registro(100, "Ingreso de lote 1");
        inv.agregarRegistro(r1);

        inv.listarRegistros();

        // Buscar medicamento
        Medicamento busc = inv.buscarMedicamento("Ibuprofeno");
        System.out.println("Resultado búsqueda 'Ibuprofeno': " + (busc != null ? busc : "No encontrado"));
    }
}
