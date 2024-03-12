package domain.models.votacoes;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Votacao(
        @JsonAlias("data")
        String data,
        @JsonAlias("descricao")
        String descricao
)
{
    @Override
    public String toString() {
        return "Data: " + data + "\n" +
                "Descrição: " + descricao + "\n";
    }
}
