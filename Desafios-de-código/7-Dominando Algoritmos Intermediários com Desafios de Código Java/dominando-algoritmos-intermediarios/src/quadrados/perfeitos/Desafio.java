package quadrados.perfeitos;

import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(new Scanner(System.in).nextLine());
            List<Integer> quantidades = new ArrayList<>();
            List<Integer> quadradosPerfeitos = gerarQuadradosPerfeitos(n);
            //salvando a quantidade de um unico quadrado perfeito ser igual ao valor de n
            for (Integer quadrado : quadradosPerfeitos) {
                if (n % quadrado == 0)
                    quantidades.add(n / quadrado);
            }
            if (quadradosPerfeitos.contains(n)) { // se n eh um quadradosPerfeito logo a quantidade sera 1
                System.out.println(1);
            } else {
                quantidades.add(calcularQuantidades(n));
                System.out.println(acharMenorQuantidade(quantidades));
            }
        } catch (NumberFormatException e) {
            System.out.println("Deve-se digitar um número");
        }
    }

    private static Integer calcularQuantidades(Integer n) {
        int tmp = n;
        int cont = 0;
        while (tmp > 0) {
            List<Integer> quadrados = gerarQuadradosPerfeitos(tmp);
            tmp -= quadrados.get(quadrados.size() - 1);
            cont++;
        }
        return cont;
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
