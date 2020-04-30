package fifth_method_package;

import java.util.Scanner;

public class DenemeNumberGuess {
    public static void  guessTheNumber(int number) {
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        while (guess != number) {
            System.out.println("Guess the number: ");
            guess = scan.nextInt();
            if (guess == number) {
                System.out.println("Yes you fount it or congrat");
            } else if (guess < number) {
                System.out.println("smaller try again ");

            } else {
                System.out.println("larger Try again");
            }
        }
    }
    public static void main (String[]args){
        DenemeNumberGuess.guessTheNumber(25);
    }

}
