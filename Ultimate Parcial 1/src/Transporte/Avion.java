package Transporte;

import Enums.Tipo_Transporte;

public class Avion extends Transporte{
    private double distanciaMax;

    /// CONSTRUCTOR.
    public Avion(int capacidad, double costoMensual, Tipo_Transporte tipo, double distanciaMax) {
        super(capacidad, costoMensual, tipo);
        this.distanciaMax = distanciaMax;
    }
    /// GETTERS Y SETTERS.
    public double getDistanciaMax() {
        return distanciaMax;
    }

    public void setDistanciaMax(double distanciaMax) {
        this.distanciaMax = distanciaMax;
    }
    /// METODOS.
    public boolean puedeVolarInternacionl(){
        if(getDistanciaMax()>10000){
            return true;
        }
        return false;
    }
    @Override
    public void MostrarInformacionOperativa() {
        System.out.println("Distancia Max:"+getDistanciaMax()+",Puede volar internacionalmente:"+puedeVolarInternacionl()+"");
    }
}
