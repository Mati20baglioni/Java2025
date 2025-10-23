package Colegio;

import Exepciones.Alumno_Invalido;
import Exepciones.Alumnos_Vacio;

import java.util.ArrayList;
import java.util.Iterator;

public class Gestora_Colegio {
    private ArrayList<Alumnos>colegio=new ArrayList<>();

    /// CONSTRUCTOR.
    public Gestora_Colegio(ArrayList<Alumnos> colegio) {
        this.colegio = colegio;
    }
    /// GETTERS Y SETTERS.
    public ArrayList<Alumnos> getColegio() {
        return colegio;
    }

    public void setColegio(ArrayList<Alumnos> colegio) {
        this.colegio = colegio;
    }
    /// METODOS.
    public void agregarAlumno(Alumnos alumno)throws Alumno_Invalido{
        if (alumno.getNacionalidad() == null || alumno.getNacionalidad().isEmpty() ||
                alumno.getNombre() == null || alumno.getNombre().isEmpty()) {
            throw new Alumno_Invalido();
        }
        colegio.add(alumno);
    }
    public void verNacionalidad(Alumnos alumno) throws Alumno_Invalido, Alumnos_Vacio {
        if (alumno.getNacionalidad() == null || alumno.getNacionalidad().isEmpty()) {
            throw new Alumno_Invalido();
        }
        if (colegio.isEmpty()) {
            throw new Alumnos_Vacio();
        }

        int contador = 0;
        for (Alumnos a : colegio) {
            if (a.getNacionalidad().equalsIgnoreCase(alumno.getNacionalidad())) {
                contador++;
            }
        }

        System.out.println("Nacionalidad: " + alumno.getNacionalidad() + " → " + contador + " alumno(s)");
    }

    public void cuantos() throws Alumnos_Vacio {
        if (colegio.isEmpty()) {
            throw new Alumnos_Vacio();
        }

        ArrayList<String> nacionalidadesContadas = new ArrayList<>();
        int contador = 0;

        for (Alumnos alumno : colegio) {
            String nacionalidad = alumno.getNacionalidad();

            if (nacionalidad != null && !nacionalidad.isEmpty() && !nacionalidadesContadas.contains(nacionalidad)) {
                nacionalidadesContadas.add(nacionalidad);
                contador++;
            }
        }

        System.out.println("Hay " + contador + " nacionalidades diferentes.");
    }
    public void borrar(Alumnos alumno) throws Alumnos_Vacio {
        if (colegio.isEmpty()) {
            throw new Alumnos_Vacio();
        }

        Iterator<Alumnos> i = colegio.iterator();
        boolean encontrado = false;

        while (i.hasNext()) {
            Alumnos actual = i.next();
            if (actual.getNombre().equalsIgnoreCase(alumno.getNombre()) &&
                    actual.getNacionalidad().equalsIgnoreCase(alumno.getNacionalidad())) {
                i.remove();
                encontrado = true;
                System.out.println("Alumno eliminado: " + actual.getNombre());
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El alumno no se encuentra en el listado.");
        }
    }
    public void verTodos() throws Alumnos_Vacio {
        if (colegio.isEmpty()) {
            throw new Alumnos_Vacio();
        }

        ArrayList<String> nacionalidadesContadas = new ArrayList<>();

        for (Alumnos alumno : colegio) {
            String nacionalidad = alumno.getNacionalidad();

            if (!nacionalidadesContadas.contains(nacionalidad)) {
                nacionalidadesContadas.add(nacionalidad);
                int contador = 0;

                for (Alumnos a : colegio) {
                    if (a.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                        contador++;
                    }
                }

                System.out.println(nacionalidad + ": " + contador + " alumno(s)");
            }
        }
    }

    /// TO STRINGS.
    @Override
    public String toString() {
        return "Gestora_Colegio{" +
                "colegio=" + colegio +
                '}';
    }
}


