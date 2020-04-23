package homeworkpackage;

import java.util.Scanner;

public class OneTwoWeightHeigthMile {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your weight, volume, distance");
        double weight = myScan.nextInt();
        double height = myScan.nextInt();
        double mile = myScan.nextInt();
        double price1;
        double price2;

        if (weight >= 1 && weight <= 5) {
            if (height >= 5 && height <= 10) {
                price1 = ((12 * 20) / 11) * mile / 100;
                price2 = ((12 * 20) / 5) * mile / 100;
            } else {
                price1 = ((12 * 45) / 11) * mile / 100;
                price2 = ((12 * 45) / 5) * mile / 100;
            }
        } else if (weight >= 6 && weight <= 12) {
            if (height >= 5 && height <= 10) {
                price1 = ((29 * 20) / 11) * mile / 100;
                price2 = ((29 * 20) / 5) * mile / 100;
            } else {
                price1 = ((29 * 45) / 11) * mile / 100;
                price2 = ((29 * 45) / 5) * mile / 100;
            }
        } else {
            if (height >= 5 && height <= 10) {
                price1 = ((50 * 20) / 11) * mile / 100;
                price2 = ((50 * 20) / 5) * mile / 100;
            } else {
                price1 = ((50 * 45) / 11) * mile / 100;
                price2 = ((50 * 45) / 5) * mile / 100;
            }

        }

        System.out.println("Your price: normal price: " + price1);
        System.out.println("Your price: urgent price: " + price2);
    }
}
