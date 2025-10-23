package clases;

public class Tienda {

    private String nombre;
    private String ubicacion;
    private Inventario<ProductoElectronico> inventario;

    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Inventario<ProductoElectronico> getInventario() {
        return inventario;
    }

    public void setInventario(Inventario<ProductoElectronico> inventario) {
        this.inventario = inventario;
    }

    public void filtrarPortatiles(){
        System.out.println(inventario.listarComputadoras());
    }

    public void filtrarXPrecioYMarca(double precioMin, String marca){
        System.out.println(inventario.filtrarXPrecioYMarca(precioMin,marca));
    }

    public void filtrarXUnidadesYEspecificaciones(int cantUnidades,String nombreEspecificacion, String valorEspecificacion){
        System.out.println(inventario.filtrarXUnidadesYEspecificaciones(cantUnidades, nombreEspecificacion, valorEspecificacion));
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", inventario=" + inventario +
                '}';
    }
}
