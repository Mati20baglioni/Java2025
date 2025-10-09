package ejercicio1;

public abstract class Empleado {
    private String nombreEmpleado;
    private double salario;

    /// constructor
    public Empleado(String nombreEmpleado, double salario) {
        this.nombreEmpleado = nombreEmpleado;
        this.salario = salario;
    }
    /// geter y setter
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    ///to string
    @Override
    public String toString() {
        return "ejercicio1.Empleado{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", salario=" + salario +
                ' ';
    }

    ///metodos
    public abstract double calcularSalario();







}
