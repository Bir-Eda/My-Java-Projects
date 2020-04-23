package secondifstatementspackage;

import java.util.Scanner;

public class IfElseOdd {
    public static void main(String[] args) {
        System.out.println("Give me an int number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int number2 = number%2;
        if (number2==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("is even number");
        }

    }
}

