package models;

import enums.TipoPreparacion;

import java.util.List;
import java.util.Objects;

public abstract class Preparacion implements Comparable<Preparacion>{
    private String nombre;
    private double precio;
    private List<String> ingredientes;
    private TipoPreparacion tipo;

    public Preparacion(){

    }

    public Preparacion(String nombre, double precio, List<String> ingredientes, TipoPreparacion tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
    }

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

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public TipoPreparacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoPreparacion tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Preparacion o) {
        return Double.compare(precio,o.getPrecio());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Preparacion that)) return false;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "Preparacion{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                ", tipo=" + tipo +
                '}';
    }
}
