package interview_questions;

import java.util.Scanner;

public class Fibonacci_Example {
    public static void main(String[] args) {
      //  System.out.println(fibonacci(10));
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number=scan.nextInt();

        for(int i=1; i<=number; i++){

            System.out.print(" "+ fibonacci(i));
        }

    }
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        return fibonacci(num-1)+ fibonacci(num-2);
    }
}
