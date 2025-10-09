package Ejercicio1;

public class Bicicleta implements I_transporte{
    private String numeroSerie;
    private TiposTransporte tipoB;

    /// constructor.
    public Bicicleta(String numeroSerie, TiposTransporte tipoB) {
        this.numeroSerie = numeroSerie;
        this.tipoB = tipoB;
    }

    /// getters y setters.
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TiposTransporte getTipoB() {
        return tipoB;
    }

    public void setTipoB(TiposTransporte tipoB) {
        this.tipoB = tipoB;
    }
    /// metodos.

    public void AjustarAsiento(int altura){
        System.out.println("Nueva altura del asiento"+altura+"");
    }


    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }
}


