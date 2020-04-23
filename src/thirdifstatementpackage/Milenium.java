package thirdifstatementpackage;

import java.util.Scanner;

public class Milenium {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Please enter a year: ");
        int year = myScanner.nextInt();
        if(year>=2000){
            System.out.println("After milenium");
        }
        else {
            System.out.println("Before milenium");
        }
    }
}
