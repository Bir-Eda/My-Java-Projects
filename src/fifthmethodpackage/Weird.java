package fifthmethodpackage;

import java.util.Scanner;

public class Weird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println(n + "weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("weird");
        } else {
            System.out.println(n + "not weird");
        }
    }
}
