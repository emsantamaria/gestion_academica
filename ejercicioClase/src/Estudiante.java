/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Estudiante extends Persona {
    private String matricula;
    /**
     * Constructor por defecto
     */
    public Estudiante() {
        super();
    }
    public Estudiante(String matricula, Nombre nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String estudiar() {
        return "{ Estoy estudiando " + 
            "}";
    }
}
