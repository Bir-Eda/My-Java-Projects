package thirdifstatementpackage;

import java.util.Scanner;

public class SwitchNumberToString {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number with text:");
        String number = myScan.nextLine();
        switch (number) {
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;

            default:
                System.out.println("Not ");
        }
    }
}
