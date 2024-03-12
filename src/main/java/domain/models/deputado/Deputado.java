package domain.models.deputado;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Deputado(
        @JsonAlias("id")
        Long id,
        @JsonAlias({"nome", "nomeCivil"})
        String nome,
        @JsonAlias("siglaPartido")
        String partido,
        @JsonAlias("siglaUf")
        String uf,
        @JsonAlias("email")
        String email,
        @JsonAlias("ultimoStatus")
        UltimoStatus ultimoStatus,
        @JsonAlias("redeSocial")
        List<String> redesSociais
)
{
        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Deputado{\n");
                if (id != null) sb.append("  ID: ").append(id).append("\n");
                if (nome != null) sb.append("  Nome: ").append(nome).append("\n");
                if (partido != null) sb.append("  Partido: ").append(partido).append("\n");
                if (uf != null) sb.append("  UF: ").append(uf).append("\n");
                if (email != null) sb.append("  Email: ").append(email).append("\n");
                if (redesSociais != null) sb.append("  Redes sociais: ").append(redesSociais).append("\n");
                if (ultimoStatus != null) sb.append("  Status:\n").append(ultimoStatus).append("\n");
                sb.append("}");
                return sb.toString();
        }
}
