package Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = input.nextLine();
        System.out.println("A letar (a) aparece " + Verificar.percorrer(texto) + " vezes no texto");
    }
}
