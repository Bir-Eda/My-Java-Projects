package interview_questions;

import java.util.Scanner;

public class LargestNumberSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter first number :");
        int number=scan.nextInt();
        System.out.print("enter second number :");
        int number1=scan.nextInt();
        System.out.print("enter third number :");
        int number2=scan.nextInt();

        //System.out.println("largest number is :"+ largestNum(number,number1,number2));
        System.out.println("largest number is :"+ largestNumberTernary(number,number1,number2));

    }
    public static int largestNum(int a, int b, int c){
        if (a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        return c;
    }

    public static int largestNumberTernary(int a, int b, int c){
        int largest= a>b?a:b;
        largest=c>largest?c:largest;
        return largest;
    }

}
