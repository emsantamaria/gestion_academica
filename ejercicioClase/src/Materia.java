/**
 * @author emsantamaria
 * @version 1.0.0
 */
import java.util.Objects;
/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Materia {
    private String nombre;
    private String codigo;
    /**
     * Constructor por defecto
     */
    public Materia() {
    }
    /**
     * Constructor con parametros
     * @param nombre
     * @param codigo
     */
    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Materia)) {
            return false;
        }
        Materia materia = (Materia) o;
        return Objects.equals(codigo, materia.codigo);
    }
    public String accederADetalles() {
        return toString();
    }
 @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            "}";
    }

}
