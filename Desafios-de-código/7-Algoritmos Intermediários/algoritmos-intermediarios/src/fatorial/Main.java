package fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int tmp = n;
        n--;
        while (n > 0) {
            tmp *= n;
            n--;
            if (n != 0) {
                tmp /= n;
                n--;
            }
            tmp += n;
            n--;
            res += tmp;
            tmp = -n;
            n--;
        }
        System.out.println(res);
    }
}
