package matrizes;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int [] nums = new int[N];
        for (i = 0; i < N; i++)        {
            nums[i] = input.nextInt();
        }
        int j = 0;
        for (i = 0; i < nums.length; i++) { // se o numero for par
            if ( nums[i] %2==0 ) {
                //int temp = nums[j]; nums[j] = nums[i]; nums[i] = temp;
                //faz a troca de posicao entre o valor par com um impar
                //nums[j] = nums[i] faz n[j] receber o valor par, depois leva o valor impar para nums[i]
                nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);
                j++;
            }
        }

        for (var entry : nums) {
            System.out.println(entry);
        }
    }
}
