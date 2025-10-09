package ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        String mail;
        String nombre;
        double descuento;

        Cliente client1;
        Factura fact1;

        System.out.println("ingrese un email:");
        mail=teclado.nextLine();

        System.out.println("ingrese el nombre:");
        nombre=teclado.nextLine();

        System.out.println("ingrese el porcentaje descuento:");
        descuento= teclado.nextDouble();
        client1=new Cliente(mail,nombre,descuento);
        System.out.println(client1);

        teclado.nextLine();
        fact1=new Factura(15000, LocalDateTime.of(2000,6,20,20,30),client1);

        System.out.println(fact1);
        System.out.println("descuento aplicado:"+fact1.calcularTotalConDescuento()+"");


        System.out.println(fact1.toStringDetallado());



    }
}
