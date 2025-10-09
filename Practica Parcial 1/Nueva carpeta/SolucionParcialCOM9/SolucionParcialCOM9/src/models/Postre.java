package models;

import enums.TipoPreparacion;

import java.util.List;

public class Postre extends Preparacion{
    private boolean conAzucar;

    public Postre() {

    }

    public Postre(String nombre, double precio, List<String> ingredientes, TipoPreparacion tipo, boolean conAzucar) {
        super(nombre, precio, ingredientes, tipo);
        this.conAzucar = conAzucar;
    }

    public boolean isConAzucar() {
        return conAzucar;
    }

    public void setConAzucar(boolean conAzucar) {
        this.conAzucar = conAzucar;
    }
}
