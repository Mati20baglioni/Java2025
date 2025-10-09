package Clases;

import Enums.TipoJuego;
import Interfaces.I_GuardarPartida;

import java.time.LocalDate;
import java.util.ArrayList;

public class JuegosFisicos extends Juegos implements I_GuardarPartida {

    /// CONSTRUCTOR.
    public JuegosFisicos(String nombre, TipoJuego tipo, LocalDate fecha, ArrayList<String> genero) {
        super(nombre, tipo, fecha, genero);
    }
    /// GETTERS Y SETTERS.

    /// METODOS.
    @Override
    public boolean guardarPartida() {
        return true;
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "JuegosFisicos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", fecha=" + fecha +
                ", Genero=" + caracteristicas +
                '}';
    }
}
