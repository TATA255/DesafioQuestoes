package Questao2;

public class Verificar {
    public static int percorrer(String texto){
        int quantidade = 0;
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }
}
