package GestorRestaurante;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public abstract class Preparaciones {
    public String nombre;
    public double precio;
    public ArrayList<String>ingredientes=new ArrayList<>();
    public TipoPreparacion tipo;

    /// CONSTRUCTOR.
    public Preparaciones(String nombre, double precio, ArrayList<String> ingredientes, TipoPreparacion tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
    }

    public Preparaciones() {
    }

    /// GETTERS Y SETTERS.
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

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public TipoPreparacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoPreparacion tipo) {
        this.tipo = tipo;
    }
    /// TO STRING.
    @Override
    public String toString() {
        return "Preparaciones{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                ", tipo=" + tipo +
                '}';
    }
}
