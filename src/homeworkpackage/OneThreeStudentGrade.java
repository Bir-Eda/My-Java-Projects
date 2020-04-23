package homeworkpackage;

import java.util.Scanner;

public class OneThreeStudentGrade {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter your grade :");
        int grade = myScan.nextInt();

        if(grade>=90 && grade<=100){
            System.out.println("Your grade A+");
        }
        else if(grade>=80 && grade <=89){
            System.out.println("Your grade is A");
        }
        else if(grade>=70 && grade <=79) {
            System.out.println("Your grade is B");
        }
        else if(grade>=60 && grade <=69) {
            System.out.println("Your grade is C");
        }
        else if(grade>=50 && grade <=59) {
            System.out.println("Your grade is D");
        }
        else if(grade>=0 && grade <=49){
            System.out.println("Your grade is Fail");
        }
        else{
            System.out.println("Please enter a number between 0-100");
        }
    }
}
