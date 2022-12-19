package fatorial;

import java.util.*;

public class ConsoleApp1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(calcularFatorial(n));
    }

    private static Integer calcularFatorial(Integer n) {
        if (n <= 1)
            return 0;
        List<String> sequencia = calcularsSequencia(n);
        String[] operacoesAltaPrioridade = {"*", "/"};
        for (String op : operacoesAltaPrioridade) {
            sequencia = calcOperacoesAltaPrioridade(sequencia, op);
        }
        return calcOperacoesSecundarias(sequencia);
    }

    private static List<String> calcularsSequencia(Integer n) {
        int op = 1;
        List<String> list = new ArrayList<>();
        list.add(n.toString());
        n--;
        while (n > 0) {
            switch (op % 4) {
                case 1:
                    list.add("*");
                    list.add(n.toString());
                    break;
                case 2:
                    list.add("/");
                    list.add(n.toString());
                    break;
                case 3:
                    list.add("+");
                    list.add(n.toString());
                    break;
                case 0:
                    list.add("-");
                    list.add(n.toString());
                    break;
            }
            op++;
            n--;
        }
        return list;
    }

    private static List<String> calcOperacoesAltaPrioridade(List<String> sequencia, String operacao) {
        int i = 1;
        while (i < sequencia.size()) {
            if (sequencia.get(i).equals(operacao)) {
                Integer n1 = Integer.parseInt(sequencia.get(i - 1));
                Integer n2 = Integer.parseInt(sequencia.get(i + 1));
                Integer resultado = 0;
                if (operacao == "*")
                    resultado = n1 * n2;
                if (operacao == "/")
                    resultado = n1 / n2;
                sequencia.set(i, resultado.toString());
                sequencia.set(i - 1, "");
                sequencia.set(i + 1, "");
            }
            i = i + 2;
        }
        Iterator<String> iter = sequencia.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.equals("")) {
                iter.remove();
            }
        }
        return sequencia;
    }

    private static Integer calcOperacoesSecundarias(List<String> sequencia) {
        int i = 1;
        int resultado = Integer.parseInt(sequencia.get(0));
        while (i < sequencia.size()) {
            String operacao = sequencia.get(i);
            Integer n2 = Integer.parseInt(sequencia.get(i + 1));
            if (operacao == "+")
                resultado += n2;
            if (operacao == "-")
                resultado -= n2;
            i = i + 2;
        }
        return resultado;
    }

}

/* 
public class ConsoleApp1 {
    public static void main(String[] args) {
        try {
            int N = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println(calcularFatorialDesajeitado(N));
        } catch (NumberFormatException e){
            System.out.println("Deve-se digitar um número");
        }
    }

    private static Integer calcularFatorialDesajeitado(Integer N) {
        int soma = 0;
        int tmp = N;
        if (N <= 1) {
            return 0;
        }
        while (N > 0) {
            if (N > 1)
                N--;
            tmp *= N;
            N--;
            if (N > 0) {
                tmp /= N;
                N--;
                tmp += N;
            }
            soma += tmp;
            tmp = -(--N);
        }
        return soma;
    }
}

*/