package Ejercicio_2;

import Ejercicio_1.Persona;
import ManejoJSON.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.List;

public class Gestora_Persona {

    public void guardarPersona(Persona p, String nombreArchivo) {

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(p.toJson());
        JSONUtiles.grabar(nombreArchivo, jsonArray);
        System.out.println("archivo guardado");
    }

    public List<Persona> leerPersonas(String nombreArchivo) {
        List<Persona> personas = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(JSONUtiles.leer(nombreArchivo));
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Persona p = Persona.fromJson(jsonObject);
                personas.add(p);
            }
        } catch (JSONException e) {
            throw new RuntimeException("Error al leer el archivo JSON", e);
        }
        return personas;
    }
}