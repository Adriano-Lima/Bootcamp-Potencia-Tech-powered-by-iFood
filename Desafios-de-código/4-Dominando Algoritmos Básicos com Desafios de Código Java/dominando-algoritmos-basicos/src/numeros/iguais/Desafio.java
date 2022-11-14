package numeros.iguais;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        int A, B;
        Scanner leitor = new Scanner(System.in); //instanciando um leitor

        A = leitor.nextInt(); //fazendo a leitura da primeira entrada e atribuindo a variavel local
        B = leitor.nextInt(); //fazendo a leitura da segunda entrada e atribuindo a variavel local

        if(A == B) // comparando se os valores sao iguais
            System.out.println("Sao iguais!");
        else
            System.out.println("Nao sao iguais!");
    }
}
