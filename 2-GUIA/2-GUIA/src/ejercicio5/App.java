package ejercicio5;

import ejercicio1.Empleado;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /// 1

        Estudiante student1 = new Estudiante("42653790", "Matias", "Baglioni", "matias_baglioni20@hotmail.com", "vertiz 6946", LocalDate.of(2000, 6, 20), 20000, "Programacion");
        Estudiante student2 = new Estudiante("38765412", "Juan", "Perez", "juan_perez@gmail.com", "Av. Libertad 123", LocalDate.of(2001, 3, 15), 18000, "Matematica");
        Estudiante student3 = new Estudiante("45987632", "Ana", "Lopez", "ana_lopez@hotmail.com", "Calle Luna 45", LocalDate.of(1999, 11, 5), 22000, "Fisica");
        Estudiante student4 = new Estudiante("51234567", "Luis", "Martinez", "luis_martinez@gmail.com", "Calle Sol 78", LocalDate.of(2002, 8, 30), 21000, "Quimica");


        System.out.println(student1.toStringCompleto());
        System.out.println(student2.toStringCompleto());
        System.out.println(student3.toStringCompleto());
        System.out.println(student4.toStringCompleto());


        /// 2


        Staff emp1=new Staff("42653790","Cristian","Baglioni","cristiandbaglioni@hotmail.com","vertiz6946",500,"Turno mañana");
        Staff emp2=new Staff("38765412","Juan","Perez","juan_perez@gmail.com","Av. Libertad 123",450,"Turno tarde");
        Staff emp3=new Staff("45987632","Ana","Lopez","ana_lopez@hotmail.com","Calle Luna 45",520,"Turno mañana");
        Staff emp4=new Staff("51234567","Luis","Martinez","luis_martinez@gmail.com","Calle Sol 78",480,"Turno noche");

        System.out.println(emp1.toStringCompletoStaff());
        System.out.println(emp2.toStringCompletoStaff());
        System.out.println(emp3.toStringCompletoStaff());
        System.out.println(emp4.toStringCompletoStaff());


        /// 3

        Persona universidad[]={student1,student2,student3,student4,emp1,emp2,emp3,emp4};

        int longitudArreglo= universidad.length;
        System.out.println(longitudArreglo);


        /// 4

        int contadorEstudiantes=0;
        int contadorEmpleados=0;

        for (int i = 0; i < universidad.length; i++) {
            Persona p = universidad[i];
            if (p instanceof Estudiante) {
                contadorEstudiantes++;
            } else if (p instanceof Staff) {
                contadorEmpleados++;
            }
        }
        System.out.println("Cantidad de estudiantes:"+contadorEstudiantes+"");
        System.out.println("Cantidad de empleados:"+contadorEmpleados+"");

        /// 5
        int sumatoria=0;
        for (int i=0;i<longitudArreglo;i++){
            Persona d=universidad[i];
            if(d instanceof Estudiante){
                Estudiante e = (Estudiante) d;   // casteo a Estudiante
                sumatoria += e.getCuotaMensual();
            }
        }

        System.out.println("Dinero cuota mensual:"+sumatoria+"");




    }
}
