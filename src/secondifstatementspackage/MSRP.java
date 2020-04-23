package secondifstatementspackage;

import java.util.Scanner;

public class MSRP {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("How much driver discount?");
        double driverDiscount=scan.nextDouble();
        System.out.println("How much MSRP?");
        int MSRP=scan.nextInt();
        System.out.println("How many month?");
        int months=scan.nextInt();
        System.out.println("Down payment");
        int downPayment=scan.nextInt();
        int totalMonth=0;
        double mothlyPayment=(MSRP*driverDiscount)-downPayment/months;
        System.out.printf("Toal payment is $, %%%.2f and monthly payment is %.2f for %d", MSRP, driverDiscount, downPayment,months);

    }
}
