/**
 * @author emsantamaria
 * @version 1.0.0
 */
public class Nombre {
    private String nombre;
    private String apellido1;
    private String apellido2;
    /**
     *Constructor por defecto
     */
    public Nombre() {
    }
    /**
     *Constructor con parametros
     */
    public Nombre(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return 
            nombre + " " +
             apellido1 + " " +
             apellido2 + " " ;
            
    }

}
