import org.json.JSONObject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int op=0;

        do {

            try {
                System.out.println("ingrese una opcion");
                op= teclado.nextInt();

                switch (op){
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    case 1:
                        System.out.println("ejercicio 1");
                        break;
                    case 2:
                        break;
                    case 3:

                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("dato invalido.");
                teclado.nextLine();
            }

        }while (op!=0);
    }
}