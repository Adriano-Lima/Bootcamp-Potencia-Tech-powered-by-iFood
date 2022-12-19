package fizzbuzz;

import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if(num%3==0 && num%5==0){ // Se o número for um múltiplo de 3 e 5
            System.out.println("FizzBuzz");
        } else if(num%3==0){ //Se for apenas múltiplo de 3
            System.out.println("Fizz");
        } else if(num%5==0) { //Se for apenas múltiplo de 5
            System.out.println("Buzz");
        } else{ //Se o número não for um múltiplo de 3 ou 5
            System.out.println(num);
        }
    }
}
