package ejercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int op;
        char control='s';

        double salarioH;
        String nombEmp;
        int hora;
        int meses;
        double tarifa;

        EmpleadoTiempoCompleto emp1=null;
        EmpleadoXhora emp2=null;
        EmpleadoContratista emp3=null;

        do {
            System.out.println("ingrese opcion:");
            op=teclado.nextInt();
            switch (op){
                case 1:
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre del Empleado-Fulltime:");
                    nombEmp=teclado.nextLine();
                    System.out.println("ingresa el salario:");
                    salarioH= teclado.nextDouble();
                    System.out.println("ingresa los meses trabajados:");
                    meses= teclado.nextInt();
                    emp1=new EmpleadoTiempoCompleto(nombEmp,salarioH,meses);
                    System.out.println(emp1);
                    System.out.println("Sueldo x"+meses+"="+ emp1.calcularSalario()+"");
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Ingresa nombre del empleadoXhora:");
                    nombEmp=teclado.nextLine();
                    System.out.println("ingresa el salario x hora:");
                    salarioH=teclado.nextDouble();
                    System.out.println("Ingresa horas trabajadas:");
                    hora=teclado.nextInt();
                    emp2=new EmpleadoXhora(nombEmp,salarioH,hora);
                    System.out.println(emp2);
                    System.out.println("Salario calculadoxHora:"+emp2.calcularSalario());
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("Ingresa nombre del Contratista:");
                    nombEmp=teclado.nextLine();
                    System.out.println("ingresa el salario:");
                    salarioH= teclado.nextDouble();
                    System.out.println("Ingresa horas trabajadas:");
                    hora=teclado.nextInt();
                    System.out.println("ingresa la TarifaXhora:");
                    tarifa=teclado.nextDouble();
                    emp3=new EmpleadoContratista(nombEmp,salarioH,hora,tarifa);
                    System.out.println(emp3);
                    System.out.println("Salario:"+emp3.calcularSalario()+"");
                    break;
                default:
                    while (op>=4 || op<=0){
                        System.out.println("intente nuevamente op del 1 al 3");
                        op=teclado.nextInt();
                    }
            }
            teclado.nextLine();
            System.out.println("continuar s/n:");
            control=teclado.nextLine().charAt(0);

        }while (control=='s' || control=='S');



    }
}
