package Transporte;

import Enums.Tipo_Transporte;

public abstract class Transporte implements Comparable<Transporte>{
    public static int contadorId=1;
    public int id;
    public int capacidad;
    public double costoMensual;
    public Tipo_Transporte tipo;


    /// CONSTRUCTOR.
    public Transporte(int capacidad, double costoMensual, Tipo_Transporte tipo) {
        this.id = contadorId++;
        this.capacidad = capacidad;
        this.costoMensual = costoMensual;
        this.tipo = tipo;
    }

    /// GETTERS Y SETTERS.
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

    public Tipo_Transporte getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Transporte tipo) {
        this.tipo = tipo;
    }
    /// METODOS.
    public void MostrarInformacionOperativa(){
    }

    @Override
    public int compareTo(Transporte o) {
        return Integer.compare(this.id, o.id);
    }

    /// TO STRINGS.
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
