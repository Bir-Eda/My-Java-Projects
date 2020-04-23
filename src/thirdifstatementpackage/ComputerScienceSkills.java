package thirdifstatementpackage;

import java.util.Scanner;

public class ComputerScienceSkills {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("What is your program (Java/SQL/Cloud");
        String program = myScan.nextLine();
        // you can write program or answer

        if (program.equalsIgnoreCase("Java")) {
            System.out.println("What is your java score? :");
            int javaScore = myScan.nextInt();
            if (javaScore >= 80) {
                System.out.println("Nice Job");
            } else {
                System.out.println("You can do it");
            }

        } else if (program.equalsIgnoreCase("SQL")) {
            System.out.println("What is your Hackerrenk score? :");
            int hackerrenkScore = myScan.nextInt();
            if (hackerrenkScore < 500) {
                System.out.println("Nice Job");
            } else {
                System.out.println("Perfect");
            }
        }
        else if(program.equalsIgnoreCase("Cloud")){
            System.out.println("Do you have certificate?(Y/N) :");
            String certificate = myScan.next();
            if(certificate.equalsIgnoreCase("Y")){
                System.out.println("Huge plus");
            }
            else if(certificate.equalsIgnoreCase("N")){
                System.out.println("You sould get one");
            }
            else{
                System.out.println("Only Y or N");
            }
        }


    }
}
