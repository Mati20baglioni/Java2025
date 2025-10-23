package EjerciciosGuia.Ejercicio_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Conjunto<T> {
    private ArrayList<T>elementos=new ArrayList<>();

    /// CONSTRUCTOR.
    public Conjunto(ArrayList<T> elementos) {
        this.elementos = elementos;
    }

    public Conjunto() {
    }
    /// GETTERS Y SETTERS.
    public ArrayList<T> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<T> elementos) {
        this.elementos = elementos;
    }
    /// METODOS.
    public void agregarElemento(T t){
        elementos.add(t);
        System.out.println("Elemento agregado");
    }
    public void borrarElemento(T t) {
        Iterator<T> i = elementos.iterator();
        boolean encontrado = false;

        while (i.hasNext()) {
            T actual = i.next();
            if (actual.equals(t)) {
                i.remove(); // elimina el elemento actual de forma segura
                System.out.println("Elemento borrado: " + t);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Elemento no encontrado");
        }
    }
    public boolean estaEnConjunto(T t){
        for (T t1:elementos){
            if(t1.equals(t)){
                return true;
            }
        }
        return false;
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Conjunto{" +
                "elementos=" + elementos +
                '}';
    }
}

