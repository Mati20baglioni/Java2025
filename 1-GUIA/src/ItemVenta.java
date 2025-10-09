public class ItemVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;


    public ItemVenta(int identificador, int cantidad, String descripcion, double precioUnitario) {
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    //metodos

    public double calcularPrecioTotal(double precioUnitario) {
        return precioUnitario * cantidad;
    }


    @Override
    public String toString() {
        return "ItemVenta{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }

}



