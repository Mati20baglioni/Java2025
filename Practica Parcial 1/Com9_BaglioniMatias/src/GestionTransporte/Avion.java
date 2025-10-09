package GestionTransporte;

public class Avion extends Transporte implements I_info{
    private double distanciaMax;

    /// CONSTRUCTOR.
    public Avion(int capacidad, double costoMensual, TipoVehiculo tipo, double distanciaMax) {
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
    public boolean puedeVolarInternacional(){
        if (getDistanciaMax()>=10000){
            return true;
        }
        return false;
    }
    @Override
    public void mostrarInformacionOperativa() {
        System.out.println("Distancia MAX que recorre el avio:"+getDistanciaMax()+",puede volar internacional:"+puedeVolarInternacional()+"");
    }
    /// TO STRING.
    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                ", costoMensual=" + costoMensual +
                ", tipo=" + tipo +
                ", distanciaMax=" + distanciaMax +
                '}';
    }
}
