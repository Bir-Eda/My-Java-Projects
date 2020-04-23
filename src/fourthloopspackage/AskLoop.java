package fourthloopspackage;

import java.util.Scanner;

public class AskLoop {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Start point");
        int x = myScan.nextInt();
        System.out.println("End point");
        int xx = myScan.nextInt();
        System.out.println("Write a text");
        String a = myScan.next();
        for(int i=x; i<xx; i++){
            System.out.println(a);
        }


    }
}
