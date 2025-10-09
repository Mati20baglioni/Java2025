package Ejercicio1;

public class Tranvia implements I_transporte{
    private String ruta;
    private int capacidad;
    private TiposTransporte tipoT;

    /// constructor.
    public Tranvia(String ruta, int capacidad, TiposTransporte tipoT) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipoT = tipoT;
    }
    public Tranvia() {

    }

    /// getters y setters.
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TiposTransporte getTipoT() {
        return tipoT;
    }

    public void setTipoT(TiposTransporte tipoT) {
        this.tipoT = tipoT;
    }

    /// metodos.

    public void cambiarVia(int nuevaVia){
        System.out.println("Nueva via:"+nuevaVia+"");
    }

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }




}
