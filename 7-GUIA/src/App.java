import Ejercicio_1.Persona;
import Ejercicio_2.Gestora_Persona;
import org.json.JSONArray;

import java.util.List;
import java.util.Scanner;
import ManejoJSON.JSONUtiles;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op;

        do {
            System.out.println("ingresa un numero:");
            op= teclado.nextInt();

            switch (op){
                case 0:
                    System.out.println("Saliendo..");
                    break;
                case 1:
                    System.out.println("creo una instancia de persona.");
                    Persona persona1=new Persona("Matias",25,"42653790",'m');
                    Gestora_Persona gestor=new Gestora_Persona();
                    gestor.guardarPersona(persona1,"persona.json");
                    break;
                case 2:
                    System.out.println("Leyendo personas desde el archivo...");
                    Gestora_Persona gestora = new Gestora_Persona();
                    List<Persona> personas = gestora.leerPersonas("persona.json");

                    if (personas.isEmpty()) {
                        System.out.println("No se encontraron personas en el archivo.");
                    } else {
                        for (Persona p : personas) {
                            System.out.println(p);
                        }
                    }
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
        }while(op!=0);
    }
}






