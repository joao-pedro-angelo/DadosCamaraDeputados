package domain.models.deputado;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DetalharDeputado(
        @JsonAlias("dados")
        Deputado dados
) {
    @Override
    public String toString(){
        return dados.toString();
    }
}
