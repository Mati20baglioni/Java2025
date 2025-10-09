package Ejercicio1;

public class Autobus implements I_transporte{
    private int numeroLinea;
    private int capacidad;
    private TiposTransporte tipoA;

    /// constructor.
    public Autobus(int numeroLinea, int capacidad, TiposTransporte tipoA) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipoA = tipoA;
    }
    public Autobus() {

    }


    /// getters y setters.

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TiposTransporte getTipoA() {
        return tipoA;
    }

    public void setTipoA(TiposTransporte tipoA) {
        this.tipoA = tipoA;
    }

    /// metodos.

    public void anunciarParada(String parada){
        System.out.println("Parada:"+parada+"");
    }

    @Override
    public void arrancar() {
        System.out.println("Iniciando el recorrido del Autobus "+tipoA+"!!");
    }

    @Override
    public void detener() {
        System.out.println("El autobus se Detendra en la siguiente parada!!");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }
    /// to strings.
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autobus{");
        sb.append("numeroLinea=").append(numeroLinea);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", tipoA=").append(tipoA);
        sb.append('}');
        return sb.toString();
    }
}
