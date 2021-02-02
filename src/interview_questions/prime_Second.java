package interview_questions;

import java.util.Scanner;

public class prime_Second {
    public static void main(String[] args) {
        System.out.println(prime(21));
//        for(int i=1; i<=100; i++){
//            System.out.println(i+" : "+prime(i));
//        }

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scan.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i+" : "+prime(i));
        }
    }
    // prime asal sayilarla ilgili
    public static boolean prime(int num){
        if(num<=1) {
            return false;
        }
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    return false;
                }
            }
        return true;
    }
}
















