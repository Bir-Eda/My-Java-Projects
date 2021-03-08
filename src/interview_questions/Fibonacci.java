package interview_questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       // System.out.println(fibonacciS(15));
       // System.out.println(fib(12));

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num=scan.nextInt();

        for (int i = 1; i <=num ; i++) {
            System.out.println(i+" . fibonacci number : "+fib(i));

        }
        //for(int i=1; i<=5; i++){
            //System.out.println(i+" . fibonacci number : "+fibonacciS(i));
       // }
    }
//1 1 2 3 5 8 13 21 34 55 89  144  233 ...

    public static int fibonacciS(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibonacciS(n-1)+fibonacciS(n-2);

            // metodu kendi icinde ayni isimle cagirmak
        }

    }

    public static int fib(int num){
        if(num<=1){
            return num;
        }
        else{
            return fibonacciS(num-1)+fibonacciS(num-2);
        }
    }

}





















