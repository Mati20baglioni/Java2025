package ejercicio5;

public class Staff extends Persona{
    private double salario;
    private String turno;

    /// constructorcompleto.
    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    /// metodos.

    /// to string.
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Staff{");
        sb.append("salario=").append(salario);
        sb.append(", turno='").append(turno).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String toStringCompletoStaff(){
        return "Staff[Salario="+salario+
                ",Turno="+turno+
                ","+super.toString()+"";
    }
}
