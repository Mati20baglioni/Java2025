package gestor;

import models.Bebida;
import models.Plato;
import models.Postre;
import models.Preparacion;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Restaurante {
    private List<Preparacion> menu;

    public Restaurante() {
        menu = new ArrayList<>();
    }

    public void agregarPreparacion(Preparacion item) {
        menu.add(item);
    }

    public void eliminarPreparacion(String nombre) {
        ListIterator<Preparacion> iterador = menu.listIterator();
        boolean flag=false;

        while (iterador.hasNext()) {
            if (iterador.next().getNombre().equalsIgnoreCase(nombre)) {
                flag=true;
                iterador.remove();
            }
        }
        if(!flag){
            System.out.println("No se encontro coincidencia con el nombre: "+ nombre);
        }else {
            System.out.println("Se encontro la coincidencia con el nombre: " +nombre+ " y se elimino de la lista");
        }
    }

    public void listarPreparacionesXTipo(int opcion) {
        switch (opcion) {
            case 1:
                for (Preparacion p : menu) {
                    if (p instanceof Plato) {
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Preparacion p : menu) {
                    if (p instanceof Bebida) {
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                for (Preparacion p : menu) {
                    if (p instanceof Postre) {
                        System.out.println(p);
                    }
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public void filtrarXRangoPrecios(double min, double max) {
        for (Preparacion p : menu) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                System.out.println(p);
            }
        }
    }

    public void listarPlatosInferiorAXCalorias(int cantCalorias) {
        for (Preparacion p : menu) {
            if (p instanceof Plato) {
                Plato plato = (Plato) p;
                if (plato.getCantCalorias() < cantCalorias) {
                    System.out.println(plato);
                }
            }
        }
    }

    public void filtrarBebidasXTipo(int opcion) {
        for (Preparacion p : menu) {
            if (p instanceof Bebida) {
                Bebida bebida = (Bebida) p;
                switch (opcion){
                    case 1:
                        if (bebida.isAlcoholica()){
                            System.out.println(bebida);
                        }
                        break;
                    case 2:
                        if(!bebida.isAlcoholica()){
                            System.out.println(bebida);
                        }
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }
        }
    }

    public void ordenarPreparacionesXPrecio(){
        Collections.sort(menu);
    }

    public void recorrerPreparacionesYEjecutarAcciones(){
        for (Preparacion p : menu){
            if (p instanceof Plato){
                Plato plato = (Plato) p;
                System.out.println(plato.informarSaludable());
            } else if (p instanceof Bebida) {
                Bebida bebida = (Bebida) p;
                if (bebida.isAlcoholica()){
                    System.out.println("El precio de la bebida alcoholica ("+bebida.getNombre()+") con el descuento es de:" + bebida.calcularDescuento());
                }else {
                    System.out.println("El precio de la bebida NO alcoholica ("+bebida.getNombre()+") con el descuento es de:" + bebida.calcularDescuento());
                }

            }
        }
    }

    public List<Preparacion> getMenu() {
        return menu;
    }
}
