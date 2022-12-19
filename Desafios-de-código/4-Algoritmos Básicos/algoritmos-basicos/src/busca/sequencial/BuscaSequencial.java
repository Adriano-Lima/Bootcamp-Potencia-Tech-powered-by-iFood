package busca.sequencial;

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int numeroBuscado = leitor.nextInt();
        System.out.println(encontrar(numeroBuscado, elementos));
    }

    static String encontrar(int numero, int [] array){
        for(int i=0; i<array.length; i++){ //percorrendo o array
            if(numero == array[i]){
                return "Achei "+ numero + " na posicao "+i;
            }
        }
        return "Numero " + numero + " nao encontrado!";
    }
}
