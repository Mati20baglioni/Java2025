package GestionAnalisisClinicos;

import java.time.LocalDate;

public abstract class Muestra {
    // Atributos estáticos y de instancia
    public static int contId = 1;
    public int id;
    public String nombrePaciente;
    public int edad;
    public TipoAnalisis tipoA;
    public LocalDate fechaMuestra;

    // Constructor completo
    public Muestra(String nombrePaciente, int edad, TipoAnalisis tipoA, LocalDate fechaMuestra) {
        this.id = contId++;
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.tipoA = tipoA;
        this.fechaMuestra = fechaMuestra;
    }

    // Constructor vacío
    public Muestra() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getEdad() {
        return edad;
    }

    public TipoAnalisis getTipoA() {
        return tipoA;
    }

    public LocalDate getFechaMuestra() {
        return fechaMuestra;
    }

    // Setters
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoA(TipoAnalisis tipoA) {
        this.tipoA = tipoA;
    }

    public void setFechaMuestra(LocalDate fechaMuestra) {
        this.fechaMuestra = fechaMuestra;
    }

    // toString
    @Override
    public String toString() {
        return "Muestra{" +
                "id=" + id +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", tipoA=" + tipoA +
                ", fechaMuestra=" + fechaMuestra +
                '}';
    }
}
