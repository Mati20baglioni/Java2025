package EjerciciosGuia;

import EjerciciosGuia.Ejercicio_1.Almacenamiento;
import EjerciciosGuia.Ejercicio_2.Pila;
import EjerciciosGuia.Ejercicio_3.OperacionMatematica;
import EjerciciosGuia.Ejercicio_4.Conjunto;
import EjerciciosGuia.Ejercicio_5.Lista_Ordenada;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op;
        /// 1
        Almacenamiento<String>almacenString=new Almacenamiento<>();
        ArrayList<Integer>Lista=new ArrayList<>();
        Almacenamiento<Integer>almacenInteger=new Almacenamiento<>(Lista);
        /// 2
        Pila<String>pilaStrings=new Pila<>();
        Pila<Integer>pilaInteger=new Pila<>();
        /// 3
        OperacionMatematica<Integer>Enteros=new OperacionMatematica<>();
        /// 4
        Conjunto<String>guardarS=new Conjunto<>();
        /// 5
        Lista_Ordenada<Integer> listaAsc = new Lista_Ordenada<>(true);
        Lista_Ordenada<String> listaDesc = new Lista_Ordenada<>(false);


        /// 6

        do {
            System.out.println("ingresa una opcion:");
            System.out.println(("(0)-Salir."));
            System.out.println(("(1)-Clase Generica Almacenamiento."));
            System.out.println(("(2)-Clase Generica Pila. "));
            System.out.println(("(3)-Clase Generica Operacion Matematica."));
            System.out.println(("(4)-Clase Generica Conjunto. "));
            System.out.println(("(5)-Clase Generica Lista Ordenada."));
            System.out.println(("(6)-Bonus Track "));

            op=teclado.nextInt();

            switch (op){
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    almacenString.agregar("Hola");
                    almacenString.agregar("Mundo");
                    almacenString.agregar("Hola");
                    almacenString.agregar("Mundo");
                    Lista.add(7);
                    System.out.println("Se agregaron genericos");
                    System.out.println("muestro los strings");
                    almacenString.mostrarTodo();
                    System.out.println("Muestro los integer");
                    almacenInteger.mostrarTodo();

                    almacenString.buscarObjeto("Hola");
                    almacenInteger.borrar(7);
                    break;
                case 2:
                    pilaStrings.agregar_A_Pila("Odio ");
                    pilaStrings.agregar_A_Pila("Estudiar ");
                    pilaStrings.agregar_A_Pila("Generacidad ");
                    pilaInteger.agregar_A_Pila(1);
                    pilaInteger.agregar_A_Pila(2);
                    pilaInteger.agregar_A_Pila(3);

                    System.out.println("muestro cantidad cargado en pila inger");
                    int contador=pilaInteger.contadorPila();
                    System.out.println(contador);
                    System.out.println("reviso si esta vacia.");
                    pilaStrings.estaVacia();
                    System.out.println("quito un numero de la pila integer");
                    pilaInteger.quitar_De_Pila(2);
                    System.out.println("muestro cantidad cargado en pila inger");
                    contador=pilaInteger.contadorPila();
                    System.out.println(contador);

                    break;
                case 3:
                    System.out.println("Operaciones con enteros.");
                    System.out.println(Enteros.sumar(1,9));
                    System.out.println(Enteros.restar(5,8));
                    System.out.println(Enteros.dividir(4,6));
                    System.out.println(Enteros.multiplicar(8,3));
                    break;
                case 4:
                    System.out.println("guardo strings");
                    guardarS.agregarElemento("celular");
                    guardarS.agregarElemento("pc");
                    guardarS.agregarElemento("jostick");

                    System.out.println("borro un elemento");
                    guardarS.borrarElemento("pcs");
                    guardarS.borrarElemento("jostick");

                    System.out.println("verifico si esta dentro");
                    System.out.println(guardarS.estaEnConjunto("pc"));
                    break;
                case 5:
                    listaAsc.agregar(5);
                    listaAsc.agregar(2);
                    listaAsc.agregar(9);
                    listaAsc.mostrar(); // 2, 5, 9

                    listaDesc.agregar("Mate");
                    listaDesc.agregar("Café");
                    listaDesc.agregar("Té");
                    listaDesc.mostrar(); // Té, Mate, Café
                    break;
                case 6:
                    break;
                default:
                    if(op<0 || op>6){
                        System.out.println("opcion invalida");
                    }
            }
        }while(op!=0);
    }
}

/**







 Ejercicio bonus track 😝:
 Desarrolle un main e invoque únicamente a las funciones que compilen
 correctamente.
 El Aeropuerto Internacional Astor Piazzolla de nuestra ciudad nos pide un
 sistema para administrar su flota de aviones que diariamente presta
 operaciones.
 De nuestro aeropuerto nos interesa conocer su nombre, su código
 internacional, dirección y capacidad de operación (cantidad de aviones que
 pueden transitar por sus pistas). El aeropuerto tiene diferentes hangares
 para administrar de manera eficiente los diferentes tipos de avión y cada uno
 tiene diferentes restricciones explicadas más adelante.
 Todos los tipos de avión tienen un nombre de modelo, una marca, capacidad
 de combustible, tipo de motor y cantidad de asientos (los aviones de carga
 tendrán 0 asientos).
 Los tipos de aviones pueden ser:
 ● Comercial: tiene cantidad de azafatas y una lista de servicios.
 ● Privado: tiene un indicador para saber si tiene o no jacuzzi y un string
 con la clave de wifi
 ● De carga: tiene la cantidad de kilos que puede administrar y una lista
 de posibles productos a transportar
 ● Militar: tiene un sistema de armas (aire-aire o aire-tierra) y cantidad de
 balas
 Todos los aviones: despegan, aterrizan y vuelan.
 Comercial y Privado: sirven comida y dan mantas para el frío.
 Solo en los privados se puede ver el mundial (true/false)
 Los de tipo Militar y DeCarga tienen un método para ingresar (no hay que
 desarrollar más que un método que devuelva true/false)
 DeCarga: descargan contenido.
 Como nuestro aeropuerto tiene una capacidad de operación (cantidad de
 aviones), cada vez que agregamos un avión debemos tener en cuenta este
 límite. Si es superado, el avión no podrá ingresar y lanzaremos un mensaje.
 Además, diseñe un método que haga despegar a todos los aviones de un
 determinado hangar enviado por parámetro.*/