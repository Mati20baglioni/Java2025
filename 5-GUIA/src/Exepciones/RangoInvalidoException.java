package Exepciones;

public class RangoInvalidoException extends Exception {
    public RangoInvalidoException() {
        super("el numero no cumple con los criterios solicitados.");
    }
}
