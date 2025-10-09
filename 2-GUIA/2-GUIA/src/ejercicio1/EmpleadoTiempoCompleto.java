package ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado {

    /// atributo
    private int cantMeses;

    /// constructor

    public EmpleadoTiempoCompleto(String nombreEmpleado, double salario, int cantMeses) {
        super(nombreEmpleado, salario);
        this.cantMeses = cantMeses;
    }

    /// getter y setter

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    /// to string
    @Override
    public String toString() {
        return super.toString() +
                ",cantMeses=" + cantMeses +
                "} ";
    }

    /// metodo heredado
    @Override
    public double calcularSalario() {
        return getCantMeses()*getSalario();
    }


}
