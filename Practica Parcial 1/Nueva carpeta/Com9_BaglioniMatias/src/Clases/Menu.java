package Clases;

import Enums.IngredientePricipal;
import Enums.TipoPreparacion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Menu {
    public String nombre;
    public double precio;
    public IngredientePricipal ingredienteP;
    public TipoPreparacion tipoP;

    public Menu(String nombre, double precio, IngredientePricipal ingredienteP, TipoPreparacion tipoP) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredienteP = ingredienteP;
        this.tipoP = tipoP;
    }

    /// CONSTRUCTORES.

    public Menu() {
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

    public IngredientePricipal getIngredienteP() {
        return ingredienteP;
    }

    public void setIngredienteP(IngredientePricipal ingredienteP) {
        this.ingredienteP = ingredienteP;
    }

    public TipoPreparacion getTipoP() {
        return tipoP;
    }

    public void setTipoP(TipoPreparacion tipoP) {
        this.tipoP = tipoP;
    }
    /// METODOS.


    /// TO STRINGS.
    @Override
    public String toString() {
        return "Menu{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredienteP=" + ingredienteP +
                ", tipoP=" + tipoP +
                '}';
    }
}
