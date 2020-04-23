package secondifstatementspackage;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[]args){
        System.out.println("What is the radius?");
        Scanner x = new Scanner(System.in);
        double radius = x.nextDouble();

        double perimeter = 2*3.14*radius;

        System.out.println("The perimeter of this circle :" + perimeter);


    }
}
