package Clases;

import Enums.TipoJuego;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Juegos {
    public static int contId=1;
    public int id;
    public String nombre;
    public TipoJuego tipo;
    public LocalDate fecha;
    public ArrayList<String>caracteristicas=new ArrayList<>();

    /// CONSTRUCTOR.
    public Juegos(String nombre, TipoJuego tipo, LocalDate fecha, ArrayList<String> genero) {
        this.id = contId++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        caracteristicas = genero;
    }
    public Juegos() {
    }
    /// GETTERS Y SETTERS.
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoJuego getTipo() {
        return tipo;
    }

    public void setTipo(TipoJuego tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getGenero() {
        return caracteristicas;
    }

    public void setGenero(ArrayList<String> genero) {
        caracteristicas = genero;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Juegos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", fecha=" + fecha +
                ", Genero=" + caracteristicas +
                '}';
    }
}
