package validacao;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ehValido = validar(scanner.nextLine());
        System.out.println(ehValido);
    }

    public static boolean validar(String s) {
        if (s.isEmpty()) {
            return true;
        }
        char[] letras = s.toCharArray();
        boolean teste = true;
        for (int i = 0; i < letras.length - 1; i += 2) {
            teste = (letras[i] == '(' && letras[i + 1] == ')') || (letras[i] == '[' && letras[i + 1] == ']') || (letras[i] == '{' && letras[i + 1] == '}');
            if (!teste) {
                break;
            }
        }
        return teste;
    }
}
