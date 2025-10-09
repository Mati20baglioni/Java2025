package GestionTransporte;

public abstract class Transporte {
    public static int contId=1;
    public int id;
    public int capacidad;
    public double costoMensual;
    public TipoVehiculo tipo;

    /// CONSTRUCTOR.

    public Transporte(int capacidad, double costoMensual, TipoVehiculo tipo) {
        this.id = contId++;
        this.capacidad = capacidad;
        this.costoMensual = costoMensual;
        this.tipo = tipo;
    }

    public Transporte() {
    }
    /// GETTERS Y SETTERS.
    ///
    public int getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    /// TO STRING.
    @Override
    public String toString() {
        return "Transporte{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                ", costoMensual=" + costoMensual +
                ", tipo=" + tipo +
                '}';
    }
}
