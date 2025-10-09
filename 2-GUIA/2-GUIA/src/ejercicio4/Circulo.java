package ejercicio4;

public class Circulo {
    private double radio=1.0;
    private String color="rojo";

    /// constructor.
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    /// Constructor sobrecargado.
    public Circulo() {
    }
    public Circulo(double radio) {
        this.radio = radio;
    }

    /// getters y setters.
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /// metodos

    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }

    /// to string.
    @Override
    public String toString() {
        return "" +
                "radio=" + radio +
                ", color='" + color + '\''
                ;
    }


}
