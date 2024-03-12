package domain.models.votacoes;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ListaDeVotacoes(
        @JsonAlias("dados")
        List<Votacao> votacaos
)
{}
