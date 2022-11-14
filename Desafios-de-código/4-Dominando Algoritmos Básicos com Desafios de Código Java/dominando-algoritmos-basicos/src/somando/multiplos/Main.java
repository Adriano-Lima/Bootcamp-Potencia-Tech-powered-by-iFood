package somando.multiplos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int A, N, soma = 0;
        //exemplo: 5 + 10+ 15 +20 = 50

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for(int i=A; i<=N; i+=A){ // percorrendo os multiplos de A, ate chegar no valor igual a N
            soma +=i;
        }
        System.out.println(soma);
    }
}
