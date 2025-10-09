package GestionTransporte;

import java.util.PrimitiveIterator;

public class Tren extends Transporte implements I_info{
    private TipoDeTren tipoTren;
    private double recaudacionTotal;
    private int cantidadViajes;

    /// CONSTRUCTOR.
    public Tren(int capacidad, double costoMensual, TipoVehiculo tipo, TipoDeTren tipoTren, double recaudacionTotal, int cantidadViajes) {
        super(capacidad, costoMensual, tipo);
        this.tipoTren = tipoTren;
        this.recaudacionTotal = recaudacionTotal;
        this.cantidadViajes = cantidadViajes;
    }

    /// GETTERS Y SETTERS.
    public TipoDeTren getTipoTren() {
        return tipoTren;
    }

    public void setTipoTren(TipoDeTren tipoTren) {
        this.tipoTren = tipoTren;
    }

    public double getRecaudacionTotal() {
        return recaudacionTotal;
    }

    public void setRecaudacionTotal(double recaudacionTotal) {
        this.recaudacionTotal = recaudacionTotal;
    }

    public int getCantidadViajes() {
        return cantidadViajes;
    }

    public void setCantidadViajes(int cantidadViajes) {
        this.cantidadViajes = cantidadViajes;
    }

    /// METODOS.

    public double promedioXviaje(){
        double promedio=getRecaudacionTotal()+getCantidadViajes()/2;
        return promedio;
    }
    @Override
    public void mostrarInformacionOperativa() {

        System.out.println("El promedio de costo por viajes es:"+promedioXviaje()+"");

    }

    /// TO STRING.
    @Override
    public String toString() {
        return "Tren{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                ", costoMensual=" + costoMensual +
                ", tipo=" + tipo +
                ", tipoTren=" + tipoTren +
                ", recaudacionTotal=" + recaudacionTotal +
                ", cantidadViajes=" + cantidadViajes +
                '}';
    }
}
