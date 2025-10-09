package GestorRestaurante;

import java.util.ArrayList;

public class Bebida extends Preparaciones{
    private boolean alcohol;

    /// CONSTRUCTOR.
    public Bebida(String nombre, double precio, ArrayList<String> ingredientes, TipoPreparacion tipo, boolean alcohol) {
        super(nombre, precio, ingredientes, tipo);
        this.alcohol = alcohol;
    }

    /// GETTERS Y SETTERS.
    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        alcohol = alcohol;
    }
    /// METODOS.
    public double calcularDescBebida() {
        if (alcohol) {
            return getPrecio() * 0.20;
        }
        return getPrecio()* 0.10;
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "Bebida{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                ", tipo=" + tipo +
                ", Alcohol=" + alcohol+
                '}';
    }
}
