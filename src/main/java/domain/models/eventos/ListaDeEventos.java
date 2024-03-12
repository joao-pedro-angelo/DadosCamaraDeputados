package domain.models.eventos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ListaDeEventos(
        @JsonAlias("dados")
        List<Evento> eventos) {
}
