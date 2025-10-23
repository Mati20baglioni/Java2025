package Clases;

import Enums.Seccion;
import Exepciones.ProductoInvalidoException;

import java.util.ArrayList;

public abstract class ProductoElectronico {
    public String nombre;
    public String marca;
    public double precio;
    public int stock;
    public Seccion seccion;
    public ArrayList<Especificaciones> especificaciones;
    public ArrayList<Embalaje> embalajesDisponibles;

    /// CONSTRUCTOR.
    public ProductoElectronico(String nombre, String marca, double precio, int stock, Seccion seccion, ArrayList<Especificaciones> especificaciones, ArrayList<Embalaje> embalajesDisponibles) {
        if (precio < 0) {
            throw new ProductoInvalidoException("El precio no puede ser negativo.");
        }
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.seccion = seccion;
        this.especificaciones = especificaciones;
        this.embalajesDisponibles = embalajesDisponibles;
    }

    public ProductoElectronico() {
    }

    /// GETTERS Y SETTERS.
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public ArrayList<Especificaciones> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(ArrayList<Especificaciones> especificaciones) {
        this.especificaciones = especificaciones;
    }

    public ArrayList<Embalaje> getEmbalajesDisponibles() {
        return embalajesDisponibles;
    }

    public void setEmbalajesDisponibles(ArrayList<Embalaje> embalajesDisponibles) {
        this.embalajesDisponibles = embalajesDisponibles;
    }
    /// METODOS.
    public abstract void detalleTecnico();

    /// TO STRINGS.
    public String toString() {
        return "ProductoElectronico{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", seccion=" + seccion +
                ", especificaciones=" + especificaciones +
                ", embalajesDisponibles=" + embalajesDisponibles +
                '}';
    }
}
