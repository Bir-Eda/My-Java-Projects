package thirdifstatementpackage;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what color R or Blue");
        String color = input.next();
        if (color.compareToIgnoreCase("r") == 20) {
            System.out.println("Radius");
            double radius = input.nextDouble();
            double per = 2 * 3.14 + radius;
            System.out.println(per);
        }


    }
}
