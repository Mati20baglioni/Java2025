package clases;

import excepciones.ProductoInvalidoException;

import java.util.List;

public abstract class ProductoElectronico {

    private String tipo;
    private String nombre;
    private String marca;
    private double precio;
    private int cantidadDisponible;
    private String seccionTienda;
    private List<Especificacion> especificaciones;
    private List<Embalaje> embalajesDisponibles;

    public ProductoElectronico() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws ProductoInvalidoException {
        if (precio<0){
            throw new ProductoInvalidoException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getSeccionTienda() {
        return seccionTienda;
    }

    public void setSeccionTienda(String seccionTienda) {
        this.seccionTienda = seccionTienda;
    }

    public List<Especificacion> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(List<Especificacion> especificaciones) {
        this.especificaciones = especificaciones;
    }

    public List<Embalaje> getEmbalajesDisponibles() {
        return embalajesDisponibles;
    }

    public void setEmbalajesDisponibles(List<Embalaje> embalajesDisponibles) {
        this.embalajesDisponibles = embalajesDisponibles;
    }

    @Override
    public String toString() {
        return "ProductoElectronico{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                ", seccionTienda='" + seccionTienda + '\'' +
                ", especificaciones=" + especificaciones +
                ", embalajesDisponibles=" + embalajesDisponibles +
                '}';
    }

    public abstract void detalleTecnico();
}
