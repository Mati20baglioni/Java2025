package ExepcionPractica_NoGuia;

public class Calculadora {

    public static void dividir(int numerador,int denominador) throws ArithmeticException{
        if(denominador==0){
            throw new ArithmeticException();
        }
        int resultado=numerador/denominador;
        System.out.println(resultado);
    }
}
