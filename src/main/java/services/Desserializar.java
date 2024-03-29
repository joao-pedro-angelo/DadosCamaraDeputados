package services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.interfaces.iDesserializar;

public class Desserializar implements iDesserializar {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T dataConverter(String json, Class<T> classe) {
        try{
            return this.mapper.readValue(json, classe);
        } catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }

}
