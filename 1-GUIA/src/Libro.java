public class Libro {

    private static int contadorLibros = 0;
    private int idLibro;
    private String titulo;
    private String autor;
    private double precioLibroUnidad;
    private int cantidadCopias;


    /// constructor.
    public Libro(String titulo, String autor, double precio, int cantidad) {
        this.idLibro=++contadorLibros;
        this.titulo =titulo;
        this.autor = autor;
        this.precioLibroUnidad = precio;
        this.cantidadCopias = cantidad;

    }
    ///getter y setter

    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecioLibroUnidad() {
        return precioLibroUnidad;
    }

    public void setPrecioLibroUnidad(double precioLibroUnidad) {
        this.precioLibroUnidad = precioLibroUnidad;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precioLibroUnidad=" + precioLibroUnidad +
                ", copias disponibles=" + cantidadCopias + "}";
    }

    /// metodos

    public void venderCopias(int numCopias){
        if(numCopias>cantidadCopias){
            System.out.println("No se Pueden vender:"+numCopias+",del libro:"+titulo+",numero disponible"+cantidadCopias+"");
        }
        else{
            cantidadCopias-=numCopias;
            System.out.println("Copias vendidas:"+numCopias+",del libro:"+titulo+",numero restante de copias:"+cantidadCopias+"");
        }
    }
    public void agregarCopias(int cantidad) {
        cantidadCopias += cantidad;
        System.out.println("Se agregaron:"+cantidad+",copias al inventario de:"+titulo+".");
    }
}





