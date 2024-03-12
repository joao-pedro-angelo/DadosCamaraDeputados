package domain.models.deputado;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UltimoStatus(
        @JsonAlias("nome")
        String nome,
        @JsonAlias("siglaPartido")
        String partido,
        @JsonAlias("condicaoEleitoral")
        String condicaoEleitoral,
        @JsonAlias("descricaoStatus")
        String descricao
) {
}
