import GestionAnalisisClinicos.*;

import javax.management.loading.PrivateClassLoader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op,idBuscado,inciso,edadMin,edadMax;
        boolean encontrado=false;

        /// LISTA MUESTRAS.
        ArrayList<Muestra>Laboratorio=new ArrayList<>();
        /// MUESTRAS PARA CARGAR.
        Muestra muestra1=new AnalisisADN("Matias Baglioni",25, TipoAnalisis.ADN, LocalDate.of(2025,9,29),15.0);
        Muestra muestra2=new AnalisisOrina("Camila Baglioni",27,TipoAnalisis.ORINA,LocalDate.of(2025,9,29),150.0,250,15.0);
        Muestra muestra3=new AnalisisSangre("Cristian Baglioni",55,TipoAnalisis.SANGRE,LocalDate.of(2025,9,29),1500,1500,750);


        do {
            System.out.println("Menu de Consignas");
            System.out.println("(0)-Salir");
            System.out.println("(1)-Agregar muestras al sistema");
            System.out.println("(2)-Eliminar muestras del sistema");
            System.out.println("(3)-Buscar muestra por ID");
            System.out.println("(4)-Filtrar muestras por tipo de análisis");
            System.out.println("(5)-Filtrar por rango de edad del paciente");

            System.out.println("(6)-Ordenar las muestras por nombre del paciente o fecha");
            System.out.println("(7)-Recorrer todas las muestras y ejecutar los métodos propios según el tipo (ej: calcular promedio, analizar coincidencia, etc.)");

            System.out.println("(8)-Mostrar Todo lo Cargado.");
            op=teclado.nextInt();

            switch (op){
                case 0:
                    System.out.println("Salir del Sistema....");
                    break;
                case 1:
                    System.out.println("Agregando Muestras de paciente Matias Baglioni");
                    Laboratorio.add(muestra1);
                    Laboratorio.add(muestra2);
                    Laboratorio.add(muestra3);
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Ingrese el id de la muestra para eliminarla:");
                    idBuscado=teclado.nextInt();
                    encontrado=false;
                    Iterator<Muestra> it=Laboratorio.iterator();
                    while (it.hasNext()){
                        Muestra m= it.next();
                        if(m.getId()==idBuscado){
                            encontrado=true;
                            it.remove();
                            System.out.println("Muestra con el id: "+m.getId()+",eliminada");
                        }
                    }
                    if(!encontrado){
                        System.out.println("Muestra con el siguiente id:"+idBuscado+" no encontrada.");
                    }

                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("Ingrese el id de la muestra para eliminarla:");
                    idBuscado=teclado.nextInt();
                    for (Muestra m:Laboratorio){
                        if(m.getId()==idBuscado){
                            encontrado=true;
                            System.out.println(m);
                        }
                    }
                    if(!encontrado){
                        System.out.println("muestra no encontrada");
                    }
                    break;
                case 4:
                    teclado.nextLine();
                    System.out.println("(0)Salir,(1)Analisis ADN,(2)Analisis Sangre,(3)Analisis Orina.");
                    inciso=teclado.nextInt();
                    encontrado=false;

                       switch (inciso){
                           case 0:
                               System.out.println("Volviendo al Menu Principal.");
                               break;
                           case 1:
                               System.out.println("Mostrando muestras de:Analisis de ADN:");
                               encontrado=false;
                               for (Muestra m:Laboratorio){
                                   if (m instanceof AnalisisADN){
                                       encontrado=true;
                                       System.out.println(m);
                                   }
                               }
                               if(!encontrado){
                                   System.out.println("No hay muestras Cargadas de este Tipo.");
                               }
                               break;
                           case 2:
                               System.out.println("Mostrando muestras de:Analisis de Sangre:");
                               encontrado=false;
                               for (Muestra m:Laboratorio){
                                   if (m instanceof AnalisisSangre){
                                       encontrado=true;
                                       System.out.println(m);
                                   }
                               }
                               if(!encontrado){
                                   System.out.println("No hay muestras Cargadas de este Tipo.");
                               }
                               break;
                           case 3:
                               System.out.println("Mostrando muestras de:Analisis de Orina:");
                               for (Muestra m:Laboratorio){
                                   if (m instanceof AnalisisOrina){
                                       encontrado=true;
                                       System.out.println(m);
                                   }
                               }
                               if(!encontrado){
                                   System.out.println("No hay muestras Cargadas de este Tipo.");
                               }
                               break;
                       }

                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("Ingrese rango de edad Min y Max:");
                    edadMin=teclado.nextInt();
                    edadMax=teclado.nextInt();

                    for (Muestra m:Laboratorio){
                        if(m.edad>=edadMin && m.edad<=edadMax){
                            System.out.println(m);
                        }
                    }
                    break;
                case 6:
                    System.out.println("(0)Salir,(1)OrdenarXnombre,(2)OrdenarxFecha");
                    inciso=teclado.nextInt();
                    switch (inciso){
                        case 0:
                            System.out.println("Volviendo al Menu.");
                            break;
                        case 1:
                            for (Muestra m:Laboratorio){

                            }
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 7:

                    System.out.println("Ejercicio 7");
                    break;
                case 8:
                    System.out.println("Todos las Muestras Cargadas:");
                    for (Muestra m:Laboratorio){
                        System.out.println(m);
                    }
                    break;
            }
        }while (op!=0);
    }
}
