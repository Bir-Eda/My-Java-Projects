package thirdifstatementpackage;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me temprature:");
        int sayi = scanner.nextInt();

        if ( sayi <=20){
            System.out.println( " is winter ");

        }
        else if( sayi >20 && sayi< 41 ) {
            System.out.println("Is fall");
        }
        else if (sayi >40 && sayi <61) {
            System.out.println("is Spring");
        }
        else {
            System.out.println("Is summer");
        }




    }
}
