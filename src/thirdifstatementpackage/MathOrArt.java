package thirdifstatementpackage;

import java.util.Scanner;

public class MathOrArt {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Math or Art? :");
        String choose = myScan.next();
        if(choose.equalsIgnoreCase("math")) {

            System.out.println("Tutor y/n :");
            String teacher = myScan.next();
            if (teacher.equalsIgnoreCase("y")) {
                System.out.println("OK");
            } else if (teacher.equalsIgnoreCase("n")) {
                System.out.println("Study yourself");
            }
        }
        else if (choose.equalsIgnoreCase("art")){

            System.out.println("Nice Choise");

        }
    }
}
