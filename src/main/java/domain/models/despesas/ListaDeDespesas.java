package domain.models.despesas;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ListaDeDespesas(
        @JsonAlias("dados")
        List<Despesa> despesas
) {
    @Override
    public String toString(){
        return despesas.toString();
    }
}

