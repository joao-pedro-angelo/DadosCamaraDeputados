package domain.models.partido;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import domain.models.deputado.Deputado;

@JsonIgnoreProperties(ignoreUnknown = true)
public record StatusPartido(
        @JsonAlias("situacao")
        String situacao,
        @JsonAlias("totalPosse")
        String totalPosse,
        @JsonAlias("lider")
        Deputado deputado
) {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatusPartido{\n");
        if (situacao != null) sb.append("  Situação: ").append(situacao).append("\n");
        if (totalPosse != null) sb.append("  Total Posse: ").append(totalPosse).append("\n");
        if (deputado != null) sb.append("  Líder: ").append(deputado);
        sb.append("}");
        return sb.toString();
    }
}
