package Clases;

import Enums.Seccion;

import java.util.ArrayList;

public class DispositivoMovil extends ProductoElectronico{
    private double tipoPantalla;
    private  String tipoBateria;

    /// CONSTRUCTOR.
    public DispositivoMovil(String nombre, String marca, double precio, int stock, Seccion seccion, ArrayList<Especificaciones> especificaciones, ArrayList<Embalaje> embalajesDisponibles, double tipoPantalla, String tipoBateria) {
        super(nombre, marca, precio, stock, seccion, especificaciones, embalajesDisponibles);
        this.tipoPantalla = tipoPantalla;
        this.tipoBateria = tipoBateria;
    }
    public DispositivoMovil() {
    }

    /// GETTERS Y SETTERS.
    public double getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(double tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    /// METODOS.
    @Override

    public void detalleTecnico() {
        System.out.println("Pulgadas de la pantalla:"+getTipoPantalla()+",tipo de bateria:"+getTipoBateria()+"");
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "DispositivoMovil{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", seccion=" + seccion +
                ", especificaciones=" + especificaciones +
                ", embalajesDisponibles=" + embalajesDisponibles +
                ", tipoPantalla=" + tipoPantalla +
                ", tipoBateria='" + tipoBateria + '\'' +
                '}';
    }
}
