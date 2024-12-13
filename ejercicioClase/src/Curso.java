/**
 * @author emsantamaria
 * @version 1.0.0
 */
import java.util.List;
import java.util.Objects;
/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Curso {
    private String nombre;
    private String codigo;
    private List<Estudiante>estudiantes;
    /**
     * Constructor por defecto
     */
    public Curso() {

    }
    /**
     * Constructor con parametros
     * @param nombre
     * @param codigo
     * @param estudiantes
     */
    public Curso(String nombre, String codigo, List<Estudiante>estudiantes){
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes =estudiantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public Curso codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Curso)) {
            return false;
        }
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo) ;
    }
    public String listarEstudiantes() {
        return "{" +
            ", estudiantes:'" + getEstudiantes() + "'" +
            "}";
    }
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", estudiantes='" + getEstudiantes() + "'" +
            "}";
    }
}
