package ejercicio1;

public class EmpleadoContratista extends EmpleadoXhora {
    private double tarifa;

    public EmpleadoContratista(String nombreEmpleado, double salario, int horasTrabajadas, double tarifa) {
        super(nombreEmpleado, salario, horasTrabajadas);
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",tarifa=" + tarifa +
                "} ";
    }

    @Override
    public double calcularSalario() {
        return (getSalario()*getHorasTrabajadas())+getTarifa()*(getHorasTrabajadas());
    }
}
