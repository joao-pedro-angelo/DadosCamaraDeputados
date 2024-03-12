package domain.models.despesas;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Despesa(
        @JsonAlias("ano")
        String ano,
        @JsonAlias("tipoDespesa")
        String tipo,
        @JsonAlias("tipoDocumento")
        String documento,
        @JsonAlias("valorDocumento")
        Double valor,
        @JsonAlias("nomeFornecedor")
        String fornecedor
)
{
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Despesa{\n");
        if (ano != null) sb.append("  Ano: ").append(ano).append("\n");
        if (tipo != null) sb.append("  Tipo de Despesa: ").append(tipo).append("\n");
        if (documento != null) sb.append("  Tipo de Documento: ").append(documento).append("\n");
        if (valor != null) sb.append("  Valor do Documento: ").append(valor).append("\n");
        if (fornecedor != null) sb.append("  Nome do Fornecedor: ").append(fornecedor);
        sb.append("}");
        return sb.toString();
    }
}
