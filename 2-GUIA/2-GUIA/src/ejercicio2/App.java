package ejercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        Autor autor1=new Autor("Joshua","Bloch","joshua@email.com",'M');
        System.out.println(autor1);
        Libro librito1=new Libro("Effective Java",450.0,150,autor1);
        System.out.println(librito1);


        System.out.println("ingresa nuevo precio:");
        double nuevoPrecio=teclado.nextDouble();
        librito1.cambiarPrecio(nuevoPrecio);

        System.out.println("cuantas copias agregar al stock:");
        int copias=teclado.nextInt();
        librito1.cambiarStock(copias);
        System.out.println(librito1);

        System.out.println("------------------------------");
        System.out.println(librito1.getAutor());
        /// g
        librito1.mensajePrecio();



    }
}




