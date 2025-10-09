package GestionAnalisisClinicos;

import java.time.LocalDate;

public class AnalisisSangre extends Muestra{
    private double nivelGlobuloR;
    private double nivelGlobuloB;
    private double nivelPlaquetas;

    /// CONSTRUCTOR.
    public AnalisisSangre(String nombrePaciente, int edad, TipoAnalisis tipoA, LocalDate fechaMuestra, double nivelGlobuloR, double nivelGlobuloB, double nivelPlaquetas) {
        super(nombrePaciente, edad, tipoA, fechaMuestra);
        this.nivelGlobuloR = nivelGlobuloR;
        this.nivelGlobuloB = nivelGlobuloB;
        this.nivelPlaquetas = nivelPlaquetas;
    }
    /// GETTERS Y SETTERS.
    public double getNivelGlobuloR() {
        return nivelGlobuloR;
    }

    public void setNivelGlobuloR(double nivelGlobuloR) {
        this.nivelGlobuloR = nivelGlobuloR;
    }

    public double getNivelGlobuloB() {
        return nivelGlobuloB;
    }

    public void setNivelGlobuloB(double nivelGlobuloB) {
        this.nivelGlobuloB = nivelGlobuloB;
    }

    public double getNivelPlaquetas() {
        return nivelPlaquetas;
    }

    public void setNivelPlaquetas(double nivelPlaquetas) {
        this.nivelPlaquetas = nivelPlaquetas;
    }
    /// METODOS.
    public double PromedioComponentes(){
        return (nivelGlobuloB+nivelGlobuloR+nivelPlaquetas)/3;
    }
    public boolean esNivelCritico(){
       return nivelGlobuloR > 5.5 || nivelGlobuloB > 11000 || nivelPlaquetas > 450000;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "AnalisisSangre{" +
                "contId=" + contId +
                ", id=" + id +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", tipoA=" + tipoA +
                ", fechaMuestra=" + fechaMuestra +
                ", nivelGlobuloR=" + nivelGlobuloR +
                ", nivelGlobuloB=" + nivelGlobuloB +
                ", nivelPlaquetas=" + nivelPlaquetas +
                '}';
    }
}
