package ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Estudiante extends Persona{
    private LocalDate fechaIngreso;
    private double cuotaMensual;
    private String carrera;

    /// constructor completo.
    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, LocalDate fechaIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.fechaIngreso = fechaIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    /// constructor propio de la clase.

    public Estudiante(LocalDate fechaIngreso, double cuotaMensual, String carrera) {

        this.fechaIngreso = fechaIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public Estudiante() {
    }


    /// getters y setters.
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /// metodos.

    /// to string.
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Estudiante{");
        sb.append("fechaIngreso=").append(fechaIngreso);
        sb.append(", cuotaMensual=").append(cuotaMensual);
        sb.append(", carrera='").append(carrera).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public String toStringCompleto(){
        return "Estudiante[fecha ingreso="+fechaIngreso+
                ",cuota mensual="+cuotaMensual+
                ",carrera="+carrera+
                ","+super.toString()+"";
    }
}
