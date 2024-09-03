package Questao1;

public class TesteFibonacci {
    public static boolean isFibonacci(int numero){
        Boolean retorno = false;
        if(numero < 0){
            retorno = false;
        }
        int a = 0, b = 1;
        while(a <= numero){
            if(a == numero){
                retorno = true;
            }
            int temporario = a + b;
            a = b;
            b = temporario;
        }
        return retorno;
    }
}
