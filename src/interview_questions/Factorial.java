package interview_questions;

public class Factorial {
    public static void main(String[] args) {

        factorial(6);
      //  System.out.println(fibonacci(3));

    }

    public static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        // System.out.println("Factorial of "+num+" is:  "+fact);

        System.out.println(num + " " + fact);
    }

    public static void f(int num) {
       int fact=1;
        for (int i = 1; i <num ; i++) {
            fact=fact*i;

        }
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }


    }
}





































