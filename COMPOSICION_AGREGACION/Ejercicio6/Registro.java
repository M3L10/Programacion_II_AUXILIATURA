import java.util.Date;

public class Registro {
    int registroId;
    String descripcion;
    Date fecha;

    public Registro(int registroId, String descripcion){
        this.registroId = registroId;
        this.descripcion = descripcion;
        this.fecha = new Date();
    }

    @Override
    public String toString(){
        return "Registro " + registroId + ": " + descripcion + " (" + fecha + ")";
    }
}
