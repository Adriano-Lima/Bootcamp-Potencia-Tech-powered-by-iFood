package numeros.iguais;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        int A, B;
        Scanner leitor = new Scanner(System.in); //instanciando um leitor

        A = leitor.nextInt(); //fazendo a leitura da primeira entrada e atribuindo a variavel local
        B = leitor.nextInt(); //fazendo a leitura da segunda entrada e atribuindo a variavel local

        String teste = (A == B)? "Sao iguais!": "Nao sao iguais!";
        System.out.println(teste);
    }
}
