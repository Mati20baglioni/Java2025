package GestorTiendaJuegos;

import java.util.ArrayList;

public class JuegosFisicos extends Productos{
    private int cantidadStock;

    /// CONSTRUCTOR.
    public JuegosFisicos(String nombre, double precio, ArrayList<String> etiquetas, TipoDeProducto tipo, int cantidadStock) {
        super(nombre, precio, etiquetas, tipo);
        this.cantidadStock = cantidadStock;
    }

    /// GETTER Y SETTERS.
    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    /// METODOS.
    public boolean esPopular(){
        if(getCantidadStock()>50){
            return true;
        }
        return false;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "JuegosFisicos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", etiquetas=" + etiquetas +
                ", tipo=" + tipo +
                ", cantidadStock=" + cantidadStock +
                '}';
    }
}
