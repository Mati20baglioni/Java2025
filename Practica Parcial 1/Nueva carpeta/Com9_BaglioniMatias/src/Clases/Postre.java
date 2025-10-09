package Clases;

import Enums.ContenidoAzucar;
import Enums.IngredientePricipal;
import Enums.TipoPreparacion;

import java.util.ArrayList;

public class Postre extends Menu{
    private ContenidoAzucar contenidoA;

    /// CONSTRUCTOR.
    public Postre(String nombre, double precio, IngredientePricipal ingredienteP, TipoPreparacion tipoP, ContenidoAzucar contenidoA) {
        super(nombre, precio, ingredienteP, tipoP);
        this.contenidoA = contenidoA;
    }

    /// GETTERS Y SETTERS.
    public ContenidoAzucar getContenidoA() {
        return contenidoA;
    }

    public void setContenidoA(ContenidoAzucar contenidoA) {
        this.contenidoA = contenidoA;
    }
    /// METODOS.

    /// TO STRING.
    @Override
    public String toString() {
        return "Postre{" +
                "contenidoA=" + contenidoA +
                '}';
    }
}
