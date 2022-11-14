package quadrados.perfeitos;

import java.util.Scanner;

public class Main {
    public static int solution(int n){
        int [] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            int min = n;
            for(int base =1; base*base <=i; base++){
                int rem = i- base*base;
                if(dp[rem] < min)
                    min = dp[rem];
            }
            dp[i] = min +1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        while(true) {
            int n = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println(solution(n));
        }
    }

}
