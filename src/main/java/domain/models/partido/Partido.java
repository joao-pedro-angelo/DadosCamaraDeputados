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
        String nome,
        @JsonAlias("status")
        StatusPartido statusPartido
)
{
        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Partido{\n");
                if (id != null) sb.append("  ID: ").append(id).append("\n");
                if (sigla != null) sb.append("  Sigla: ").append(sigla).append("\n");
                if (nome != null) sb.append("  Nome: ").append(nome).append("\n");
                if (statusPartido != null) sb.append("  Status do Partido:\n").append(statusPartido);
                sb.append("}");
                return sb.toString();
        }
}
