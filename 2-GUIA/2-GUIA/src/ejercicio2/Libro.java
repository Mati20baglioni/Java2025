package ejercicio2;
/// atributo
public class Libro {
    private String titulo;
    private Double precio;
    private int stock;
    private Autor autor;
    /// constructor.

    public Libro(String titulo, Double precio, int stock,Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor=autor;
    }

    /// getter y setter.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /// metodos.

    public void cambiarPrecio(double nuevoPrecio){
        setPrecio(nuevoPrecio);
    }
    public void cambiarStock(int copias){
        setStock(getStock()+copias);
    }
    public void mensajePrecio(){
        System.out.println("El libro:"+titulo+" de: "+autor.getNombre()+" "+autor.getApellido()+",Se vende a "+precio+" pesos.");
    }

    /// to string.
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
