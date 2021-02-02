package interview_questions;

import java.util.Scanner;

public class ReverseNumberSecond {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=scan.nextInt();
        reverseNumber(num);

    }
    public static void reverseNumber(int num){
        int store=0;
        while(num!=0){
            store = store*10 + num%10;
            num=num/10;
        }
        System.out.print("Reversed number is : " + store);

    }

}
