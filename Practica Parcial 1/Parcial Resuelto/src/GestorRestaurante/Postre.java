package GestorRestaurante;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Postre extends Preparaciones{
    public boolean azucar;

    /// CONSTRUCTOR.
    public Postre(String nombre, double precio, ArrayList<String> ingredientes, TipoPreparacion tipo, boolean azucar) {
        super(nombre, precio, ingredientes, tipo);
        this.azucar = azucar;
    }
    /// GETTERS Y SETTERS.
    public boolean isAzucar() {
        return azucar;
    }

    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Postre{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                ", tipo=" + tipo +
                ", azucar=" + azucar +
                '}';
    }
}
