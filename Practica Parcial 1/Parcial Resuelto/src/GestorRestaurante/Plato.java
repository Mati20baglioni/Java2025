package GestorRestaurante;

import java.util.ArrayList;

public class Plato extends Preparaciones{
    private double calorias;

    /// CONSTRUCTOR.
    public Plato(String nombre, double precio, ArrayList<String> ingredientes, TipoPreparacion tipo, double calorias) {
        super(nombre, precio, ingredientes, tipo);
        this.calorias = calorias;
    }
    /// GETTERS Y SETTERS.
    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    /// METODOS.
    public void informarCalorias(){
        System.out.println("plato "+getNombre()+",cantidad de calorias"+getCalorias()+"");
    }
    public boolean esSanoComer(){
        if(getCalorias()>2000){
            return false;
        }
        return true;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                ", tipo=" + tipo +
                ", calorias=" + calorias +
                '}';
    }
}
