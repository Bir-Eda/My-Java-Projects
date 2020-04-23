package fourthloopspackage;

import java.util.Scanner;

public class WhileLoopYes {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        String answer ="";
        while(!answer.equalsIgnoreCase("y")){
            System.out.println("Java is fun(y/n)");
            answer = myScan.next();
        }
        System.out.println("I knew you like Java");

    }
}
