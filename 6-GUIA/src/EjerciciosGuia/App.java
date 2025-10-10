package EjerciciosGuia;

public class App {
    public static void main(String[] args) {

    }
}




/**1.

 3. Crear una clase genérica llamada "OperacionMatematica" que pueda realizar
 operaciones matemáticas simples (suma, resta, multiplicación, división) con
 cualquier tipo de número (enteros, decimales, etc.). Debe tener métodos para
 cada operación y para establecer los números de entrada. Haz pruebas de
 tu clase con diferentes tipos de números.
 4. Crear una clase genérica llamada "Conjunto" que pueda almacenar
 elementos únicos de cualquier tipo. Debe tener métodos para agregar y
 eliminar elementos, y para verificar si un elemento está en el conjunto. Haz
 pruebas de tu clase con diferentes tipos de elementos.
 5. Crear una clase genérica llamada "ListaOrdenada" que pueda almacenar
 elementos en orden ascendente o descendente. Debe tener métodos para
 agregar y eliminar elementos, y para obtener el elemento en una posición
 específica. Haz pruebas de tu clase con diferentes tipos de elementos y
 diferentes órdenes de clasificación.
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