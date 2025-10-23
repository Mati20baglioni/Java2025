package clases;

import excepciones.ProductoInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class Inventario <T extends ProductoElectronico>{
    private List<T> lista;

    public Inventario() {
        this.lista=new ArrayList<>();
    }

    public void agregarProducto(T producto){
        lista.add(producto);
    }

    public void eliminarProducto(T producto){
        lista.remove(producto);
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public List<Portatil> listarComputadoras(){
        List<Portatil> computadoras=new ArrayList<>();
        for (ProductoElectronico p : lista){
            if (p instanceof Portatil portatil){
                computadoras.add(portatil);
            }
        }
        return computadoras;
    }


    public List<ProductoElectronico> filtrarXPrecioYMarca(double precioMin, String marca) throws ProductoInvalidoException{
        List<ProductoElectronico> productos = new ArrayList<>();

        if (precioMin<0){
            throw new ProductoInvalidoException("El precio no puede ser negativo");
        }else {
            for(ProductoElectronico p : lista){
                if (p.getPrecio()>=precioMin && marca.equals(p.getMarca())){
                    productos.add(p);
                }
            }
        }

        return productos;
    }

    public List<ProductoElectronico> filtrarXUnidadesYEspecificaciones(int cantUnidades,String nombreEspecificacion, String valorEspecificacion){
        List<ProductoElectronico> productos = new ArrayList<>();

        for (ProductoElectronico p : lista){
            if (p.getCantidadDisponible()>=cantUnidades){
                for (Especificacion e : p.getEspecificaciones()){
                    if (e.getNombre().equals(nombreEspecificacion) && e.getValor().equals(valorEspecificacion)){
                        productos.add(p);
                    }
                }
            }
        }
        return productos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "lista=" + lista +
                '}';
    }
}
