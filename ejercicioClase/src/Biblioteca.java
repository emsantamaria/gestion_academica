import java.util.List;
/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Biblioteca {
    private String nombre;
    private List<Libro>libros;
    /**
     * Constructor por defecto
     */
    public Biblioteca() {
    }
    public Biblioteca(String nombre, List<Libro>libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public String listarLibros() {
        return "{" +
            ", libros='" + getLibros() + "'" +
            "}";
    }
    public boolean registrarLibro(Libro libro, List<Libro>libros){
        if(libro==null){
            return false;
        }
        libros.add(libro);
        return true;
    }
}
