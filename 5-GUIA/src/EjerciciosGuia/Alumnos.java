package EjerciciosGuia;

public class Alumnos {
    private String nombre;
    private String Nacionalidad;

    /// CONSTRUCTOR.
    public Alumnos(String nombre, String nacionalidad) {
        if(nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if(nacionalidad == null || nacionalidad.isEmpty()) {
            throw new IllegalArgumentException("La nacionalidad no puede estar vacía");
        }
        this.nombre = nombre;
        Nacionalidad = nacionalidad;
    }
    /// GETTERS Y SETTERS.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
    /// TO STRING.
    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                '}';
    }
}
