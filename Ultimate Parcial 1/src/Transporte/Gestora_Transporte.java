package Transporte;

import Enums.Tipo_Transporte;
import Enums.Tipo_Tren;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Gestora_Transporte {
    ArrayList<Transporte>flota=new ArrayList<>();

    /// CONSTRUCTOR
    public Gestora_Transporte(ArrayList<Transporte> flota) {
        this.flota = flota;
    }
    /// GETTERS Y SETTERS.
    public ArrayList<Transporte> getFlota() {
        return flota;
    }

    public void setFlota(ArrayList<Transporte> flota) {
        this.flota = flota;
    }

    /// METODOS.

    public void agregarTransporte_flota(Transporte t){
        flota.add(t);
    }
    public void eliminarTransporte_flota(Transporte t){
        flota.remove(t);
    }
    public void consultarPorCategoria(Tipo_Transporte tipo){
        for (Transporte t:flota){
            if(t.getTipo()==tipo){
                System.out.println(t);
            }
        }
    }
    public void filtrarPorRangoCapacidad(int MinCapacidad,int MaxCapacidad){
        for (Transporte t:flota){
            if(t.getCapacidad()>=MinCapacidad && t.getCapacidad()<=MaxCapacidad){
                System.out.println(t);
            }
        }
    }

    public void colectivosAptos() {
        for (Transporte t : flota) {
            if (t instanceof Colectivo c) {
                if (c.aptoRecorridoCorto()) {
                    System.out.println(c);
                }
            }
        }
    }
    public void TrenXtipo(Tipo_Tren buscado){
        for (Transporte t:flota){
            if (t instanceof Tren tren){
                if(tren.getTipoT()==buscado){
                    System.out.println(tren);
                }
            }
        }
    }
    public void ordenarPorId() {
        Collections.sort(flota);
    }

    public void ejecutarAccionPorTipo() {
        for (Transporte t : flota) {
            if (t instanceof Colectivo c) {
                System.out.println("Colectivo ID " + c.getId() + ": Apto para recorrido corto → " + c.aptoRecorridoCorto());
            } else if (t instanceof Tren tren) {
                System.out.println("Tren ID " + tren.getId() + ": Tarifa calculada → $" + tren.calcularTarifaPromedio());
            } else if (t instanceof Avion avion) {
                System.out.println("Avión ID " + avion.getId() + ": ¿Vuelos internacionales? → " + avion.puedeVolarInternacionl());
            }
        }
    }
    public void mostrarFlota() {
        for (Transporte t : flota) {
            System.out.println(t);
        }
    }

}