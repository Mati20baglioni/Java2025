import GestorRestaurante.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op;
        boolean encontrado=false;

        /// INGREDIENTES DE PLATOS.
        ArrayList<String>ingredientesPlatos=new ArrayList<>();
        ingredientesPlatos.add("Harina");
        ingredientesPlatos.add("Sal");
        ingredientesPlatos.add("Huevo");
        ingredientesPlatos.add("Levadura");

        ArrayList<String>ingredientesBebidas=new ArrayList<>();
        ingredientesBebidas.add("agua Gasificada");
        ingredientesBebidas.add("Azucar");
        ingredientesBebidas.add("colorante");

        ArrayList<String>ingredienteBebidaAlcoholica=new ArrayList<>();
        ingredienteBebidaAlcoholica.add("Vodka");
        ingredienteBebidaAlcoholica.add("Jugo Naranja");

        ArrayList<String>ingredientesPostre=new ArrayList<>();
        ingredientesPostre.add("Helado");
        ingredientesPostre.add("Ensalada de Fruta");
        ingredientesPostre.add("Obleas");

        ArrayList<String>Principal=new ArrayList<>();
        Principal.add("Pescado");
        Principal.add("Papas Fritas");
        Principal.add("Rabas");
        Principal.add("Cornalitos");

        /// MENU RESTAURANTE.
        ArrayList<Preparaciones> Menu =new ArrayList<>();
        Preparaciones prep1=new Plato("Fideos",1500,ingredientesPlatos, TipoPreparacion.ENTRADA,1700);
        Preparaciones prep2=new Postre("Copa Chichilo",9500,ingredientesPostre,TipoPreparacion.POSTRE,true);
        Preparaciones prep3=new Bebida("CocaCola",4500,ingredientesBebidas,TipoPreparacion.BEBIDA,false);
        Preparaciones prep4=new Plato("Picada Marinera",18500,Principal,TipoPreparacion.PRINCIPAL,8500);
        Preparaciones prep5=new Bebida("Destornillador",3500,ingredienteBebidaAlcoholica,TipoPreparacion.BEBIDA,true);

        do {
            System.out.println("-----Menu-----");
            System.out.println("(0)-Salir");
            System.out.println("(1)-Incorporar o retirar preparaciones del menú.");
            System.out.println("(2)-Retirar del menu por nombre.");
            System.out.println("(3)-Consultar únicamente por una categoría determinada platos,bebidas o postres.");
            System.out.println("(4)-Filtrar ítems dentro de un rango de precios. ");
            System.out.println("(5)-Listar solo platos que no superen cierto nivel de calorías.");
            System.out.println("(6)-Localizar bebidas según su tipo.");
            System.out.println("(7)-Ordenar las preparaciones resultantes por precio o por nombre. ");
            System.out.println("(8)-Mostrar Recorrido completo con los metodos correspondientes. ");
            System.out.println("(9)-Mostrar todo el Menu Cargado. ");


            op= teclado.nextInt();

            switch (op){
                case 0:
                    System.out.println("Saliendo del sistema....");
                    break;
                case 1:
                    System.out.println("Agregando un Plato.");
                    Menu.add(prep1);
                    System.out.println("Agregando una Bebida.");
                    Menu.add(prep3);
                    System.out.println("Agregando un Postre.");
                    Menu.add(prep2);
                    System.out.println("Agregando un Plato Principal.");
                    Menu.add(prep4);
                    System.out.println("Agregando una Bebida Alcoholica.");
                    Menu.add(prep5);
                    break;
                case 2:
                    encontrado=false;
                    teclado.nextLine();
                    System.out.println("ingrese el nombre de la preparacion que desea eliminar");
                    String buscado= teclado.nextLine();

                    Iterator<Preparaciones> it= Menu.iterator();

                    while (it.hasNext()){
                        Preparaciones p= it.next();
                        if(p.getNombre().equalsIgnoreCase(buscado)){
                            it.remove();
                            encontrado=true;
                            System.out.println("el "+p.getNombre()+",fue eliminado del menu con exito");
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("el producto no fue encontrado ni eliminado");
                    }
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println();
                    System.out.println("Consultar (1)platos,(2)bebidas,(3)postres.");
                    int inciso= teclado.nextInt();
                    if(inciso==1){
                        for (Preparaciones p:Menu){
                            if(p instanceof Plato){
                                System.out.println(p);
                            }
                        }
                        if(Menu.isEmpty()){
                            System.out.println("El menu esta vacio.");
                        }
                    }else if(inciso==2){
                        for (Preparaciones p:Menu){
                            if(p instanceof Bebida){
                                System.out.println(p);
                            }
                        }
                        if(Menu.isEmpty()){
                            System.out.println("El menu esta vacio.");
                        }
                    }else if(inciso==3){
                        for (Preparaciones p:Menu){
                            if(p instanceof Postre){
                                System.out.println(p);
                            }
                        }
                        if(Menu.isEmpty()){
                            System.out.println("El menu esta vacio.");
                        }
                    }else {
                        System.out.println("Opcion incorrecta....");
                    }
                    break;
                case 4:
                    teclado.nextLine();
                    System.out.println("ingrese un rango de precio Min y Max");
                    double precioMin=teclado.nextDouble();
                    double precioMax= teclado.nextDouble();

                    for (Preparaciones p:Menu){
                        if (p.getPrecio()>=precioMin && p.getPrecio()<=precioMax){
                            System.out.println(p);
                        }
                    }
                    if (Menu.isEmpty()){
                        System.out.println("el menu esta vacio.");
                    }
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("ingrese la cantidad Max de calorias Aceptables");
                    double caloriasMax= teclado.nextDouble();

                    for (Preparaciones p:Menu){
                        if (p instanceof Plato){
                            Plato plato=(Plato) p;
                            if (plato.getCalorias()<=caloriasMax){
                                System.out.println(p);
                            }
                        }
                    }
                    if(Menu.isEmpty()){
                        System.out.println("El menu esta vacio.");
                    }
                    break;
                case 6:
                    teclado.nextLine();
                    System.out.println("Para ver bebidas:(1)Bebidas Alcoholicas,(2)Bebidas sin Alcohol.");
                    int opcion= teclado.nextInt();

                    if(opcion==1){
                        for (Preparaciones p:Menu){
                            if(p instanceof Bebida){
                                Bebida b=(Bebida) p;
                                if(b.isAlcohol()){
                                    System.out.println(b);
                                }
                            }
                        }
                    } else if (opcion==2) {
                        for (Preparaciones p:Menu){
                            if(p instanceof Bebida){
                                Bebida b=(Bebida) p;
                                if(!b.isAlcohol()){
                                    System.out.println(b);
                                }
                            }
                        }
                    }else {
                        System.out.println("opcion invalida.");
                    }

                    if(Menu.isEmpty()){
                        System.out.println("el menu esta vacio.");
                    }
                    break;
                case 7:
                    teclado.nextLine();
                    System.out.println("(1)Ordenar X Nombre,(2)Ordenar X Precio.");
                    int ordenarX= teclado.nextInt();

                    if(ordenarX==1){
                        Menu.sort(Comparator.comparing(Preparaciones::getNombre));
                        for (Preparaciones p:Menu){
                            System.out.println(p);
                        }
                    } else if (ordenarX==2) {
                        Menu.sort(Comparator.comparing(Preparaciones::getPrecio));
                        for (Preparaciones p:Menu){
                            System.out.println(p);
                        }
                    }else {
                        System.out.println("opcion no valida.");
                    }


                    if(Menu.isEmpty()){
                        System.out.println("Menu esta vacio.");
                    }
                    break;
                case 8:
                    System.out.println("Mostrar Recorrido del Menu");
                    for (Preparaciones p:Menu){
                        if (p instanceof Plato){
                            System.out.println(p);
                            Plato pl=(Plato) p;
                            if(pl.esSanoComer()){
                                System.out.println("es sano comer.");
                            }else {
                                System.out.println("no es sano comer esto.");
                            }
                        }else if(p instanceof Bebida){
                                System.out.println(p);
                                Bebida b=(Bebida) p;
                                if(b.isAlcohol()){
                                    System.out.println("la bebida tiene alcohol se aplica desc del 20%");
                                    double descAlcohol=b.calcularDescBebida();
                                    System.out.println("descuento de:"+descAlcohol+"");
                                }else {
                                    System.out.println("la bebida NO tiene alcohol se aplica desc del 10%");
                                    double descSinAlcohol=b.calcularDescBebida();
                                    System.out.println("descuento de:"+descSinAlcohol+"");
                                }

                        } else if (p instanceof Postre) {
                            System.out.println(p);
                        }else {
                            System.out.println("el menu no esta cargado.");
                        }
                    }
                    break;
                case 9:
                    System.out.println("Mostrar todo el menu Cargado");
                    for (Preparaciones p:Menu){
                        System.out.println(p);
                    }
                    break;
            }

        }while (op!=0);
    }
}
