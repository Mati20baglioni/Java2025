package models;

import enums.TipoPreparacion;

import java.util.List;

public class Bebida extends Preparacion{
    private boolean isAlcoholica;

    public Bebida() {

    }

    public Bebida(String nombre, double precio, List<String> ingredientes, TipoPreparacion tipo, boolean isAlcoholica) {
        super(nombre, precio, ingredientes, tipo);
        this.isAlcoholica = isAlcoholica;
    }

    public boolean isAlcoholica() {
        return isAlcoholica;
    }

    public void setAlcoholica(boolean alcoholica) {
        isAlcoholica = alcoholica;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "isAlcoholica=" + isAlcoholica +
                "} " + super.toString();
    }

    public double calcularDescuento(){
        if(isAlcoholica){
            return getPrecio()-(getPrecio()*.20);
        }else{
            return getPrecio()-(getPrecio()*.10);
        }
    }
}
