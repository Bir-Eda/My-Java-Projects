package fourthloopspackage;

import java.util.Scanner;

public class FindBugs {
    public static void main(String[] args) {
        //firt time asking to user
        Scanner myScan = new Scanner(System.in);
        int numberGuess = 23;
        int userGuess = 0;
        while(userGuess!=numberGuess){
            System.out.println("Guess the number");
            userGuess = myScan.nextInt();
            if(userGuess>numberGuess){
                System.out.println("Number is Larger");
            }
            else if(userGuess<numberGuess){
                System.out.println("Number is smaller");
            }
            else{
                System.out.println("Congrats...");
            }
        }

    }
}
