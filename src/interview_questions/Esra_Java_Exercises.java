package interview_questions;

public class Esra_Java_Exercises {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(fibonacci(15));
        System.out.println(fibonacciFactoriel(5));
    }
    public static int factorial(int number){
        int num=1; // 1 ile carptigimiz sayi yine kendisini verecegi icin 1 diyoruz
        for(int i=1; i<=number; i++){  // i`yi 1 den baslatiyoruz
            num=num*i; //

        }
        return num;
    }
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
        // metodun icinde metodu cagirmaya rekorsive denir

    }

    public static int fibonacciFactoriel(int number) {
        if (number == 1)
            return 1;

            return number * fibonacciFactoriel(number - 1);

        // metodun icinde metodu cagirmaya rekorsive denir

    }

    public static long fact(long number){
        if (number==1) return 1;
        return number * fact(number-1);
    }
    public static long power(long number , int power){
        return (power!=1) ? number * power(number,power-1) : number;
    }
}

