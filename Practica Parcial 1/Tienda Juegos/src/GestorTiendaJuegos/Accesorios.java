package GestorTiendaJuegos;

import java.util.ArrayList;

public class Accesorios extends Productos{
    private boolean compatibleConPc;

    /// CONSTRUCTOR.
    public Accesorios(String nombre, double precio, ArrayList<String> etiquetas, TipoDeProducto tipo, boolean compatibleConPc) {
        super(nombre, precio, etiquetas, tipo);
        this.compatibleConPc = compatibleConPc;
    }
    /// GETTERS Y SETTERS.
    public boolean isCompatibleConPc() {
        return compatibleConPc;
    }

    public void setCompatibleConPc(boolean compatibleConPc) {
        this.compatibleConPc = compatibleConPc;
    }
    /// METODOS.
    public boolean esParaPc(){
        if(compatibleConPc==true){
            return true;
        }
        return false;
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "Accesorios{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", etiquetas=" + etiquetas +
                ", tipo=" + tipo +
                ", compatibleConPc=" + compatibleConPc +
                '}';
    }
}
