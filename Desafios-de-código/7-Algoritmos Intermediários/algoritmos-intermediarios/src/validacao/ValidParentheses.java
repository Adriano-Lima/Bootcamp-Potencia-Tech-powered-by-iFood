package validacao;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        if (s.isEmpty()) {
            return true;
        }
        char[] letras = s.toCharArray();
        boolean teste;
        for (int i = 0; i < letras.length - 1; i = i + 2) {
            if (letras[i] == '(' || letras[i] == ')') {
                teste = letras[i] == '(' && letras[i + 1] == ')';
                if (!teste) return false;
            } else if (letras[i] == '[' || letras[i] == ']') {
                teste = letras[i] == '[' && letras[i + 1] == ']';
                if (!teste) return false;
            } else if (letras[i] == '{' || letras[i] == '}') {
                teste = letras[i] == '{' && letras[i + 1] == '}';
                if (!teste) return false;
            } else{
                return false;
            }
        }
        return true;
    }

}
