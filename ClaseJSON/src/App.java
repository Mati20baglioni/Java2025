import manejoJSON.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {
        JSONArray jPersonas = new JSONArray();

        JSONObject jPersona = new JSONObject();

        try {
            jPersona.put("nombre","Juan");
            jPersona.put("edad",22);
            jPersona.put("dni",2314312);

            JSONObject jDireccion = new JSONObject();
            jDireccion.put("calle","Av. calle1");
            jDireccion.put("numero",2123);

            jPersona.put("direccion",jDireccion);

            JSONArray jNumeros = new JSONArray();

            JSONObject jNumero1 = new JSONObject();
            jNumero1.put("compania","Movistar");
            jNumero1.put("numero",2232543313L);

            jNumeros.put(jNumero1);

            JSONObject jNumero2 = new JSONObject();
            jNumero2.put("compania","Claro");
            jNumero2.put("numero",2236523127L);

            jNumeros.put(jNumero2);

            jPersona.put("numeros",jNumeros);

            jPersonas.put(jPersona);

            JSONUtiles.grabar(jPersonas);

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }
}
