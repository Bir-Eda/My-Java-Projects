package fifth_method_package;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        GuessNumber(19);
    }

    public static int GuessNumber(int number) {
        Scanner scanner= new Scanner(System.in);
        int firstGuess=scanner.nextInt();
        int number1=20;
        if (firstGuess> number1) {
            System.out.println("our guess is bigger than number ");
        } else if (firstGuess < number1) {
            System.out.println("your guess is smaller than number");
        } else {
            System.out.println("Good job");
        }
        return firstGuess;



    }
}
