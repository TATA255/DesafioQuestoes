package Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = Integer.parseInt(input.nextLine());
        String mensagem = "";
        if(TesteFibonacci.isFibonacci(numero)){
            mensagem = "esse numero (" +numero+ ") pertence a sequencia de Fibonacci";
        }else{
            mensagem = "esse numero (" +numero+ ") não pertence a sequencia de Fibonacci";
        }
        System.out.println(mensagem);

    }
}
