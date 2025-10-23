package EjerciciosGuia.Ejercicio_2;

import java.util.ArrayList;
import java.util.Objects;

public class Pila <T>{
    private ArrayList<T>objetosPila=new ArrayList<>();

    /// CONSTRUCTOR.
    public Pila(ArrayList<T> objetosPila) {
        this.objetosPila = objetosPila;
    }

    public Pila() {
    }
    /// GETTERS Y SETTERS.
    public ArrayList<T> getObjetosPila() {
        return objetosPila;
    }

    public void setObjetosPila(ArrayList<T> objetosPila) {
        this.objetosPila = objetosPila;
    }
    /// METODOS.

    public void agregar_A_Pila(T t){
        objetosPila.add(t);
    }
    public void quitar_De_Pila(T t){
        objetosPila.remove(t);
        System.out.println("eliminando: "+t+"");
    }
    public boolean estaVacia(){
        if(objetosPila.isEmpty()){
            return true;
        }
        return false;
    }
    public int contadorPila(){
        return objetosPila.size();
    }

    /// TO STRING.
    @Override
    public String toString() {
        return "Pila{" +
                "objetosPila=" + objetosPila +
                '}';
    }
}
