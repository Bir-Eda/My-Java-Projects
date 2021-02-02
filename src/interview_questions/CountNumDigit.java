package interview_questions;

import java.util.Scanner;

public class CountNumDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        System.out.print("number of digits : " +countDigit(number));

        System.out.print("\nsumOfNumberDigit :" +sumDigit(+number));

    }
        public static int countDigit(int num){
            int count=0;
            while(num!=0){
                num=num/10;
                count++;
            }
            return count;

        }
        //  num/ = 10
        //  num=num/10

    public static int sumDigit(int num){   //  123456   butun sayilari birbiriyle toplar
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num=num/10;

        }
        return sum;
    }



    }

