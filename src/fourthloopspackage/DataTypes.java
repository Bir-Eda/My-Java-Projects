package fourthloopspackage;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Are you learning Java (y/n)");
        String answer = myScan.next();
        while(!answer.equalsIgnoreCase("y")){
            answer="";
            System.out.println("you need to study");
            answer =myScan.next();
        }
        System.out.println("you are doing well");

    }

}
