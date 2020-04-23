package thirdifstatementpackage;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner myScan = new Scanner(System.in);
        int age = myScan.nextInt();

        String output = (age%2==0)? "even": "odd";
        System.out.println (output);

           /* if (age%2==0) {
                System.out.println("even");
            }
                else {
                  System.out.println("odd");
                } */



    }
}
