package Clases;

import Enums.Seccion;

import java.util.ArrayList;

public class Accesorio extends ProductoElectronico{
    private String tipoTecla;
    private boolean rgb;

    /// CONSTRUCTOR.
    public Accesorio(String nombre, String marca, double precio, int stock, Seccion seccion, ArrayList<Especificaciones> especificaciones, ArrayList<Embalaje> embalajesDisponibles, String tipoTecla, boolean rgb) {
        super(nombre, marca, precio, stock, seccion, especificaciones, embalajesDisponibles);
        this.tipoTecla = tipoTecla;
        this.rgb = rgb;
    }

    public Accesorio() {
    }
    /// GETTERS Y SETTERS.
    public String getTipoTecla() {
        return tipoTecla;
    }

    public void setTipoTecla(String tipoTecla) {
        this.tipoTecla = tipoTecla;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    /// METODOS.
    @Override
    public void detalleTecnico() {
        System.out.println("Tipo de Tecla:"+getTipoTecla()+",Tiene Rgb:"+isRgb()+"");
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "Accesorio{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", seccion=" + seccion +
                ", especificaciones=" + especificaciones +
                ", embalajesDisponibles=" + embalajesDisponibles +
                ", tipoTecla='" + tipoTecla + '\'' +
                ", rgb=" + rgb +
                '}';
    }
}
