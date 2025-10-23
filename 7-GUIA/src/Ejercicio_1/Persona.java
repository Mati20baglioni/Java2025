package Ejercicio_1;

import ManejoJSON.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;

    /// CONSTRUCTOR.
    public Persona(String nombre, int edad, String dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    public Persona() {
    }
    /// GETTERS Y SETTERS.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    /// METODOS.
    public JSONObject toJson(){
        JSONObject object=new JSONObject();
        try {
            object.put("nombre",nombre);
            object.put("edad",edad);
            object.put("dni",dni);
            object.put("sexo", String.valueOf(sexo));
            return object;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }
    public static Persona fromJson(JSONObject obj) {
        try {
            String nombre = obj.getString("nombre");
            int edad = obj.getInt("edad");
            String dni = obj.getString("dni");
            char sexo = obj.getString("sexo").charAt(0);
            return new Persona(nombre, edad, dni, sexo);
        } catch (JSONException e) {
            throw new RuntimeException("Error al convertir JSON a Persona", e);
        }
    }

    /// TO STRING.
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}


