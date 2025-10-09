package ejercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int op;
        char control='s';

        Cilindro cil1=new Cilindro();
        Cilindro cil2=new Cilindro(1.5,5);
        Cilindro cil3=new Cilindro(2.3,8);
        Cilindro cil4=new Cilindro();

        do{
            System.out.println("ingresa una numero del 1 al 4:");
            op=teclado.nextInt();
            switch (op){
                case 1:
                    /// altura radio color default.
                    System.out.println("volumen:"+ cil1.volumenCilindro()+" radio:"+ cil1.getRadio()+ " altura:"+ cil1.getAltura()+" Area:"+ cil1.calcularArea()+"");
                    break;
                case 2:
                    /// altura y radio inicializada.
                    System.out.println("volumen:"+ cil2.volumenCilindro()+" radio:"+ cil2.getRadio()+ " altura:"+ cil2.getAltura()+" Area:"+ cil2.calcularArea()+"");
                    break;
                case 3:
                    ///
                    System.out.println("volumen:"+cil3.volumenCilindro()+", y el Area es:"+cil3.calcularArea()+"");
                    System.out.println("Llamo metodo de super clase:"+cil3.volumenCilindro(cil3.getRadio())+"");
                    break;
                case 4:
                    System.out.println(cil4);
                    break;
                default:
                    while (op<=0 || op>=4){
                        System.out.println("intente nuevamente un numero del 1 al 4:");
                        op=teclado.nextInt();
                    }
            }
            teclado.nextLine();
            System.out.println("Desea continuar con otro ejercicio s/n");
            control=teclado.nextLine().charAt(0);

        }while (control=='s' || control=='S');

    }
}
