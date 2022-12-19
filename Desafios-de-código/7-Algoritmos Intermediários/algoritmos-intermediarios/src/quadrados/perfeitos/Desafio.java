package quadrados.perfeitos;

import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println(calcularMenorQuantidade(n));
        } catch (NumberFormatException e) {
            System.out.println("Deve-se digitar um número");
        }
    }

    private static Integer calcularMenorQuantidade(Integer n) {
        List<Integer> quadradosPerfeitos = gerarQuadradosPerfeitos(n);
        if(quadradosPerfeitos.contains(n)){ //se n for um quadrado perfeito
            return 1;
        }
        List<Integer> quantidades = new ArrayList<>();
        //salvando a quantidade de um unico quadrado perfeito ser igual ao valor de n
        for (Integer quadrado : quadradosPerfeitos) {
            if (n % quadrado == 0)
                quantidades.add(n / quadrado);
        }
        //contando quantos quadrados perfeitos preciso para chegar em n, exemplo 12 = 9+1+1+1
        int tmp = n;
        int cont = 0;
        while (tmp > 0) {
            List<Integer> quadrados = gerarQuadradosPerfeitos(tmp);
            tmp -= quadrados.get(quadrados.size() - 1);
            cont++;
        }
        quantidades.add(cont);
        return acharMenorQuantidade(quantidades);
    }

    private static List<Integer> gerarQuadradosPerfeitos(int n) {
        List<Integer> quadradosPerfeitos = new ArrayList<>();
        int contador = 1;
        for (int i = 1; i <= n; i = contador * contador) {
            quadradosPerfeitos.add(i);
            contador++;
        }
        return quadradosPerfeitos;
    }

    private static int acharMenorQuantidade(List<Integer> quantidades) {
        Collections.sort(quantidades);
        return quantidades.get(0);
    }
}
