package Ejercicio1;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        TiposTransporte transporte1=TiposTransporte.AUTOBUS;
        TiposTransporte transporte2=TiposTransporte.TRANVIA;
        TiposTransporte transporte3=TiposTransporte.BICICLETA;

        Autobus autobus1=new Autobus(573,30,TiposTransporte.AUTOBUS);
        int line;
        int capacity;

        System.out.println(autobus1);

        int op=0;
        char control='s';

        do {
            System.out.println("ingrese un numero del 1 al 3...");
            op=teclado.nextInt();
            switch (op){
                case 1:
                    System.out.println("----------------------Autobus----------------------------------------");
                    System.out.println("ingrese el numero de la linea de autobus");
                    line=teclado.nextInt();
                    autobus1.arrancar();
                    System.out.println("Parada porfavor....");
                    autobus1.detener();
                    System.out.println("Cuantos lugares quedan en el autobus?");
                    capacity=teclado.nextInt();

                    break;
                case 2:
                    System.out.println("----------------------Tranvia----------------------------------------");

                    break;
                case 3:
                    System.out.println("----------------------Bicicleta----------------------------------------");
                    break;
                default:
                    while (op<=0 || op>=4){
                        System.out.println("incorrecto intente nuevamente:");
                        op=teclado.nextInt();
                    }
            }
            teclado.nextLine();
            System.out.println("continuar s/n:");
            control=teclado.next().charAt(0);

        }while (control=='s'||control=='S');

























    }
}

