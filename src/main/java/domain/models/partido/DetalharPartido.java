package domain.models.partido;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DetalharPartido(
        @JsonAlias("dados")
        Partido partido
) {
    @Override
    public String toString(){
        return partido.toString();
    }
}
