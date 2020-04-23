package eightsquarepackage;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int start = myScan.nextInt();
        System.out.println("Please enter the last number");
        int end = myScan.nextInt();

        if (start < end) {
            for (int i = start; i <= end; i = i + 1) {
                if (i % 5 == 0) {

                    System.out.println(i);
                }
            }

        } else {
            for (int i = start; i <= end; i = i --) {
                if (i % 5 == 0) {

                    System.out.println(i);
                }
            }
        }
    }
}
