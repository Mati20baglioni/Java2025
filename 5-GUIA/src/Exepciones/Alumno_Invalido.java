package Exepciones;

public class Alumno_Invalido extends Exception {
    public Alumno_Invalido() {
        super("El alumno posee campos null o vacios no son validos para este metodo.");
    }
}
