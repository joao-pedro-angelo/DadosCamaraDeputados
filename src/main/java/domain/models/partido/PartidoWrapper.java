package domain.models.partido;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartidoWrapper {

    @JsonAlias("dados")
    private List<Partido> partidos;

    public List<Partido> getPartidos() {
        return this.partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
}
