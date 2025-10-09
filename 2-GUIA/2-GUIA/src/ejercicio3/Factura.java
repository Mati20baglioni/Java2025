package ejercicio3;
import java.time.LocalDateTime;
import java.util.UUID;

public class Factura  {
    private UUID id;
    private double totalCompra;
    private LocalDateTime fecha;
    private Cliente client;


    /// constructor.
    public Factura(double totalCompra, LocalDateTime fecha, Cliente client) {
        this.id = UUID.randomUUID();
        this.totalCompra = totalCompra;
        this.fecha = fecha;
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    ///getters y setter.

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    /// metodos.
    public double calcularTotalConDescuento() {
        double desc = client.getPorcentajeDescuento();
        double calculo = totalCompra * desc / 100;
        return totalCompra - calculo;
    }


    /// to string

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Factura{");
        sb.append("id=").append(id);
        sb.append(", totalCompra=").append(totalCompra);
        sb.append(", fecha=").append(fecha);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }


    public String toStringDetallado() {
        return "Factura[id=" + id +
                ", fecha=" + fecha +
                ", monto=" + totalCompra +
                ", montoDesc=" + calcularTotalConDescuento() +
                ", Cliente[id=" + client.getId() +
                ", nombre=" + client.getNombre() +
                ", email=" + client.getEmail() +
                ", descuento=" + client.getPorcentajeDescuento() +
                "]]";
    }


}
