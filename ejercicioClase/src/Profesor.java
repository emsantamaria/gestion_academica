/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Profesor extends Persona{
    private String especialidad;
    /**
     * Constructor por defecto
     */
    public Profesor() {
        super();
    }
    /**
     * Constructor con parametros
     * @param nombre Nombre del profesor
     * @param edad Edad del profesor
     * @param especialidad Especialidad del profesor
     */
    public Profesor(String especialidad,Nombre nombre, int edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }
    public String getEspecialidad() {
        return this.especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }    
    public String enseniar() {
        return "JUJUJU ensenio jujuju" ;  
    }
}
