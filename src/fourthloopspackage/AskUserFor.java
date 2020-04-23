package fourthloopspackage;

import java.util.Scanner;

public class AskUserFor {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("enter starting point :");
        int start = myScan.nextInt();
        System.out.print("enter end point :");
        int end = myScan.nextInt();
        System.out.print("What you want print :");
        String print = myScan.next();

        for(int i=start; i<end; i++ ){
            System.out.println(print);
        }
    }
}
