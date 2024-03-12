package domain.models.eventos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Evento(
        @JsonAlias("dataHoraInicio")
        String inicio,
        @JsonAlias("dataHoraFim")
        String fim,
        @JsonAlias("situacao")
        String status,
        @JsonAlias("descricao")
        String descricao
) {
    @Override
    public String toString() {
        return "Data/Hora de Início: " + inicio + "\n" +
                "Data/Hora de Fim: " + fim + "\n" +
                "Situação: " + status + "\n" +
                "Descrição: " + descricao + "\n";
    }
}
