package thirdifstatementpackage;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a year : ");
        double year = myScan.nextDouble();
        if (year % 4 == 0 && year % 400 == 0 && (!(year % 100 == 0))) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
    }
}
