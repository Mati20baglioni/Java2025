package EjerciciosGuia;

import java.util.ArrayList;

public class Colegio {
    private ArrayList<Alumnos> listadoAlumnos = new ArrayList<>();

    // CONSTRUCTORES
    public Colegio() { }

    public Colegio(ArrayList<Alumnos> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    // GETTERS Y SETTERS
    public ArrayList<Alumnos> getListadoAlumnos() {
        return listadoAlumnos;
    }

    public void setListadoAlumnos(ArrayList<Alumnos> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    // MÉTODOS
    public void agregarAlumno(Alumnos a) {
        if (a == null) {
            throw new IllegalArgumentException("El alumno no puede ser null.");
        }
        if (a.getNacionalidad() == null || a.getNacionalidad().isEmpty()) {
            throw new IllegalArgumentException("El alumno debe tener una nacionalidad.");
        }
        listadoAlumnos.add(a);
        System.out.println("Alumno agregado: " + a);
    }

    public void verNacionalidad(String nacionalidad) {
        if (listadoAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en el colegio.");
            return;
        }
        int contador = 0;
        for (Alumnos a : listadoAlumnos) {
            if (a.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                contador++;
            }
        }
        System.out.println("Nacionalidad: " + nacionalidad + " | Cantidad de alumnos: " + contador);
    }

    public void cuantos() {
        if (listadoAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en el colegio.");
            return;
        }
        ArrayList<String> nacionalidadesUnicas = new ArrayList<>();
        for (Alumnos a : listadoAlumnos) {
            String n = a.getNacionalidad();
            if (!nacionalidadesUnicas.contains(n)) {
                nacionalidadesUnicas.add(n);
            }
        }
        System.out.println("Número de nacionalidades diferentes: " + nacionalidadesUnicas.size());
    }

    public void borrar(Alumnos a) {
        if (listadoAlumnos.isEmpty()) {
            System.out.println("No hay alumnos para eliminar.");
            return;
        }
        if (!listadoAlumnos.contains(a)) {
            System.out.println("El alumno no existe en el listado.");
            return;
        }
        listadoAlumnos.remove(a);
        System.out.println("Alumno eliminado correctamente: " + a);
    }

    public void verTodos() {
        if (listadoAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en el colegio.");
            return;
        }

        ArrayList<String> nacionalidadesContadas = new ArrayList<>();
        for (Alumnos a : listadoAlumnos) {
            String n = a.getNacionalidad();
            if (!nacionalidadesContadas.contains(n)) {
                int contador = 0;
                for (Alumnos b : listadoAlumnos) {
                    if (b.getNacionalidad().equalsIgnoreCase(n)) {
                        contador++;
                    }
                }
                System.out.println("Nacionalidad: " + n + " | Cantidad de alumnos: " + contador);
                nacionalidadesContadas.add(n);
            }
        }
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "listadoAlumnos=" + listadoAlumnos +
                '}';
    }
}
