package domain.models.deputado;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeputadoWrapper {

    @JsonAlias("dados")
    private List<Deputado> deputados;

    public List<Deputado> getDeputados(){
        return this.deputados;
    }

    public void setDeputados(List<Deputado> deputados){
        this.deputados = deputados;
    }

}
