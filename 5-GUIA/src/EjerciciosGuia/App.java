package EjerciciosGuia;

import com.sun.source.tree.WhileLoopTree;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int contadorIntentos=0;
        int numero=0;
        int random=(int) (Math.random()*500)+1;

        do {
           try{
               System.out.println("intente adivinar el numero random entre 1 y 500");
               numero= teclado.nextInt();

               if (numero < 1 || numero > 500) {
                   throw new NumeroFueraDeRango("el numero debe estar entre 1 y 500 inclusive.");
               }
               contadorIntentos++;

               if(numero>random){
                   System.out.println("el numero es ingresado es mayor al buscado.");
               }else if(numero<random){
                   System.out.println("el numero ingresado es menor al buscado.");
               }else {
                   System.out.println("Acertaste el numero es "+random+"");
                   System.out.println("numero de intentos:"+contadorIntentos+"");
               }

           }catch (InputMismatchException ex){
               contadorIntentos++;
               System.out.println("no se puede ingresar letras.");
               teclado.next();
           }catch(NumeroFueraDeRango ex){
               System.out.println(ex.getMessage());
           }

        } while(numero!=random);

        Alumnos a=new Alumnos("Matias","Argentina");
        Alumnos b=new Alumnos("Lucas","Española");
        Alumnos c=new Alumnos("Cristian","Argentina");
        Alumnos d=new Alumnos("Camila","Uruguaya");


        Colegio colegio=new Colegio();

        colegio.agregarAlumno(a);
        colegio.agregarAlumno(b);
        colegio.agregarAlumno(c);
        colegio.agregarAlumno(d);

        System.out.println("\n--- Ver todos los alumnos por nacionalidad ---");
        colegio.verTodos();

        System.out.println("\n--- Ver cuántos alumnos hay de Argentina ---");
        colegio.verNacionalidad("Argentina");

        System.out.println("\n--- Número de nacionalidades diferentes ---");
        colegio.cuantos();

        System.out.println("\n--- Borrar alumno Cristian ---");
        colegio.borrar(c);

        System.out.println("\n--- Ver todos después de borrar ---");
        colegio.verTodos();

    }
}









