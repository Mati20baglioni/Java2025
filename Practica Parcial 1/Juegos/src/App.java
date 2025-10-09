import Clases.Juegos;
import Clases.JuegosDigitales;
import Clases.JuegosFisicos;
import Enums.TipoJuego;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        ArrayList<Juegos>Biblioteca=new ArrayList<>();

        /// FANTASIA
        ArrayList<String>GeneroFantasia=new ArrayList<>();
        GeneroFantasia.add("Aventura");
        GeneroFantasia.add("Mundo Abierto");
        GeneroFantasia.add("Tercera Persona");

        /// PVP
        ArrayList<String>GeneroPvp=new ArrayList<>();
        GeneroPvp.add("Multijugador");
        GeneroPvp.add("Tercera Persona");
        GeneroPvp.add("Combate");

        /// HACK AND SLASH
        ArrayList<String>GeneroHackAndSlash=new ArrayList<>();
        GeneroHackAndSlash.add("Individual");
        GeneroHackAndSlash.add("Tercera Persona");
        GeneroHackAndSlash.add("Lineal");

        Juegos game_1=new JuegosFisicos("Mario Bros", TipoJuego.PS1, LocalDate.of(1998,2,17),GeneroFantasia);
        Juegos game_2=new JuegosFisicos("Mortal Kombat",TipoJuego.PS2,LocalDate.of(2005,4,15),GeneroPvp);
        Juegos game_3=new JuegosFisicos("God of War",TipoJuego.PS3,LocalDate.of(2007,5,14),GeneroHackAndSlash);

        Juegos game_4=new JuegosDigitales("Injustice",TipoJuego.PS4,LocalDate.of(2015,5,18),GeneroPvp);
        Juegos game_5=new JuegosDigitales("Kingdome Come Deliverance",TipoJuego.PC,LocalDate.of(2017,6,27),GeneroFantasia);

        /// CARGO TODOS LOS JUEGOS EN LA BIBLIOTECA.
        Biblioteca.add(game_1);
        Biblioteca.add(game_2);
        Biblioteca.add(game_3);
        Biblioteca.add(game_4);
        Biblioteca.add(game_5);

        for(Juegos j:Biblioteca){
            System.out.println(j);
        }
        /// REMOVER UN JUEGO USANDO EL ITERADOR.
        System.out.println("ingrese el id del juego que desea eliminar.");
        int buscado= teclado.nextInt();
        boolean encontrado=false;

        Iterator<Juegos> it=Biblioteca.iterator();
        while (it.hasNext()){
            Juegos j =it.next();
            if (j.getId()==buscado){
                encontrado=true;
                it.remove();
                System.out.println("Juego con el id:"+j.getId()+" fue eliminado.");

            }
        }
        if(!encontrado){
            System.out.println("juego no encontrado.");
        }

        /// MOSTRAR JUEGO FISICO.
        System.out.println("JUEGOS FISICOS.");
        for (Juegos j:Biblioteca){
            if (j instanceof JuegosFisicos){
                System.out.println(j);
            }
        }
        /// MOSTRAR JUEGO DIGITAL.
        System.out.println("JUEGOS DIGITALES.");
        for (Juegos j:Biblioteca){
            if (j instanceof JuegosDigitales){
                System.out.println(j);
            }
        }
        /// BUSCAR X ID
        teclado.nextLine();
        System.out.println("ingrese id:");
        int idbusqueda= teclado.nextInt();
        encontrado=false;
        for (Juegos j:Biblioteca){
          if(j.getId()==idbusqueda){
              encontrado=true;
              System.out.println(j);
          }
        }
        if(!encontrado){
            System.out.println("id no encontrado.");
        }
        /// BUSQUEDA POR NOMBRE.
        teclado.nextLine();
        encontrado=false;
        System.out.println("ingrese nombre:");
        String nombreBuscado= teclado.nextLine();

        for (Juegos j:Biblioteca){
            if(j.getNombre().equalsIgnoreCase(nombreBuscado)){
                encontrado=true;
                System.out.println(j);
            }
        }
        if(!encontrado){
            System.out.println("Nombre no coincide con nigun juego Cargado.");
        }

        /// ORDENAR BIBLIOTECA X PRECIO
        System.out.println("Ordenar X Nombre.");
        teclado.nextLine();
        Biblioteca.sort(Comparator.comparing(Juegos::getNombre));
        for (Juegos j:Biblioteca){
            System.out.println(j);
        }


    }
}
