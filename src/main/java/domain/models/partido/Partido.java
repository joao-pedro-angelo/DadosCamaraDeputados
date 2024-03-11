package domain.models.partido;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Partido(
        @JsonAlias("id")
        Long id,
        @JsonAlias("sigla")
        String sigla,
        @JsonAlias("nome")
        String nome
)
{
        @Override
        public String toString() {
                return "ID: " + id + "\n" +
                        "Sigla: " + sigla + "\n" +
                        "Nome: " + nome + "\n";
        }
}
