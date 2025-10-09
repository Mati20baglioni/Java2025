import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        /// 1

        Empleado emp1 = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
        Empleado emp2 = new Empleado(34234123, "Ana", "Sánchez", 27500);

        // Imprimir empleados
        System.out.println(emp1);
        System.out.println(emp2);

        // Aumentar salario del empleado Carlos en 15%
        emp1.aumentarSalario(15);
        // Imprimir salario anual de Carlos después del aumento
        System.out.println("Salario anual de Carlos luego del aumento: " + emp1.salarioAnual());
        System.out.println("\n");

        /// 2
        CuentaBanco user1=new CuentaBanco(1937,"Matias Baglioni",15000);
        System.out.println(user1);
        user1.acreditarBalance(2500);
        user1.debitarBalance(1500);
        user1.debitarBalance(30000);
        System.out.println(user1);

        /// 3


        Libro librito1=new Libro("Los Juegos del Hambre","Susan Collins",18000,20);
        Libro librito2=new Libro("El Imperio Final","Brandon Sanderson",30000,16);
        Libro librito3=new Libro("El Quijote","Miguel de Cervantes",500,10);
        Libro librito4=new Libro("Cien Años de Soledad","Gabriel García Márquez",700,5);

        System.out.println(librito1);
        System.out.println(librito2);
        System.out.println(librito3);
        System.out.println(librito4);

        librito3.venderCopias(3);
        System.out.println(librito3);

        librito4.venderCopias(8);
        librito4.agregarCopias(5);
        System.out.println(librito4);

        /// 4

        int op=0;
        char control='s';

        int id;
        int cantidad;
        String descripcion;
        double precioUnidad=0;

        ItemVenta item1=null;


        do{
            System.out.println("ingrese el numero de la operacion:");
            op=teclado.nextInt();

            switch (op){
                case 1:
                    System.out.println("ingresa id:");
                    id=teclado.nextInt();
                    System.out.println("ingresa cantidad:");
                    cantidad=teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("ingresa descripcion:");
                    descripcion=teclado.nextLine();
                    System.out.println("ingresa precio de la unidad:");
                    precioUnidad=teclado.nextDouble();

                    item1=new ItemVenta(id,cantidad,descripcion,precioUnidad);
                    break;
                case 2:
                    System.out.println(item1);
                    break;
                case 3:
                    System.out.println("ingresa nueva cantidad:");
                    cantidad=teclado.nextInt();
                    item1.setCantidad(cantidad);
                break;
                case 4:
                    System.out.println("ingresa el nuevo precio de la unidad:");
                    precioUnidad=teclado.nextInt();
                    item1.setPrecioUnitario(precioUnidad);
                    break;
                case 5:
                    System.out.println(item1.calcularPrecioTotal(precioUnidad));
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    while (op<1 || op>6){
                        System.out.println("opcion invalida intente nuevamente:");
                        op=teclado.nextInt();
                    }
            }
            System.out.println("desea continuar s/n:");
            teclado.nextLine();
            teclado.next().charAt(0);

        }while(control=='s'|| control=='S');
    }
}