package Transporte;

import Enums.Tipo_Transporte;

public class Colectivo extends Transporte{
    private int cantidadParadas;

    /// CONSTRUCTOR.
    public Colectivo(int capacidad, double costoMensual, Tipo_Transporte tipo, int cantidadParadas) {
        super(capacidad, costoMensual, tipo);
        this.cantidadParadas = cantidadParadas;
    }
    /// GETTERS Y SETTERS.
    public int getCantidadParadas() {
        return cantidadParadas;
    }

    public void setCantidadParadas(int cantidadParadas) {
        this.cantidadParadas = cantidadParadas;
    }
    /// METODOS.
    public boolean aptoRecorridoCorto(){
        if(getCantidadParadas()>25){
            return true;
        }
        return false;
    }

    @Override
    public void MostrarInformacionOperativa() {
        System.out.println("Cantidad Paradas realizadas:"+getCantidadParadas()+",es apto para recorrido corto?:"+aptoRecorridoCorto() +"");
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Colectivo{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                ", costoMensual=" + costoMensual +
                ", tipo=" + tipo +
                ", cantidadParadas=" + cantidadParadas +
                '}';
    }
}
