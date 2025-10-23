package manejoJSON;

import clases.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GestionJSON {

    public static Tienda mapeoTienda(){
        Tienda t = new Tienda();
        Inventario<ProductoElectronico> productos = new Inventario<>();
        try {
            JSONObject json = new JSONObject(JsonUtiles.leer("tienda.json"));
            JSONObject jTienda = json.getJSONObject("tienda");

            t.setNombre(jTienda.getString("nombre"));
            t.setUbicacion(jTienda.getString("ubicacion"));

            JSONArray jProductos = jTienda.getJSONArray("productos");
            productos.setLista(mapeoProductos(jProductos));

            t.setInventario(productos);

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return t;
    }

    public static List<ProductoElectronico> mapeoProductos(JSONArray jProductos){

        List<ProductoElectronico> productos = new ArrayList<>();

        for (int i=0 ; i<jProductos.length();i++){
            try {
                JSONObject jProducto = jProductos.getJSONObject(i);

                if (jProducto.getString("tipo").equals("DispositivoMovil")){
                    ProductoElectronico d = new DispositivoMovil();
                    d=mapeoProducto(jProducto,d);
                    productos.add(d);
                } else if (jProducto.getString("tipo").equals("Portatil")) {
                    ProductoElectronico p = new Portatil();
                    p=mapeoProducto(jProducto,p);
                    productos.add(p);
                }else{
                    ProductoElectronico a = new Accesorio();
                    a=mapeoProducto(jProducto,a);
                    productos.add(a);
                }

            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        return productos;
    }

    public static ProductoElectronico mapeoProducto(JSONObject jProducto, ProductoElectronico producto){

        try {
            producto.setTipo(jProducto.getString("tipo"));
            producto.setNombre(jProducto.getString("nombre"));
            producto.setMarca(jProducto.getString("marca"));
            producto.setPrecio(jProducto.getDouble("precio"));
            producto.setCantidadDisponible(jProducto.getInt("cantidadDisponible"));
            producto.setSeccionTienda(jProducto.getString("seccionTienda"));

            JSONArray jEspecificaciones = jProducto.getJSONArray("especificaciones");
            List<Especificacion> especificaciones = new ArrayList<>();

            for (int i = 0; i < jEspecificaciones.length(); i++) {
                JSONObject jEspecificacion = jEspecificaciones.getJSONObject(i);
                Especificacion e = new Especificacion();
                e.setNombre(jEspecificacion.getString("nombre"));
                e.setValor(jEspecificacion.getString("valor"));
                especificaciones.add(e);
            }
            producto.setEspecificaciones(especificaciones);


            JSONArray jEmbalajes = jProducto.getJSONArray("embalajesDisponibles");
            List<Embalaje> embalajes = new ArrayList<>();

            for (int i = 0; i < jEmbalajes.length(); i++) {
                JSONObject jEmbalaje = jEmbalajes.getJSONObject(i);
                Embalaje e = new Embalaje();
                e.setTipo(jEmbalaje.getString("tipo"));
                e.setResistencia(jEmbalaje.getString("resistencia"));
                e.setDimensiones(jEmbalaje.getString("dimensiones"));
                embalajes.add(e);
            }
            producto.setEmbalajesDisponibles(embalajes);

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return producto;
    }

}
