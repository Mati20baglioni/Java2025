package EjerciciosGuia;

import java.util.ArrayList;

public class Almacenamiento <T>{
    private ArrayList<T>Cosas=new ArrayList<>();

    /// CONSTRUCTOR.
    public Almacenamiento(ArrayList<T> cosas) {
        Cosas = cosas;
    }

    public Almacenamiento() {
    }

    /// GETTERS Y SETTERS.
    public ArrayList<T> getCosas() {
        return Cosas;
    }

    public void setCosas(ArrayList<T> cosas) {
        Cosas = cosas;
    }
    /// METODOS.
    public void agregar(T t){
        Cosas.add(t);
        System.out.println("Agrego Elemento al Almacenamiento:"+t+".");
    }
    public void borrar(T t){
        Cosas.remove(t);
        System.out.println("Elimino Elemento al Almacenamiento:"+t+".");
    }
    public void buscar(T t){
        for (T c:Cosas){
            if (c.equals(t)){
                System.out.println(c);
            }
        }
    }
    /// TO STRING.
    @Override
    public String toString() {
        return "Almacenamiento{" +
                "Cosas=" + Cosas +
                '}';
    }
}


/**Crear una clase genérica llamada "Almacenamiento" que pueda almacenar
cualquier tipo de objeto. Debe tener métodos para agregar, eliminar, y buscar
objetos en el almacenamiento. Haz pruebas de tu clase con diferentes tipos
de objetos.*/