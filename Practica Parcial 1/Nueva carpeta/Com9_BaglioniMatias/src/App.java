import Clases.Menu;
import Clases.Plato;
import Enums.IngredientePricipal;
import Enums.TipoPreparacion;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
            ArrayList<Menu>restaurante=new ArrayList<>();

            Menu plato1=new Plato("Pizza",5000, IngredientePricipal.HARINA, TipoPreparacion.ENTRADA,1500);
            Menu plato2=new Plato("Fideos",1500, IngredientePricipal.HARINA, TipoPreparacion.ENTRADA,1000);
            Menu plato3=new Plato("Rabas",15900, IngredientePricipal.PESCADO, TipoPreparacion.ENTRADA,2500);
            String tipoC;
            switch (opcion) {

                case 1:
                    System.out.println("Pizza agregada.");
                    restaurante.add(plato1);
                    System.out.println("Fideos agregado.");
                    restaurante.add(plato2);
                    System.out.println("Rabas agregado.");
                    restaurante.add(plato3);
                    System.out.println(plato1);
                    System.out.println(plato2);
                    System.out.println(plato3);
                    break;
                case 2:
                    System.out.println("Rabas eliminada del menu.");
                    restaurante.remove(plato3);
                    break;
                case 3:
                    System.out.println("ingrese tipo:Entrada,postre o bebida:");
                    tipoC=scanner.nextLine();
                    for(Menu t:restaurante){
                        if (tipoC.equals(t.tipoP)){
                            System.out.println(t);
                        }
                    }
                    break;

                case 4:

                    // TODO: Filtrar items dentro de un rango de precios

                    break;

                case 5:

                    // TODO: Listar platos inferior a X calorias

                    break;

                case 6:

                    // TODO: Filtrar bebidas segun su tipo

                    break;

                case 7:

                    // TODO: Ordenar las preparaciones por precio o nombre.

                    break;

                case 8:

                    // TODO: Recorrer preparaciones y ejecutar acción según tipo

                    break;

            }

        } while (opcion != 0);


        scanner.close();
    }
}
