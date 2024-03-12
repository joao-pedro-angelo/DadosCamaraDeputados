import domain.models.deputado.DetalharDeputado;
import domain.models.deputado.ListaDeDeputados;
import domain.models.deputado.Deputado;
import domain.models.despesas.ListaDeDespesas;
import domain.models.eventos.Evento;
import domain.models.eventos.ListaDeEventos;
import domain.models.partido.DetalharPartido;
import domain.models.partido.ListaDePartidos;
import domain.models.partido.Partido;
import domain.models.votacoes.ListaDeVotacoes;
import domain.models.votacoes.Votacao;
import menu.Menu;
import services.Desserializar;
import services.RequestHTTP;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private static final Desserializar DESSERIALIZAR = new Desserializar();


    public static void main(String[] args) {
        int opcao = Menu.menu(scanner);
        while (opcao != 8){
            switch (opcao){
                case 1:
                    exibeDeputados();
                    break;
                case 2:
                    exibePartidos();
                    break;
                case 3:
                    exibeEventos();
                    break;
                case 4:
                    exibeVotacoes();
                    break;
                case 5:
                    deputadoEspecifico();
                    break;
                case 6:
                    despesasDeputado();
                    break;
                case 7:
                    partidoEspecifico();
                    break;
            }
            opcao = Menu.menu(scanner);
        }
        finalizaAplicacao();
    }

    private static void exibeDeputados(){
        String URI = "deputados";
        String json = RequestHTTP.doRequest(URI);
        ListaDeDeputados deputadosList = DESSERIALIZAR.dataConverter(json, ListaDeDeputados.class);

        List<Deputado> deputados = deputadosList.deputados();
        deputados.forEach(System.out::println);
    }

    private static void exibePartidos(){
        String URI = "partidos";
        String json = RequestHTTP.doRequest(URI);
        ListaDePartidos partidosList = DESSERIALIZAR.dataConverter(json, ListaDePartidos.class);

        List<Partido> partidos = partidosList.partidos();
        partidos.forEach(System.out::println);
    }

    private static void exibeEventos(){
        String URI = "eventos";
        String json = RequestHTTP.doRequest(URI);
        ListaDeEventos eventosList = DESSERIALIZAR.dataConverter(json, ListaDeEventos.class);

        List<Evento> eventos = eventosList.eventos();
        eventos.forEach(System.out::println);
    }

    private static void exibeVotacoes(){
        String URI = "votacoes";
        String json = RequestHTTP.doRequest(URI);
        ListaDeVotacoes votacoesList = DESSERIALIZAR.dataConverter(json, ListaDeVotacoes.class);

        List<Votacao> votacoes = votacoesList.votacaos();
        votacoes.forEach(System.out::println);
    }

    private static void deputadoEspecifico(){
        System.out.println("Digite o ID do deputado: ");
        int id = Integer.parseInt(scanner.nextLine());
        String json = RequestHTTP.doRequest("deputados/" + id);

        DetalharDeputado deputado = DESSERIALIZAR.dataConverter(json, DetalharDeputado.class);
        System.out.println(deputado);
    }

    private static void partidoEspecifico(){
        System.out.println("Digite o ID do partido: ");
        int id = Integer.parseInt(scanner.nextLine());
        String json = RequestHTTP.doRequest("partidos/" + id);

        DetalharPartido partido = DESSERIALIZAR.dataConverter(json, DetalharPartido.class);
        System.out.println(partido);
    }

    private static void despesasDeputado(){
        System.out.println("Digite o ID do deputado: ");
        int id = Integer.parseInt(scanner.nextLine());
        String json = RequestHTTP.doRequest("deputados/" + id + "/despesas");

        ListaDeDespesas despesas = DESSERIALIZAR.dataConverter(json, ListaDeDespesas.class);
        System.out.println(despesas);
    }

    private static void finalizaAplicacao(){
        System.out.println("Finalizando aplicação...");
    }
}