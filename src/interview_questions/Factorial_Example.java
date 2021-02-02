package interview_questions;

import java.util.Scanner;

public class Factorial_Example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scan.nextInt();
        System.out.println(n+ "! : "+factorial(n));
    }
    public static int factorial(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact=fact*i;

        }
        return fact;

    }
}
