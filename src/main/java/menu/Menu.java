package menu;

import java.util.Scanner;

public class Menu {

    public static int menu(Scanner scanner){
        System.out.println("""
                Dados - Câmara dos Deputados
                ---
                Escolha uma opção:
                1- Visualizar deputados
                2- Visualizar partidos
                3- Visualizar eventos da Câmara
                4- Visualizar votações
                5- Exibir deputado específico
                6- Despesas de um deputado
                7- Exibir partido específico
                8- Sair
                """);
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Entrada inválida...");
            return 8;
        }
    }

}
