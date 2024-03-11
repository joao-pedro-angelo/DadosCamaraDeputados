package main;

import services.DataConverter;
import services.RequestHTTP;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private static final DataConverter dataConverter = new DataConverter();


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
        System.out.println(json);
    }

    private static void exibePartidos(){
        String URI = "partidos";
        String json = RequestHTTP.doRequest(URI);
        System.out.println(json);
    }

    private static void finalizaAplicacao(){
        System.out.println("Finalizando aplicação...");
    }
}