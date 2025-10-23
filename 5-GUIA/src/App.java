import Colegio.Alumnos;
import Colegio.Gestora_Colegio;
import Exepciones.Alumno_Invalido;
import Exepciones.Alumnos_Vacio;
import Exepciones.RangoInvalidoException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       /*
        int intento=0;
        int contador=0;
        int buscado=(int)(Math.random()*500)+1;

        do {
            try {
                System.out.println("ingrese un numero del 1 al 500 inclusive:");
                intento = teclado.nextInt();
                if(intento<1 || intento >500){
                    throw new RangoInvalidoException();
                }
                if(intento>buscado){
                    System.out.println("numero demasiado grande");
                    contador++;
                }else if (intento<buscado) {
                    System.out.println("numero demasiado chico");
                    contador++;
                }else {
                    System.out.println("numero encontrado:"+buscado+",numero de intentos:"+contador+"");
                }

            }catch (InputMismatchException e){
                System.out.println("no se pueden ingresar letras solo numeros");
            }catch (RangoInvalidoException e) {
                System.out.println(e.getMessage());
                contador++;
            }
        }while(intento !=buscado);
        */
        int op=0;

        Alumnos alumno1=new Alumnos("Matias","Argentina");
        Alumnos alumno2=new Alumnos("Lucas","Española");
        Alumnos alumno3=new Alumnos("Rodrigo","Española");
        Alumnos alumno4=new Alumnos("Vladimir","Rusa");
        Alumnos alumno5=new Alumnos("Ezio","Italiana");
        Alumnos alumno6=new Alumnos("","");

        ArrayList<Alumnos> listaInicial = new ArrayList<>();
        Gestora_Colegio gestor=new Gestora_Colegio(listaInicial);





        do {
           try {
               System.out.println("ingrese un numero del 0 al 5");
               System.out.println("(0)-Saliendo");
               System.out.println("(1)-Agregar Alumno");
               System.out.println("(2)-Ver Nacionalidad");
               System.out.println("(3)-Cuantas Nacionalidades");
               System.out.println("(4)-Borrar Alumno");
               System.out.println("(5)-Ver Todos");
               op= teclado.nextInt();
               switch (op){
                   case 0:
                       System.out.println("Saliendo...");
                       break;
                   case 1:
                       try{
                           gestor.agregarAlumno(alumno1);
                           gestor.agregarAlumno(alumno2);
                           gestor.agregarAlumno(alumno3);
                           gestor.agregarAlumno(alumno4);
                           gestor.agregarAlumno(alumno5);
                       }catch (Alumno_Invalido e){
                           System.out.println(e.getMessage());
                       }
                       break;
                   case 2:
                       try{
                           gestor.verNacionalidad(alumno1);
                           gestor.verNacionalidad(alumno2);
                           gestor.verNacionalidad(alumno3);
                           gestor.verNacionalidad(alumno4);
                           gestor.verNacionalidad(alumno5);
                           gestor.verNacionalidad(alumno6);
                       }catch (Alumno_Invalido e){
                           System.out.println(e.getMessage());
                       }catch (Alumnos_Vacio ex){
                           System.out.println(ex.getMessage());
                       }
                       break;
                   case 3:
                       try {
                           gestor.cuantos();
                       }catch (Alumnos_Vacio e){
                           System.out.println(e.getMessage());
                       }
                       break;
                   case 4:
                       try {
                           teclado.nextLine(); // limpiar buffer
                           System.out.print("Ingrese nombre del alumno a borrar: ");
                           String nombre = teclado.nextLine();
                           System.out.print("Ingrese nacionalidad del alumno: ");
                           String nacionalidad = teclado.nextLine();

                           Alumnos alumnoABorrar = new Alumnos(nombre, nacionalidad);
                           gestor.borrar(alumnoABorrar);
                       } catch (Alumnos_Vacio e) {
                           System.out.println(e.getMessage());
                       }
                       break;
                   case 5:
                       try {
                           gestor.verTodos();
                       } catch (Alumnos_Vacio e) {
                           System.out.println(e.getMessage());
                       }
                       break;
                   default:
                       if (op<0 || op>5){
                           throw new RangoInvalidoException();
                       }

               }
           }catch (RangoInvalidoException e){
               System.out.println(e.getMessage());
           }


        }while(op!=0);


    }
}

/**Guia #5
 Exceptions
 1. ¿Qué está mal en el siguiente bloque de código?
 ESTA MAL ESTA CAPTURANDO EN EL ORDEN INCORRECTO PRIMERO LAS DE LAS SUBCLASES Y LUEGO CLASES PADRE.
 try
 {
 Persona p = baseDeDatos.buscar(datos);
 System.out.println(“Los datos pertenecen a: ” + p);
 }
 catch(Exception e) {
 // Maneja cualquiera de las excepciones comprobadas
 }
 catch(RuntimeException e) {
 // Maneja cualquiera de las excepciones no comprobadas
 }



 2. Explique lo que sucede en el siguiente código y por qué.
 BASICAMENTE SIEMPRE RETORNA 3 POR QUE EL BLOQUE DE FINALY ANULA LOS OTROS.
 public static class EjemploExcepciones{
 public static int devuelveNumero(int num) {
 try {
 if (num % 2 == 0) {
 throw new Exception("Lanzando excepcion");
 }
 return 1;
 } catch (Exception ex) {
 ex.getMessage().concat("Rompi todo y pase por Catch");
 return 2;
 } finally {
 return 3;
 }
 }
 }*/

