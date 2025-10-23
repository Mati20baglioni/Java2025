import Enums.Tipo_Transporte;
import Enums.Tipo_Tren;
import Transporte.Transporte;

import java.util.ArrayList;
import java.util.Scanner;
import Transporte.Colectivo;
import Transporte.Tren;
import Transporte.Avion;
import Transporte.Gestora_Transporte;
public class App {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op;

        Colectivo colectivo1 = new Colectivo(40, 50000, Tipo_Transporte.COLECTIVO, 30); // apto recorrido corto
        Colectivo colectivo2 = new Colectivo(25, 45000, Tipo_Transporte.COLECTIVO, 20); // no apto
        Tren tren1 = new Tren(120, 150000, Tipo_Transporte.TREN, Tipo_Tren.TRANSPORTE, 600000, 40); // tarifa promedio = 15000
        Tren tren2 = new Tren(80, 130000, Tipo_Transporte.TREN, Tipo_Tren.CARGA, 400000, 20); // tarifa promedio = 20000
        Avion avion1 = new Avion(200, 300000, Tipo_Transporte.AVION, 12000); // internacional
        Avion avion2 = new Avion(180, 280000, Tipo_Transporte.AVION, 8000);  // no internacional


        Gestora_Transporte gestora = new Gestora_Transporte(new ArrayList<>());
        do {

            System.out.println("Seleccione una operación:");
            System.out.println("(0) Salir");
            System.out.println("(1) Agregar transportes predefinidos a la flota");
            System.out.println("(2) Mostrar transportes por categoría (COLECTIVO, TREN, AVION)");
            System.out.println("(3) Mostrar transportes por rango de capacidad");
            System.out.println("(4) Mostrar colectivos aptos para recorridos cortos");
            System.out.println("(5) Mostrar trenes por tipo (CARGA o PASAJEROS)");
            System.out.println("(6) Ordenar flota por ID");
            System.out.println("(7) Mostrar mensaje: ordenación por costo no implementada");
            System.out.println("(8) Ejecutar acción operativa según tipo de transporte");
            System.out.println("(9) Mostrar toda la flota");
            System.out.println("(10) Eliminar transporte por ID");

            op= teclado.nextInt();;

            switch (op) {
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                    gestora.agregarTransporte_flota(colectivo1);
                    gestora.agregarTransporte_flota(colectivo2);
                    gestora.agregarTransporte_flota(tren1);
                    gestora.agregarTransporte_flota(tren2);
                    gestora.agregarTransporte_flota(avion1);
                    gestora.agregarTransporte_flota(avion2);
                    System.out.println("Transportes agregados a la flota.");
                    break;

                case 2:
                    System.out.println("Ingrese tipo de transporte (COLECTIVO, TREN, AVION):");
                    String tipoStr = teclado.next().toUpperCase();

                    if (tipoStr.equals("COLECTIVO")) {
                        gestora.consultarPorCategoria(Tipo_Transporte.COLECTIVO);
                    } else if (tipoStr.equals("TREN")) {
                        gestora.consultarPorCategoria(Tipo_Transporte.TREN);
                    } else if (tipoStr.equals("AVION")) {
                        gestora.consultarPorCategoria(Tipo_Transporte.AVION);
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Capacidad mínima: ");
                    int min = teclado.nextInt();
                    System.out.print("Capacidad máxima: ");
                    int max = teclado.nextInt();
                    gestora.filtrarPorRangoCapacidad(min, max);
                    break;

                case 4:
                    gestora.colectivosAptos();
                    break;

                case 5:
                    System.out.println("Ingrese tipo de tren (CARGA o PASAJEROS):");
                    String tipoTrenStr = teclado.next().toUpperCase();

                    if (tipoTrenStr.equals("CARGA")) {
                        gestora.TrenXtipo(Tipo_Tren.CARGA);
                    } else if (tipoTrenStr.equals("PASAJEROS")) {
                        gestora.TrenXtipo(Tipo_Tren.TRANSPORTE);
                    } else {
                        System.out.println("Tipo de tren inválido.");
                    }
                    break;

                case 6:
                    gestora.ordenarPorId();
                    gestora.mostrarFlota();
                    break;

                case 7:
                    System.out.println("Ordenar por costo no está implementado (solo por ID según consigna).");
                    break;

                case 8:
                    gestora.ejecutarAccionPorTipo();
                    break;

                case 9:
                    gestora.mostrarFlota();
                    break;
                case 10:
                    System.out.print("Ingrese el ID del transporte a eliminar: ");
                    int idEliminar = teclado.nextInt();
                    boolean encontrado = false;

                    for (Transporte t : gestora.getFlota()) {
                        if (t.getId() == idEliminar) {
                            gestora.eliminarTransporte_flota(t);
                            System.out.println("Transporte con ID " + idEliminar + " eliminado.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró ningún transporte con ese ID.");
                    }
                    break;

                default:
                    System.out.println("Opción inválida.");
            }


        }while (op!=0);
    }
}


