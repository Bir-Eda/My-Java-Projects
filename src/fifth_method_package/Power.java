package fifth_method_package;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan =new  Scanner(System.in);
        System.out.println("Enter base number");
        int base=scan.nextInt();
        System.out.println("Enter power number");
        int power=scan.nextInt();
        System.out.println(Math.pow(base,power));

    }
}
