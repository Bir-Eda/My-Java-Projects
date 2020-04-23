package fourthloopspackage;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int num = 20;
        System.out.println("Guess the number:");
        int guess = myScan.nextInt();

        if(guess==num) {
            System.out.println("Bravo");
        }
        else if(guess>num) {
            System.out.println("larger");
        }
        else if(guess>num){
            System.out.println("smaller");


        }

    }
}
//Basically the major differences between for and while: for loop
// is used when we know the number of iterations we have to perform
// while is used when you are not sure about the iterations if  you
// know what the condition is
