package clases;

public class Especificacion {
    private String nombre;
    private String valor;

    public Especificacion() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Especificacion{" +
                "nombre='" + nombre + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
