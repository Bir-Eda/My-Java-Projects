package fourthloopspackage;

import java.util.Scanner;

public class ClassGame {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int num = 109;
        int guess = 0;
        //first time asking to user
        while (guess!=num){
            System.out.println("guess a number");
            guess = myScan.nextInt();
            if(guess<num){
                System.out.println("larger");
            }
            else if (guess >num){
                System.out.println("smaller");
            }
            else{
                System.out.println("congrats");
            }

        }
    }
}
