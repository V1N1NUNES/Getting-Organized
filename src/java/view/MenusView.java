package java.view;

import java.exeptions.EntradaInvalidaExeption;
import java.service.ValidationMenusService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenusView {
    public static void menuEntrada(Scanner r) {
        int opcao = 3;

        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("                      Menu principal                         ");
            System.out.println("1. Cadastrar nova conta de banco\n2. Resumo de gastos mensal\n3. Sair");

            //tratamento de entrada
            if(ValidationMenusService.validacaoDeEntrada(r, opcao)){

            }

            System.out.println("-------------------------------------------------------------");

        } while (opcao != 3);
    }

    public static void menuCadastroContaBancaria(Scanner r) {


            System.out.println("-------------------------------------------------------------");
            System.out.println("               Menu de Cadastro de Contas                    ");
            System.out.println("1. Cadastrar nova conta bancária\n2. Voltar");
            System.out.println("-------------------------------------------------------------");
    }

    public static void menuSaida() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("                        Menu Saída                           ");
        System.out.println("Até logo! :)");

        //adicioinar algo para o encerramento do programa
        System.out.println("-------------------------------------------------------------");


    }
}
