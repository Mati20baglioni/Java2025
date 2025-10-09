import GestionTransporte.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op;

        /// FLOTA
        ArrayList<Transporte>flota=new ArrayList<>();

        /// TRANSPORTES CREADOS.
        Transporte vehiculo1=new Colectivo(35,65000, TipoVehiculo.COLECTIVO,15);
        Transporte vehiculo2=new Avion(120,350000,TipoVehiculo.AVION,15000);
        Transporte vehiculo3=new Tren(300,157000,TipoVehiculo.TREN,TipoDeTren.CARGA,65000,20);
        Transporte vehiculo4=new Tren(500,200000,TipoVehiculo.TREN,TipoDeTren.PASAJEROS,560000,54);
        Transporte vehiculo5=new Avion(200,400000,TipoVehiculo.AVION,5000);
        Transporte vehiculo6=new Colectivo(50,75000,TipoVehiculo.COLECTIVO,30);


        do {
            System.out.println("-----MENU-----");
            System.out.println("(0)-Salir");
            System.out.println("(1)-Incorporar vehiculos a la flota.");
            System.out.println("(2)-Remover vehiculo de la flota.");
            System.out.println("(3)-Consultar únicamente por una categoría determinada colectivos trenes o aviones.");
            System.out.println("(4)-Filtrar vehículos dentro de un rango de capacidad de pasajeros.");
            System.out.println("(5)-Listar solo colectivos aptos para recorridos cortos.");
            System.out.println("(6)-Localizar trenes según su tipo (carga o pasajeros).");
            System.out.println("(7)-Ordenar los vehículos resultantes por costo de mantenimiento o identificación.");
            System.out.println("(8)-Recorrer todos los vehiculos implementando los metodos y mostrando todo.");

            System.out.println("ingrese una opcion:");
            op= teclado.nextInt();

            switch (op){
                case 0:
                    System.out.println("Salir");
                    break;
                case 1:
                    System.out.println("ingreso un Colectivo a la flota.");
                    flota.add(vehiculo1);
                    System.out.println("ingreso un Avion a la flota.");
                    flota.add(vehiculo2);
                    System.out.println("ingreso un Tren a la flota.");
                    flota.add(vehiculo3);
                    System.out.println("ingreso un Tren a la flota.");
                    flota.add(vehiculo4);
                    System.out.println("ingreso un Avion a la flota.");
                    flota.add(vehiculo5);
                    System.out.println("ingreso un Colectivo a la flota.");
                    flota.add(vehiculo6);
                    break;
                case 2:
                    teclado.nextLine();
                    boolean encontrado=false;
                    Iterator<Transporte> it= flota.iterator();
                    System.out.println("ingrese el id del vehiculo que desea remover:");
                    int idbuscado= teclado.nextInt();

                    while (it.hasNext()){
                        Transporte v= it.next();
                        if(v.getId()==idbuscado){
                            it.remove();
                            encontrado=true;
                            System.out.println("el vehiculo con el id:"+v.getId()+",fue eliminado exitosamente.");
                        }
                    }
                    if(!encontrado){
                        System.out.println("el id buscado no existe.");
                    }
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("Que desea ver(1)Colectivos,(2)Trenes,(3)Aviones");
                    int inciso=teclado.nextInt();

                    if(inciso==1){
                        for (Transporte v:flota){
                            if(v instanceof Colectivo){
                                System.out.println(v);
                            }
                        }
                    } else if (inciso==2) {
                        for (Transporte v:flota){
                            if(v instanceof Tren){
                                System.out.println(v);
                            }
                        }
                    } else if (inciso==3) {
                        for (Transporte v:flota){
                            if(v instanceof Avion){
                                System.out.println(v);
                            }
                        }
                    }else {
                        System.out.println("opcion no valida");
                    }
                    break;
                case 4:
                    teclado.nextLine();
                    System.out.println("ingrese un rango de capacidad de pasajeros Min y Max");
                    int min=teclado.nextInt();
                    int max=teclado.nextInt();

                    for (Transporte v:flota){
                        if (v.getCapacidad()>=min && v.getCapacidad()<=max){
                            System.out.println(v);
                        }
                    }
                    break;
                case 5:
                    teclado.nextLine();
                    encontrado=false;
                    for (Transporte v:flota){
                        if (v instanceof Colectivo){
                            Colectivo c=(Colectivo) v;
                            if(c.aptoViajeCorto()){
                                encontrado=true;
                                System.out.println("se encontraron colectivos aptos para viajes cortos.");
                                System.out.println(c);

                            }
                        }
                    }
                    if(!encontrado){
                        System.out.println("no se encontraron coincidencias.");
                    }
                    break;
                case 6:
                    teclado.nextLine();
                    System.out.println("Que desea ver (1)Trenes de carga,(2)Trenes de Pasajeros.");
                    int opcionVer=teclado.nextInt();

                    if(opcionVer==1){
                        for (Transporte v:flota){
                            if (v instanceof Tren){
                                Tren tren=(Tren) v;
                                if(tren.getTipoTren()==TipoDeTren.CARGA){
                                    System.out.println("TREN DE CARGA.");
                                    System.out.println(tren);
                                }
                            }
                        }
                    }else if(opcionVer==2){
                        for (Transporte v:flota){
                            if (v instanceof Tren){
                                Tren tren=(Tren) v;
                                if(tren.getTipoTren()==TipoDeTren.PASAJEROS){
                                    System.out.println("TREN DE PASAJEROS");
                                    System.out.println(tren);
                                }
                            }
                        }
                    }else {
                        System.out.println("opcion incorrecta.");
                    }
                    break;
                case 7:
                    teclado.nextLine();
                    System.out.println("Como desea ordenar por:(1)Costo de mantenimiento,(2)identificacion.");
                    int tipoOrdenamiento= teclado.nextInt();

                    if(tipoOrdenamiento==1){
                        flota.sort(Comparator.comparing(Transporte::getCostoMensual));
                        for (Transporte v:flota){
                            System.out.println(v);
                        }
                    } else if (tipoOrdenamiento==2) {
                        flota.sort(Comparator.comparing(Transporte::getId));
                        for (Transporte v:flota){
                            System.out.println(v);
                        }
                    }else{
                        System.out.println("opcion no valida.");
                    }
                    break;
                case 8:
                    if(!flota.isEmpty()){
                        for (Transporte v:flota){
                            if(v instanceof Colectivo){
                                System.out.println("--------------------------------------------------------------");
                                System.out.println(v);
                                Colectivo c=(Colectivo) v;
                                c.mostrarInformacionOperativa();
                            }else if (v instanceof Tren){
                                System.out.println("--------------------------------------------------------------");
                                System.out.println(v);
                                Tren tren=(Tren) v;
                                tren.mostrarInformacionOperativa();
                            } else if (v instanceof Avion) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println(v);
                                Avion a=(Avion) v;
                                a.mostrarInformacionOperativa();
                            }
                        }
                    }

                    break;
            }

        }while(op!=0);

    }
}

