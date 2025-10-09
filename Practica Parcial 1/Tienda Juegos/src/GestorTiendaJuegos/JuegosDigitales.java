package GestorTiendaJuegos;

import java.util.ArrayList;

public class JuegosDigitales extends Productos{
    private double tamañoEnGb;

    /// CONSTRUCTOR.
    public JuegosDigitales(String nombre, double precio, ArrayList<String> etiquetas, TipoDeProducto tipo, double tamañoEnGb) {
        super(nombre, precio, etiquetas, tipo);
        this.tamañoEnGb = tamañoEnGb;
    }
    /// GETTERS Y SETTERS.
    public double getTamañoEnGb() {
        return tamañoEnGb;
    }

    public void setTamañoEnGb(double tamañoEnGb) {
        this.tamañoEnGb = tamañoEnGb;
    }
    /// METODOS.

    public boolean esLigero() {
        return tamañoEnGb < 5.0;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "JuegosDigitales{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", etiquetas=" + etiquetas +
                ", tipo=" + tipo +
                ", tamañoEnGb=" + tamañoEnGb +
                '}';
    }
}
