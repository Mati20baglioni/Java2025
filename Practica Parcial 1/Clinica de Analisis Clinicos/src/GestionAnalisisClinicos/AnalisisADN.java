package GestionAnalisisClinicos;

import java.time.LocalDate;

public class AnalisisADN extends Muestra implements I_AnalisisADN {
    private double coincidenciaConPatron;

    // CONSTRUCTOR
    public AnalisisADN(String nombrePaciente, int edad, TipoAnalisis tipoA, LocalDate fechaMuestra, double coincidenciaConPatron) {
        super(nombrePaciente, edad, tipoA, fechaMuestra);
        this.coincidenciaConPatron = coincidenciaConPatron;
    }

    // GETTERS Y SETTERS
    public double getCoincidenciaConPatron() {
        return coincidenciaConPatron;
    }

    public void setCoincidenciaConPatron(double coincidenciaConPatron) {
        this.coincidenciaConPatron = coincidenciaConPatron;
    }

    // MÉTODOS
    public String informeCoincidencia() {
        return "¿El análisis de ADN es compatible?: " + coincidenciaConPatron + "%";
    }

    public boolean esCompatible(double umbral) {
        return coincidenciaConPatron >= umbral;
    }

    // TO STRING
    @Override
    public String toString() {
        return "AnalisisADN{" +
                "id=" + id +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", tipoA=" + tipoA +
                ", fechaMuestra=" + fechaMuestra +
                ", coincidenciaConPatron=" + coincidenciaConPatron +
                '}';
    }
}
