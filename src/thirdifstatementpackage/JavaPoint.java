package thirdifstatementpackage;

import java.util.Scanner;

public class JavaPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? :");
        int age = scanner.nextInt();
        System.out.println("What is your java point? :");
        double point = scanner.nextDouble();
        double score;
        if (age >= 20 && age <= 30 && point >= 80) {
            score = ((age * 1.5) + (point * 4.5));
            System.out.println("Your applicant score:" + score);
        }
        else if (age > 20 && age < 30 && point <=80) {
            score = ((age * 1.5) + (point * 3.5));
            System.out.println("Your applicant score:" + score);
        }
        else if (age > 31 && point > 80) {
            score = ((age * 1.1) + (point * 4.5));
            System.out.println("Your applicant score:" + score);
        }
        else if(age > 31 && point <=80) {
            score = ((age * 1.1) + (point * 3.5));
            System.out.println("Your applicant score:" + score);

        }

    }
}
