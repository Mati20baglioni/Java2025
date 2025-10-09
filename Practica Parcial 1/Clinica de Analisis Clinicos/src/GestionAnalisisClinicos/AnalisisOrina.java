package GestionAnalisisClinicos;

import java.time.LocalDate;

public class AnalisisOrina extends Muestra {
    private double proteinas;
    private double glucosa;
    private double ph;

    /// CONSTRUCTOR
    public AnalisisOrina(String nombrePaciente, int edad, TipoAnalisis tipoA, LocalDate fechaMuestra,double proteinas, double glucosa, double ph) {
        super(nombrePaciente, edad, tipoA, fechaMuestra);
        this.proteinas = proteinas;
        this.glucosa = glucosa;
        this.ph = ph;
    }
    /// GETTERS Y SETTERS.
    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(double glucosa) {
        this.glucosa = glucosa;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }
    /// METODOS.
    public String nivelAcidez(){
        if (ph < 6.0) {
            return "Ácido";
        } else if (ph <= 7.0) {
            return "Neutro";
        } else {
            return "Alcalino";
        }
    }
    public boolean tieneAnormalidades(){
        return proteinas > 0 || glucosa > 0;
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "AnalisisOrina{" +
                "contId=" + contId +
                ", id=" + id +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", tipoA=" + tipoA +
                ", fechaMuestra=" + fechaMuestra +
                ", proteinas=" + proteinas +
                ", glucosa=" + glucosa +
                ", ph=" + ph +
                '}';
    }
}
