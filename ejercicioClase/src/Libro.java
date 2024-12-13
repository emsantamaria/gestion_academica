/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Libro {
    private String titulo;
    private Nombre autor;
    /**
     * Constructor por defecto
     */
    public Libro() {
    }
    public Libro(String titulo, Nombre autor) {
        this.autor = autor;
        this.titulo= titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Nombre getAutor() {
        return this.autor;
    }

    public void setAutor(Nombre autor) {
        this.autor = autor;
    }


    public String mostrarDetalles() {
        return "{" +
            " titulo='" + titulo + "'" +
            ", autor='" + autor + "'" +
            "}";
    }

}
