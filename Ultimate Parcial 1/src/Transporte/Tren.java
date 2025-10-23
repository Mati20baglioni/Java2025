package Transporte;

import Enums.Tipo_Transporte;
import Enums.Tipo_Tren;

public class Tren extends Transporte{
    private Tipo_Tren tipoT;
    private double recaudacionTotal;
    private int cantViajesRealizados;

    /// CONSTRUCTOR.
    public Tren(int capacidad, double costoMensual, Tipo_Transporte tipo, Tipo_Tren tipoT, double recaudacionTotal, int cantViajesRealizados) {
        super(capacidad, costoMensual, tipo);
        this.tipoT = tipoT;
        this.recaudacionTotal = recaudacionTotal;
        this.cantViajesRealizados = cantViajesRealizados;
    }

    /// GETTERS Y SETTERS.
    public Tipo_Tren getTipoT() {
        return tipoT;
    }

    public void setTipoT(Tipo_Tren tipoT) {
        this.tipoT = tipoT;
    }

    public double getRecaudacionTotal() {
        return recaudacionTotal;
    }

    public void setRecaudacionTotal(double recaudacionTotal) {
        this.recaudacionTotal = recaudacionTotal;
    }

    public int getCantViajesRealizados() {
        return cantViajesRealizados;
    }

    public void setCantViajesRealizados(int cantViajesRealizados) {
        this.cantViajesRealizados = cantViajesRealizados;
    }

    /// METODOS.
    public double calcularTarifaPromedio(){
        return getRecaudacionTotal()/getCantViajesRealizados();
    }

    @Override
    public void MostrarInformacionOperativa() {
        System.out.println("Tipo de tren"+getTipoT()+",Recaudacion Total:"+getRecaudacionTotal()+",cantidad viajes realizados:"+getCantViajesRealizados()+",Tarifa Promedio:"+calcularTarifaPromedio()+"");
    }
}
