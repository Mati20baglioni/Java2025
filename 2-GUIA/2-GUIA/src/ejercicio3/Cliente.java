package ejercicio3;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private double porcentajeDescuento;


    public Cliente(String email, String nombre, double porcentajeDescuento) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.nombre = nombre;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Cliente() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", porcentajeDescuento=").append(porcentajeDescuento);
        sb.append('}');
        return sb.toString();
    }
}
