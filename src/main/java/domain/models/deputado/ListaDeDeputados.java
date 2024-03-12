package domain.models.deputado;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ListaDeDeputados(
        @JsonAlias("dados")
        List<Deputado> deputados) {
}
