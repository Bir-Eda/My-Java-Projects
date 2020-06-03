package udemy;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number :");
        int factoriel=1;
        int num=scan.nextInt();
        for(int i=1; i<=num; i++){
            factoriel*=i;
            System.out.println("Factoriel = "+factoriel+", "+"i ="+i);
        }
        System.out.println("Factoriel = "+factoriel);
    }
}
