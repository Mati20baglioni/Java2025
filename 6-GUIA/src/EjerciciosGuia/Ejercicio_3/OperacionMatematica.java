package EjerciciosGuia.Ejercicio_3;

import java.util.ArrayList;

public class OperacionMatematica <T extends Number>{
    private ArrayList<T>Calculadora=new ArrayList<>();

    /// CONSTRUCTOR.
    public OperacionMatematica(ArrayList<T> calculadora) {
        Calculadora = calculadora;
    }

    public OperacionMatematica() {
    }

    /// GETTERS Y SETTERS.
    public ArrayList<T> getCalculadora() {
        return Calculadora;
    }

    public void setCalculadora(ArrayList<T> calculadora) {
        Calculadora = calculadora;
    }
    /// METODOS.
    public double sumar (T num1,T num2 ){
        return num1.doubleValue() + num2.doubleValue();
    }
    public double restar(T num1,T num2){
        return num1.doubleValue()-num2.doubleValue();
    }
    public double dividir(T num1,T num2 ){
        return num1.doubleValue()/num2.doubleValue();
    }
    public double multiplicar(T num1,T num2){
        return num1.doubleValue()*num2.doubleValue();
    }
    /// TO STRINGS.
    @Override
    public String toString() {
        return "OperacionMatematica{" +
                "Calculadora=" + Calculadora +
                '}';
    }
}
