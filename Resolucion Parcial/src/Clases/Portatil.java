package Clases;

import Enums.Seccion;

import java.util.ArrayList;

public class Portatil extends ProductoElectronico {
    private String tipoProcesador;
    private int cantRam;

    /// CONSTRUCTOR.
    public Portatil(String nombre, String marca, double precio, int stock, Seccion seccion, ArrayList<Especificaciones> especificaciones, ArrayList<Embalaje> embalajesDisponibles, String tipoProcesador, int cantRam) {
        super(nombre, marca, precio, stock, seccion, especificaciones, embalajesDisponibles);
        this.tipoProcesador = tipoProcesador;
        this.cantRam = cantRam;
    }

    public Portatil() {
    }

    /// GETTERS Y SETTERS.
    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public int getCantRam() {
        return cantRam;
    }

    public void setCantRam(int cantRam) {
        this.cantRam = cantRam;
    }

    /// METODOS.
    @Override
    public void detalleTecnico() {
        System.out.println("Tipo de procesador:"+getTipoProcesador()+",Cantidad de Ram:"+getCantRam()+"");
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "Portatil{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", seccion=" + seccion +
                ", especificaciones=" + especificaciones +
                ", embalajesDisponibles=" + embalajesDisponibles +
                ", tipoProcesador='" + tipoProcesador + '\'' +
                ", cantRam=" + cantRam +
                '}';
    }
}
