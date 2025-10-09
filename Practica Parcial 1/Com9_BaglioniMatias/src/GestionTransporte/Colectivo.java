package GestionTransporte;

public class Colectivo extends Transporte implements I_info {
    private int cantParadas;

    /// CONSTRUCTOR.

    public Colectivo(int capacidad, double costoMensual, TipoVehiculo tipo, int cantParadas) {
        super(capacidad, costoMensual, tipo);
        this.cantParadas = cantParadas;
    }

    /// GETTERS Y SETTERS.

    public int getCantParadas() {
        return cantParadas;
    }

    public void setCantParadas(int cantParadas) {
        this.cantParadas = cantParadas;
    }

    /// METODOS.
    public boolean aptoViajeCorto(){
        if(getCantParadas()<=20){
            return true;
        }
        return false;
    }
    @Override
    public void mostrarInformacionOperativa() {
        System.out.println("el colectivo hace:"+getCantParadas()+" paradas,es apto para viajes cortos?"+aptoViajeCorto()+"");
    }

    /// TO STRING.
    @Override
    public String toString() {
        return "Colectivo{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                ", costoMensual=" + costoMensual +
                ", tipo=" + tipo +
                ", cantParadas=" + cantParadas +
                '}';
    }
}
