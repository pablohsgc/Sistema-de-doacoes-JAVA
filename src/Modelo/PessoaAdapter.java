package Modelo;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/**
 * Classe utilizada para gerar que o json consiga salvar e ler classe de herança.
 */
public class PessoaAdapter implements JsonSerializer<Pessoa>, JsonDeserializer<Pessoa>{
    private static final String CLASSNAME = "CLASSNAME";
    private static final String INSTANCE = "INSTANCE";
            
    @Override
    public JsonElement serialize(Pessoa t, Type type, JsonSerializationContext jsc) {
        JsonObject retValue = new JsonObject();
        String className = t.getClass().getName();
        retValue.addProperty(CLASSNAME, className);
        JsonElement elem = jsc.serialize(t); 
        retValue.add(INSTANCE, elem);
        return retValue;
    }

    @Override
    public Pessoa deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonPrimitive prim = (JsonPrimitive) jsonObject.get(CLASSNAME);
        String className = prim.getAsString();

        Class<?> klass = null;
        try {
            klass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new JsonParseException(e.getMessage());
        }
        return jdc.deserialize(jsonObject.get(INSTANCE), klass);
    }
    
}
