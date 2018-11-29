package org.ieszaidinvergeles.dam.chaterbot;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Item {
    private String id;
    private String nombre;
    private String mensaje;

    public Item(String id, String nombre, String mensaje) {
        this.id = id;
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("nombre", nombre);
        result.put("mensaje", mensaje);
        return result;
    }
}