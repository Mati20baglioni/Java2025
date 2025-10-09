package GestorTiendaJuegos;

import java.util.ArrayList;

public abstract class Productos {
    public String nombre;
    public double precio;
    public ArrayList<String>etiquetas=new ArrayList<>();
    public TipoDeProducto tipo;

    /// CONSTRUCTORES.
    public Productos(String nombre, double precio, ArrayList<String> etiquetas, TipoDeProducto tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.etiquetas = etiquetas;
        this.tipo = tipo;
    }

    public Productos() {
    }

    /// GETTERS Y SETTER.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public TipoDeProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeProducto tipo) {
        this.tipo = tipo;
    }

    /// METODOS.



    /// TO STRINGS.
    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", etiquetas=" + etiquetas +
                ", tipo=" + tipo +
                '}';
    }
}
