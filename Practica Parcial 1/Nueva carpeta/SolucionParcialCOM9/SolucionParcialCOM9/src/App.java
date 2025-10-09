import enums.TipoPreparacion;
import gestor.Restaurante;
import models.Bebida;
import models.Plato;
import models.Postre;
import models.Preparacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();

        int opcion;

        do {

            System.out.println("\n GESTION DE RESTAURANTE ");

            System.out.println("1. Agregar preparacion");

            System.out.println("2. Eliminar preparacion");

            System.out.println("3. Consultar por categoria");

            System.out.println("4. Filtrar items dentro de un rango de precios");

            System.out.println("5. Listar platos inferior a X calorias");

            System.out.println("6. Filtrar bebidas segun su tipo");

            System.out.println("7. Ordenar las preparaciones por precio o nombre");

            System.out.println("8. Recorrer las preparaciones y ejecutar acciones segun tipo");

            System.out.println("0. Salir");

            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();


            switch (opcion) {

                case 1:
                    // TODO: Agregar preparacion

                    Preparacion item;
                    do {
                        System.out.println("Que tipo de preparacion desea agregar? [1] Plato - [2] Bebida - [3] Postre");
                         item = cargarPreparacion(scanner.nextInt(),scanner);
                         scanner.nextLine();
                        if (item != null) {
                            restaurante.agregarPreparacion(item);
                        }else {
                            System.out.println("No se pudo cargar la preparacion correctamente, vuelva a intentar...");
                        }

                    }while(item==null);


                    break;

                case 2:
                    // TODO: Eliminar preparacion
                    System.out.println("Escriba el nombre de la preparacion que quiere eliminar");
                    restaurante.eliminarPreparacion(scanner.nextLine());

                    break;

                case 3:
                    // TODO: Consultar por categoria
                    System.out.println("Ingrese el tipo de preparacion que quiere ver: [1] Plato - [2] Bebida - [3] Postre");
                    restaurante.listarPreparacionesXTipo(scanner.nextInt());
                    scanner.nextLine();

                    break;

                case 4:
                    // TODO: Filtrar items dentro de un rango de precios
                    System.out.println("Selecciona un rango de precios para listar las preparaciones:");
                    System.out.println("Monto minimo:");
                    double min = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Monto maximo:");
                    double max = scanner.nextDouble();
                    scanner.nextLine();
                    restaurante.filtrarXRangoPrecios(min,max);

                    break;

                case 5:
                    // TODO: Listar platos inferior a X calorias
                    System.out.println("Ingrese la cantidad maxima de calorias a filtrar:");
                    restaurante.listarPlatosInferiorAXCalorias(scanner.nextInt());
                    scanner.nextLine();

                    break;

                case 6:
                    // TODO: Filtrar bebidas segun su tipo
                    System.out.println("Ingresa el numero segun el tipo de bebida que quiere visualizar [1] Alcoholica - [2] No Alcoholica");
                    restaurante.filtrarBebidasXTipo(scanner.nextInt());
                    scanner.nextLine();

                    break;

                case 7:
                    // TODO: Ordenar las preparaciones por precio.
                    restaurante.ordenarPreparacionesXPrecio();
                    System.out.println(restaurante.getMenu());

                    break;

                case 8:
                    // TODO: Recorrer preparaciones y ejecutar acción según tipo
                    restaurante.recorrerPreparacionesYEjecutarAcciones();

                    break;

            }

        } while (opcion != 0);


        scanner.close();
    }

    public static Preparacion cargarPreparacion(int opcion, Scanner carga) {

        Preparacion preparacion;

        switch (opcion) {
            case 1:
                carga.nextLine();
                Plato plato = new Plato();
                System.out.println("Ingrese el nombre del plato:");
                plato.setNombre(carga.nextLine());
                System.out.println("Ingrese el precio:");
                plato.setPrecio(carga.nextDouble());
                carga.nextLine();
                plato.setIngredientes(cargarIngredientes(carga));
                System.out.println("Selecciona el tipo de preparacion: [1] Entrada - [2] Principal");
                switch (carga.nextInt()) {
                    case 1:
                        plato.setTipo(TipoPreparacion.ENTRADA);
                        break;
                    case 2:
                        plato.setTipo(TipoPreparacion.PRINCIPAL);
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                carga.nextLine();
                System.out.println("Ingrese la cantidad de calorias del plato:");
                plato.setCantCalorias(carga.nextInt());

                preparacion = plato;

                break;
            case 2:
                carga.nextLine();
                Bebida bebida = new Bebida();
                System.out.println("Ingrese el nombre de la bebida:");
                bebida.setNombre(carga.nextLine());
                System.out.println("Ingrese el precio:");
                bebida.setPrecio(carga.nextDouble());
                carga.nextLine();
                bebida.setIngredientes(cargarIngredientes(carga));
                bebida.setTipo(TipoPreparacion.BEBIDA);
                System.out.println("Es alcoholica? [true/false]");
                bebida.setAlcoholica(carga.nextBoolean());

                preparacion = bebida;

                break;
            case 3:
                carga.nextLine();
                Postre postre = new Postre();
                System.out.println("Ingrese el nombre del postre:");
                postre.setNombre(carga.nextLine());
                System.out.println("Ingrese el precio:");
                postre.setPrecio(carga.nextDouble());
                carga.nextLine();
                postre.setIngredientes(cargarIngredientes(carga));
                postre.setTipo(TipoPreparacion.POSTRE);
                System.out.println("Contiene azucar? [true/false]");
                postre.setConAzucar(carga.nextBoolean());

                preparacion = postre;

                break;
            default:
                System.out.println("Opcion invalida");

                preparacion = null;
                break;
        }



        return preparacion;
    }

    public static List<String> cargarIngredientes(Scanner carga) {

        List<String> ingredientes = new ArrayList<>();
        String seguir;
        do {
            System.out.println("Ingrese un ingrediente:");
            ingredientes.add(carga.nextLine());
            System.out.println("Desea ingresar otro ingrediente?[S/N]");
            seguir = carga.nextLine();
        } while ("S".equalsIgnoreCase(seguir));

        return ingredientes;
    }
}
