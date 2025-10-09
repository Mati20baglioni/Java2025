import GestorTiendaJuegos.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op;

        /// ETIQUETA GENERICA.
        ArrayList<String>Etiqueta1=new ArrayList<>();
        Etiqueta1.add("multijugador");
        Etiqueta1.add("Vr");
        Etiqueta1.add("Accion");

        ArrayList<String> Etiqueta2 = new ArrayList<>();
        Etiqueta2.add("aventura");
        Etiqueta2.add("historia");
        Etiqueta2.add("un jugador");

        ArrayList<String> Etiqueta3 = new ArrayList<>();
        Etiqueta3.add("gaming");
        Etiqueta3.add("RGB");
        Etiqueta3.add("alta precisión");

        ArrayList<String> Etiqueta4 = new ArrayList<>();
        Etiqueta4.add("mousePad");
        Etiqueta4.add("40X90");

        ArrayList<String> Etiqueta5 = new ArrayList<>();
        Etiqueta5.add("inalambricos");

        /// TIENDA
        ArrayList<Productos>Tienda=new ArrayList<>();
        /// PRODUCTOS PARA CARGAR.
        Productos prod1=new JuegosFisicos("Hades",10000,Etiqueta1, TipoDeProducto.FISICO,55);
        Productos prod2=new JuegosDigitales("Castelvania Lords of Shadows",15250,Etiqueta2,TipoDeProducto.DIGITAL,15.0);
        Productos prod3=new Accesorios("MousePad God of War",12000,Etiqueta4,TipoDeProducto.ACCESORIO,false);
        Productos prod4=new JuegosDigitales("Castelvania Mirrow of Fate",5000,Etiqueta2,TipoDeProducto.DIGITAL,2.0);
        Productos prod5=new Accesorios("Parlantes",22000,Etiqueta5,TipoDeProducto.ACCESORIO,true);




        do {
            System.out.println("Menu de Consignas");
            System.out.println("(0)-Salir");
            System.out.println("(1)-Agregar productos del catálogo");
            System.out.println("(2)-Eliminar productos del catálogo");
            System.out.println("(3)-Consultar por una categoría específica (físico, digital, accesorio)");
            System.out.println("(4)-Filtrar productos en un rango de precios");
            System.out.println("(5)-Listar solo juegos físicos que tengan más de X copias");
            System.out.println("(6)-Filtrar juegos digitales que sean ligeros");
            System.out.println("(7)-Filtrar accesorios compatibles con PC");
            System.out.println("(8)-Ordenar el catálogo por precio o por nombre");
            System.out.println("(9)-Juego físico → verificar si es popular");
            System.out.println("(10)-Juego digital → verificar si es ligero");

            op=teclado.nextInt();

            switch (op){
                case 0:
                    System.out.println("Salir del Sistema....");
                    break;
                case 1:
                    System.out.println("Agrego un juego Fisico...");
                    Tienda.add(prod1);
                    System.out.println("Agrego un juego Digital...");
                    Tienda.add(prod2);
                    System.out.println("Agrego un juego Digital...");
                    Tienda.add(prod4);
                    System.out.println("Agrego Accesorio...");
                    Tienda.add(prod3);
                    System.out.println("Agrego Accesorio...");
                    Tienda.add(prod5);
                    break;
                case 2:
                    teclado.nextLine();

                    Iterator<Productos> it = Tienda.iterator();
                    boolean eliminado = false;

                    System.out.print("Ingrese el nombre del producto que desea eliminar: ");
                    teclado.nextLine(); // limpiar buffer
                    String nombreBuscado = teclado.nextLine();

                    while (it.hasNext()) {
                        Productos p = it.next();

                        if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                            it.remove();
                            System.out.println("Producto eliminado: " + p.getNombre());
                            eliminado = true;
                            break;
                        }
                    }

                    if (!eliminado) {
                        System.out.println("No se encontró un producto con ese nombre.");
                    }
                    break;
                case 3:
                    int opcion;
                    do {
                        System.out.println("(0)Volver,(1)Juegos Fisicos,(2)Juegos Digitles,(3)Accesorios.");
                        opcion= teclado.nextInt();
                        switch (opcion){
                            case 0:
                                System.out.println("Volver al Menu....");
                                break;
                            case 1:
                                System.out.println("Filtrado Juegos Fisicos.");
                                for (Productos p:Tienda){
                                    if(p instanceof JuegosFisicos){
                                        System.out.println(p);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Filtrado Juegos Digitales.");
                                for (Productos p:Tienda){
                                    if(p instanceof JuegosDigitales){
                                        System.out.println(p);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Filtrado Accesorios.");
                                for (Productos p:Tienda){
                                    if(p instanceof Accesorios){
                                        System.out.println(p);
                                    }
                                }
                                break;
                            default:
                                System.out.println("incorrecto intente nuevamente");
                                opcion= teclado.nextInt();
                        }
                    }while(opcion!=0);

                    break;
                case 4:
                    System.out.println("Ingresa un Minimo");
                    double min= teclado.nextInt();
                    System.out.println("Ingresa un Maximo");
                    double max=teclado.nextInt();

                    for (Productos p: Tienda){
                        if(p.getPrecio()>=min && p.getPrecio()<=max){
                            System.out.println(p);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese numero de copias para filtrar EN juego fisico:");
                    int numeroCopias=teclado.nextInt();
                    boolean encontrado=false;
                    for (Productos p : Tienda) {
                        if (p instanceof JuegosFisicos) {
                            JuegosFisicos j = (JuegosFisicos) p;
                            if (j.getCantidadStock() > numeroCopias) {
                                System.out.println(j);
                                encontrado = true;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No hay juegos físicos con más de " + numeroCopias + " copias.");
                    }
                    break;
                case 6:
                    System.out.println("Mostrar juegos digitales menores a 5 Gb");
                    boolean flag=false;
                    for (Productos p:Tienda){
                        if(p instanceof JuegosDigitales){
                            JuegosDigitales j=(JuegosDigitales) p;
                            if (j.esLigero()){
                                flag=true;
                                System.out.println(p);
                            }
                        }
                    }
                    if(!flag){
                        System.out.println("Ningun juego cumple la condicion de filtrado.");
                    }

                    break;
                case 7:
                    System.out.println("Filtrar Accesorios compatibles con PC.");
                    boolean e=false;
                    for (Productos p:Tienda){
                        if(p instanceof Accesorios){
                            Accesorios a=(Accesorios) p;
                            if (a.isCompatibleConPc()){
                                e=true;
                                System.out.println(p);
                            }
                        }
                    }
                    if(!e){
                        System.out.println("Ningun accesorio cumple la condicion.");
                    }

                    break;
                case 8:

                    System.out.println("(1)Ordenar por Precio,(2)Ordenar por nombre.");
                    int num=teclado.nextInt();

                    if(num==1){
                        Tienda.sort(Comparator.comparing(Productos::getPrecio));
                        for (Productos p:Tienda){
                            System.out.println(p);
                        }
                    }else if(num==2){
                        Tienda.sort(Comparator.comparing(Productos::getNombre));
                        for (Productos p:Tienda){
                            System.out.println(p);
                        }
                    }else {
                        System.out.println("valor incorrecto ingresado");
                    }
                    break;

                case 9:
                    teclado.nextLine();
                    System.out.println("ingresa un titulo fisico:");
                    String titulo= teclado.nextLine();
                    boolean enc=false;

                    for (Productos p:Tienda){
                        if(p instanceof JuegosFisicos){
                            JuegosFisicos j=(JuegosFisicos) p;
                            if (j.getNombre().equalsIgnoreCase(titulo)){
                                enc=true;
                                System.out.println("el titulo"+j.getNombre()+"es popular?"+j.esPopular()+"");
                            }
                        }
                    }
                    if(!enc){
                        System.out.println("Titulo no encontrado....");
                    }
                    break;
                case 10:
                    teclado.nextLine();
                    System.out.println("ingresa un titulo digital");
                    String tituloDigital=teclado.nextLine();

                    boolean encontradito=false;

                    for (Productos p:Tienda){
                        if (p instanceof JuegosDigitales){
                            JuegosDigitales j=(JuegosDigitales) p;
                            if(p.getNombre().equalsIgnoreCase(tituloDigital)){
                                encontradito=true;
                                System.out.println("El Titulo:"+p.getNombre()+"es ligero?:"+j.esLigero()+"");
                            }
                        }
                    }
                    break;

            }
        }while (op!=0);
    }
}