package thirdifstatementpackage;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println(" Please enter your grade");
        double point = myScan.nextDouble();
        if (point >= 0 && point <= 49) {
            System.out.println("Your grade : Fail");
        } else if (point >= 50 && point <= 59) {
            System.out.println("Your grade : D");

        } else if (point >= 60 && point <= 69) {
            System.out.println("Your grade : C");
        } else if (point >= 70 && point <= 79) {
            System.out.println("Your grade : B");
        } else if (point >= 80 && point <= 89) {
            System.out.println("Your grade : A");
        } else if (point >= 90 && point <= 100) {
            System.out.println("Your grade : A+");
        } else {
            System.out.println("Invalid");
        }
    }
}
