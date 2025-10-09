package ejercicio1;

public class EmpleadoXhora extends Empleado {
    /// atributo
    private int horasTrabajadas;

    /// constructor
    public EmpleadoXhora(String nombreEmpleado, double salario, int horasTrabajadas) {
        super(nombreEmpleado, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    /// getter y setter
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",horasTrabajadas=" + horasTrabajadas +
                "}";
    }

    /// metodo heredado
    @Override
    public double calcularSalario() {
        return getHorasTrabajadas()*getSalario();
    }
}
