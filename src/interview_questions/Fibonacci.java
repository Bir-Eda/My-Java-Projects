package interview_questions;

public class Fibonacci {
    public static void main(String[] args) {
       // System.out.println(fibonacciS(10));
        for(int i=1; i<=5; i++){
            System.out.println(i+" . fibonacci number : "+fibonacciS(i));
        }
    }
//1 1 2 3 5 8 13 ...

    public static int fibonacciS(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibonacciS(n-1)+fibonacciS(n-2);

            // metodu kendi icinde ayni isimle cagirmak
        }
    }
}
