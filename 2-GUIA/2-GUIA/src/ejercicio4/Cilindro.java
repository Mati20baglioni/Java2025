package ejercicio4;

public class Cilindro extends Circulo {
    private double altura=1.0;

    /// constructor.
    public Cilindro(double radio,double altura) {
        super(radio);
        this.altura = altura;
    }

    /// constructor sobrecargado.
    public Cilindro() {

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double volumenCilindro(){
        return (Math.PI*Math.pow(getRadio(),2)*altura);
    }

    public double volumenCilindro(double radio){
        return super.calcularArea();
    }





    @Override
    public double calcularArea() {
        double lado1=((2*Math.PI)*(Math.pow(getRadio(),2)));
        double lado2=((2*Math.PI)*(getRadio()*altura));
        return lado1+lado2;
    }

    @Override
    public String toString() {
        return "{Cilindro: subclase de " + super.toString() + " altura=" + altura + "}";
    }

}

