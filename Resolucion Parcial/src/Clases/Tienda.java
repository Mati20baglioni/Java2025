package Clases;

import Exepciones.ProductoInvalidoException;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String ubicacion;
    private ArrayList<ProductoElectronico>productos=new ArrayList<>();

    /// CONSTRUCTOR.
    public Tienda(String nombre, String ubicacion, ArrayList<ProductoElectronico> productos) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.productos = productos;
    }
    /// GETTERS Y SETTERS.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<ProductoElectronico> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoElectronico> productos) {
        this.productos = productos;
    }
    /// METODOS.
    public void agregar(ProductoElectronico producto){
        if(producto.getPrecio()<0){
            throw new ProductoInvalidoException("no se pude agregar un producto con valor menor a 0");
        }
        productos.add(producto);
    }
    public void listarProductos() {
        for (ProductoElectronico p : productos) {
            System.out.println(p);
            System.out.println("Detalle técnico: " + p.detalleTecnico());
            System.out.println("------------------------");
        }
    }
    public ArrayList<ProductoElectronico> filtrarPorSeccion(Seccion seccion) {
        ArrayList<ProductoElectronico> resultado = new ArrayList<>();
        for (ProductoElectronico p : productos) {
            if (p.getSeccion() == seccion) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public ArrayList<ProductoElectronico> filtrarPorPrecioYMarca(double precioMinimo, String marca) {
        ArrayList<ProductoElectronico> resultado = new ArrayList<>();
        for (ProductoElectronico p : productos) {
            if (p.getPrecio() > precioMinimo && p.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
    public ArrayList<ProductoElectronico> filtrarPorStockYEspecificacion(int cantidadMinima, String especificacionBuscada) {
        ArrayList<ProductoElectronico> resultado = new ArrayList<>();
        for (ProductoElectronico p : productos) {
            if (p.getStock() > cantidadMinima) {
                for (Especificaciones e : p.getEspecificaciones()) {
                    if (e.getNombre().equalsIgnoreCase(especificacionBuscada)) {
                        resultado.add(p);
                        break;
                    }
                }
            }
        }
        return resultado;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", productos=" + productos +
                '}';
    }
}

