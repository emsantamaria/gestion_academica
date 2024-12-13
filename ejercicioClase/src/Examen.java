/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Examen {
    private Fecha fecha;
    /**
     * Constructor por defecto
     */
    public Examen() {
    }
    /**
     * Constructor con parametros
     * @param fecha
     */
    public Examen(Fecha fecha){
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return this.fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public boolean programarFecha(int diaExamen, int mesExamen, int anioExamen){
        if(diaExamen<1||mesExamen<1){
            return false;
        }
        fecha.setMes(mesExamen);
        fecha.setDia(diaExamen);
        fecha.setAnio(anioExamen);
        return true;
    }

    @Override
    public String toString() {
        return "{" +
            " fecha='" + fecha + "'" +
            "}";
    }
}
