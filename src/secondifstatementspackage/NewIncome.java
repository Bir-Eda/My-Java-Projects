package secondifstatementspackage;

import java.util.Scanner;

public class NewIncome {
    public static void main(String[] args) {
        System.out.println("What is your income?");
        Scanner x = new Scanner(System.in);
        double income = x.nextDouble();

        System.out.println("What is your rent?");
        int rent = x.nextInt();

        System.out.println("How much is your bills?");
        double bills = x.nextDouble();

        double expense = rent + bills;
        double amount = income - expense;

        double saving = amount * 0.5;

        System.out.println("You shuld save" + " " + " $" + saving);


    }
}
