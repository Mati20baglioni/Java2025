package Clases;

public class Embalaje {
    private String tipo;
    private String resistencia;
    private String dimensiones;

    /// CONSTRUCTOR.
    public Embalaje(String tipo, String resistencia, String dimensiones) {
        this.tipo = tipo;
        this.resistencia = resistencia;
        this.dimensiones = dimensiones;
    }

    public Embalaje() {
    }
    /// GETTERS Y SETTERS.
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    /// TO STRING
    @Override
    public String toString() {
        return "Embalaje{" +
                "tipo='" + tipo + '\'' +
                ", resistencia='" + resistencia + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                '}';
    }
}
