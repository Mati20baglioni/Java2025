package EjerciciosGuia.Ejercicio_5;

import java.util.ArrayList;

public class Lista_Ordenada <T extends Comparable<T>> {
    private ArrayList<T> stock = new ArrayList<>();
    private boolean ascendente;

    /// CONSTRUCTOR.
    public Lista_Ordenada(boolean ascendente) {
        this.ascendente = ascendente;
    }

    public Lista_Ordenada() {
    }

    /// GETTERS Y SETTERS.
    public ArrayList<T> getStock() {
        return stock;
    }

    public void setStock(ArrayList<T> stock) {
        this.stock = stock;
    }

    public boolean isAscendente() {
        return ascendente;
    }

    public void setAscendente(boolean ascendente) {
        this.ascendente = ascendente;
    }

    /// METODOS.

    public void agregar(T t) {
        stock.add(t);
        ordenar();
    }

    public void eliminar(T t) {
        stock.remove(t);
    }

    public T obtenerEn(int posicion) {
        if (posicion >= 0 && posicion < stock.size()) {
            return stock.get(posicion);
        }
        throw new IndexOutOfBoundsException("Posición inválida");
    }

    private void ordenar() {
        stock.sort((a, b) -> ascendente ? a.compareTo(b) : b.compareTo(a));
    }
    public void mostrar() {
        for (T t : stock) {
            System.out.println(t);
        }
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Lista_Ordenada{" +
                "stock=" + stock +
                ", ascendente=" + ascendente +
                '}';
        }


}

