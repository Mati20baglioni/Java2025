package Clases;

import Enums.IngredientePricipal;
import Enums.TipoPreparacion;

import java.util.ArrayList;

public class Plato extends Menu{
    private int caloriasP;

    /// CONSTRUCTOR.
    public Plato(String nombre, double precio, IngredientePricipal ingredienteP, TipoPreparacion tipoP, int caloriasP) {
        super(nombre, precio, ingredienteP, tipoP);
        this.caloriasP = caloriasP;
    }

    /// GETTERS Y SETTERS.
    public int getCaloriasP() {
        return caloriasP;
    }

    public void setCaloriasP(int caloriasP) {
        this.caloriasP = caloriasP;
    }
    /// METODOS.


    /// TO STRING.
    @Override
    public String toString() {
        return "Plato{" +
                "caloriasP=" + caloriasP +
                '}';
    }
}


