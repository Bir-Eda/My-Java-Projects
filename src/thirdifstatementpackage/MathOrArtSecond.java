package thirdifstatementpackage;

import java.util.Scanner;

public class MathOrArtSecond {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Math or Art");
        String coise = myScan.next();
        if (coise.equalsIgnoreCase("math")) {
            System.out.println("Tutor (y/n) :");
            String tutor = myScan.next();

        }
    }
}
