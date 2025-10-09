package models;

import enums.TipoPreparacion;

import java.util.List;

public class Plato extends Preparacion{

    private int cantCalorias;

    public Plato() {
    }

    public Plato(String nombre, double precio, List<String> ingredientes, TipoPreparacion tipo, int cantCalorias) {
        super(nombre, precio, ingredientes, tipo);
        this.cantCalorias = cantCalorias;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "cantCalorias=" + cantCalorias +
                "} " + super.toString();
    }

    public String informarSaludable(){
        if(cantCalorias<=2000){
            return "El plato "+ getNombre()+" es saludable con "+ cantCalorias +" calorias";
        }else{
            return "El plato "+ getNombre()+" NO es saludable con "+ cantCalorias +" calorias";
        }
    }
}
