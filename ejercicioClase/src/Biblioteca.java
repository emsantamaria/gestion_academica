import java.util.List;
/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Biblioteca {
    private static String nombre;
    private static List<Libro>libros;
    /**
     * Constructor por defecto
     */
    public Biblioteca() {
    }
    public Biblioteca(String nombre, List<Libro>libros) {
        if(nombre==null){
            this.nombre="";
        }else{
            this.nombre = nombre;
        }
         if(libros==null){
             this.libros=new ArraysList<>();
         }
        else{
            this.libros = libros;
        }
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
    static public String listarLibros() {
        return "{" +
            ", libros='" + getLibros() + "'" +
            "}";
    }
    static public boolean registrarLibro(Libro libro, List<Libro>libros){
        if(libro==null){
            return false;
        }
        libros.add(libro);
        return true;
    }
    @Override
    public String toString() {
        return "{" +nombre+libros+
            "}";
    }
}
