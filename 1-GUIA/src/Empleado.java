public class Empleado {
    // Atributos
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    // Constructor
    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    // Getters y Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Metodo para calcular salario anual
    public double salarioAnual() {
        return salario * 12;
    }

    // Metodo para aumentar el salario
    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    // toString personalizado
    @Override
    public String toString() {
        return "Empleado[dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
    }
}
