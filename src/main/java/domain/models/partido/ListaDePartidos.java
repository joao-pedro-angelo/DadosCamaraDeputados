package domain.models.partido;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ListaDePartidos(
        @JsonAlias("dados")
        List<Partido> partidos) {
}
