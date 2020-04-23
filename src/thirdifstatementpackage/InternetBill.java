package thirdifstatementpackage;

import java.util.Scanner;

public class InternetBill {
    public static void main(String[] args) {
        System.out.println("Did you subscribe or not?");
        Scanner myScan = new Scanner(System.in);

        String member = myScan.nextLine();

        if (member.equalsIgnoreCase("Yes")) {
            // ask usage
            System.out.println("Enter usage :");
            int usage = myScan.nextInt();
            if (usage < 100) {
                System.out.println("10");
            } else {
                System.out.println("40");
            }
        } else {
            System.out.println("Please subscribe");
        }
    }
}
