import clases.Tienda;
import manejoJSON.GestionJSON;

public class App {
    public static void main(String[] args) {

        Tienda tienda = GestionJSON.mapeoTienda();

        tienda.filtrarPortatiles();
        tienda.filtrarXPrecioYMarca(1000,"ByteMachines");
        tienda.filtrarXUnidadesYEspecificaciones(100,"Retroiluminación","RGB");
    }
}
