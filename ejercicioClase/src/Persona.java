/**
 * @author emsantamaria
 * @version 1.0.0
 */
public abstract class Persona {
    private Nombre nombre;
    private int edad;
    /**
     * Constructor por defecto
     */
    public Persona() {
    }
    /**
     * Constructor con todos los atributos
     * @param nombre
     * @param edad
     */
    public Persona(Nombre nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Nombre getNombre() {
        return this.nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String saludar() {
        return
            " Hola mi nombre es " + nombre + "" +
            "y mi edad es de" + edad +" años" ;
    }
     @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }
}
