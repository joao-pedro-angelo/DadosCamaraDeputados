package main;

import domain.models.partido.PartidoWrapper;
import domain.models.deputado.Deputado;
import domain.models.deputado.DeputadoWrapper;
import domain.models.partido.Partido;
import services.Desserializar;
import services.RequestHTTP;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private static final Desserializar DESSERIALIZAR = new Desserializar();


    public static void main(String[] args) {
        int opcao = Menu.menu(scanner);
        while (opcao != 3){
            switch (opcao){
                case 1:
                    exibeDeputados();
                    break;
                case 2:
                    exibePartidos();
                    break;
            }
            opcao = Menu.menu(scanner);
        }
        finalizaAplicacao();
    }

    private static void exibeDeputados(){
        String URI = "deputados";
        String json = RequestHTTP.doRequest(URI);
        DeputadoWrapper deputadosList = DESSERIALIZAR.dataConverter(json, DeputadoWrapper.class);

        List<Deputado> deputados = deputadosList.getDeputados();
        deputados.forEach(System.out::println);
    }

    private static void exibePartidos(){
        String URI = "partidos";
        String json = RequestHTTP.doRequest(URI);
        PartidoWrapper partidosList = DESSERIALIZAR.dataConverter(json, PartidoWrapper.class);

        List<Partido> partidos = partidosList.getPartidos();
        partidos.forEach(System.out::println);
    }

    private static void finalizaAplicacao(){
        System.out.println("Finalizando aplicação...");
    }
}