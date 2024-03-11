package domain.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Deputado(
        @JsonAlias("id")
        Long id,
        @JsonAlias("nome")
        String nome,
        @JsonAlias("siglaPartido")
        String partido,
        @JsonAlias("siglaUf")
        String uf,
        @JsonAlias("email")
        String email
)
{
        @Override
        public String toString() {
                return "ID: " + id + "\n" +
                        "Nome: " + nome + "\n" +
                        "Partido: " + partido + "\n" +
                        "UF: " + uf + "\n" +
                        "Email: " + email + "\n";
        }
}
