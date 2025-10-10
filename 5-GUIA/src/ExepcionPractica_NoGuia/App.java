package ExepcionPractica_NoGuia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        try{
            Calculadora.dividir(5,0);
        }catch (ArithmeticException ex){

            System.out.println("El denominador no puede ser 0.");
        }


        try{
            int num1,num2,resultado;

            System.out.println("ingrese 2 numeros:");
            num1=teclado.nextInt();
            num2=teclado.nextInt();

            resultado=num1/num2;

            System.out.println(resultado);

        }catch (InputMismatchException ex){
            System.out.println("no se puede poner letras solo numeros.");

        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());

        }catch (Exception ex){
            System.out.println("ocurrio un error inesperado.");
        }
    }
}
