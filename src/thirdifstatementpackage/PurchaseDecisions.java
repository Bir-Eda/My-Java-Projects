package thirdifstatementpackage;

import java.util.Scanner;

public class PurchaseDecisions {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the tag price and Discount percentage :");
        double price = myScanner.nextDouble();
        double percentage = myScanner.nextDouble();
        int c= 0;
        System.out.println(" What is item`s color: ");

        String color = myScanner.next();

        if (color.compareToIgnoreCase("red") == 0) {
            c = 20;
        }
        else if (color.compareToIgnoreCase("blue") == 0){
            c = 10;
        }
        else {
            System.out.println ("Please enter only red or blue");
        }
        double point = (price * 0.01* percentage)-c;
        System.out.println(point);
        if (point>=100){
            System.out.println("Do not buy it!");
        }
        else if (point > 50 && point <99){
            System.out.println ("Buy later");
        }
        else if (point <= 50){
            System.out.println ("Buy it!");


        }

    }
}
