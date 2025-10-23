package EjerciciosGuia.Ejercicio_1;

import java.util.ArrayList;

public class Almacenamiento<T> {
    private ArrayList<T>cosas=new ArrayList<>();

    /// CONSTRUCTOR.
    public Almacenamiento(ArrayList<T> cosas) {
        this.cosas = cosas;
    }

    public Almacenamiento() {
    }

    /// GETTERS Y SETTERS.
    public ArrayList<T> getCosas() {
        return cosas;
    }

    public void setCosas(ArrayList<T> cosas) {
        this.cosas = cosas;
    }

    /// METODOS.
    public void agregar(T t){
        cosas.add(t);
    }
    public void borrar(T t){
        cosas.remove(t);
        System.out.println("se borro.");
    }
    public void buscarObjeto(T t){
        boolean encontrado=false;
        for (T t1:cosas){
            if(t1.equals(t)){
                encontrado=true;
                System.out.println(t1);
                System.out.println("encontrado.");
            }
        }
        if(encontrado==false){
            System.out.println("no se encuentran coincidencias.");
        }
    }
    public void mostrarTodo(){
        for (T t:cosas){
            System.out.println(t);
        }
    }
    /// TO STRING.
    @Override
    public String toString() {
        return "Almacenamiento{" +
                "cosas=" + cosas +
                '}';
    }
}
