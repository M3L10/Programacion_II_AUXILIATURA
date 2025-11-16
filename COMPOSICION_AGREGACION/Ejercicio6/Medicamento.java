public class Medicamento extends Producto {
    String dosis;
    String fechaVencimiento; // formato simple YYYY-MM-DD

    public Medicamento(int id, String nombre, double precio, String dosis, String fechaVencimiento){
        super(id, nombre, precio);
        this.dosis = dosis;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString(){
        return super.toString() + " (Med: " + dosis + ", venc: " + fechaVencimiento + ")";
    }
}
