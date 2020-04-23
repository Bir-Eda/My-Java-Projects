package thirdifstatementpackage;

import java.util.Scanner;

public class JobApplicantScore {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Tell your age");
        int age= scan.nextInt();
        System.out.println("tell your java point");
        double point=scan.nextDouble();
        double score;

        if (age >=20 && age<=30 && point>=80){
            score = ((age * 1.5) + (point * 4.5));
            System.out.println("Your score is ;"+score);

        }
        else if(age > 20 && age < 30 && point <=80) {
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
