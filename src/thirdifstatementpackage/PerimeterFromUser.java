package thirdifstatementpackage;

import java.util.Scanner;

public class PerimeterFromUser {
    public static void main(String[] args) {
        System.out.println("Give me C, R, or T : ");
        Scanner myScanner = new Scanner(System.in);
        String shape = myScanner.nextLine();
        if (shape.compareToIgnoreCase("c") == 0) {
            System.out.println("Tell me raduis :");
            double raduis = myScanner.nextDouble();
            double per = 2 * 3.14 * raduis;
            System.out.println(per);
        } else if (shape.compareToIgnoreCase("r") == 0) {
            System.out.println("Tell me leght and height :");
            double leght = myScanner.nextDouble();
            double height = myScanner.nextDouble();
            double per = 2 * (leght + height);
            System.out.println(per);

        } else if (shape.compareToIgnoreCase("t") == 0) {
            System.out.println("Tell me edges :");
            double edge1 = myScanner.nextDouble();
            double edge2 = myScanner.nextDouble();
            double edge3 = myScanner.nextDouble();
            double per = (edge1 + edge2 + edge3);
            System.out.println(per);
        }
        else {
            System.out.println("Please enter only C, R, or T");
        }
    }
}
