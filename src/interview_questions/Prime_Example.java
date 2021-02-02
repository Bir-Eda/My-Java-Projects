package interview_questions;

import java.util.Scanner;

public class Prime_Example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=scan.nextInt();
        System.out.println("The number is "+isPrime(number));
        for(int i=1; i<number; i++){
            System.out.println(i+" : "+isPrime(i));
        }


    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    return false;
                }
        }
        return true;


    }
    // en kucuk asal sayi 2 dir
    //  ornegin 72 sayisi hangi sayinin karekokudur.
    // yaklasik 8.2 gibi bir deger
    // 8 den kucuk asal sayilar nelerdir   2, 3, 5, 7
    // bu sayilardan 2 ve 3 e bolundugu icin bu sayi asal sayi degildir.
}
