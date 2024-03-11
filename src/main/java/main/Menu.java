package main;

import java.util.Scanner;

public class Menu {

    public static int menu(Scanner scanner){
        System.out.println("""
                Dados - Câmara dos Deputados
                ---
                Escolha uma opção:
                1- Visualizar deputados
                2- Visualizar partidos
                """);
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Entrada inválida...");
            return 3;
        }
    }

}
