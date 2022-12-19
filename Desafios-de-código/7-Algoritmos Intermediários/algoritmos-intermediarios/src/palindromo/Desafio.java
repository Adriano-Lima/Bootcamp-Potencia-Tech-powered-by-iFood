package palindromo;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        System.out.println(ePalindromo(palavra));
    }

    private static String ePalindromo(String palavra) {
        int ultimaPosicao = palavra.length() - 1;
        char[] letras = palavra.toLowerCase().toCharArray();
        int comparar = 0;
        String resposta = "TRUE";
        /*
            começasse comparando a ultima letra com a primeira
            se forem iguais vai se avancando, "i" do ultimo para o primeiro, e "comprar" do primeiro para o ultimo
            caso nao sejam iguais, entao nao se trata de um palindromo
            avancasse ate a metada da palavra, quando "i" e "comparar" sao iguais, pois as demais posicoes ja foram comparadas anteriormente
         */
        for (int i = ultimaPosicao; i >= comparar; i--) {
            if (letras[i] == letras[comparar]) {
                comparar++;
            } else {
                resposta = "FALSE";
                break;
            }
        }
        return resposta;
    }

}


