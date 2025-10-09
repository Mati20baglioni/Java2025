package Clases;

import Enums.IngredientePricipal;
import Enums.TipoBebida;
import Enums.TipoPreparacion;

import java.util.ArrayList;

public class Bebida extends Menu{
    private TipoBebida tipo;
    private double descAlcholica;
    private double descNoAlcholica;

    /// CONSTRUCTOR.
    public Bebida(String nombre, double precio, IngredientePricipal ingredienteP, TipoPreparacion tipoP, TipoBebida tipo, double descAlcholica, double descNoAlcholica) {
        super(nombre, precio, ingredienteP, tipoP);
        this.tipo = tipo;
        this.descAlcholica = precio*0.20;
        this.descNoAlcholica = precio*0.10;
    }

    /// GETTERS Y SETTERS.
    public TipoBebida getTipo() {
        return tipo;
    }

    public double getDescAlcholica() {
        return descAlcholica;
    }

    public double getDescNoAlcholica() {
        return descNoAlcholica;
    }

    public void setTipo(TipoBebida tipo) {
        this.tipo = tipo;
    }
    /// METODOS.


    /// TO STRING.
    @Override
    public String toString() {
        return "Bebida{" +
                "tipo=" + tipo +
                ", descAlcholica=" + descAlcholica +
                ", descNoAlcholica=" + descNoAlcholica +
                '}';
    }
}
