package java.service;

import java.exeptions.EntradaInvalidaExeption;
import java.util.Scanner;

public abstract class ValidationMenusService {

    public static boolean validacaoDeEntrada(Scanner r, int option){
        try{
            option = r.nextInt();
        }catch(EntradaInvalidaExeption e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Por favor, tente novamente");
        }
    }
}
