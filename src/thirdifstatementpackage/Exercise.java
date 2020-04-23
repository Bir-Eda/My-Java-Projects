package thirdifstatementpackage;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell me your age :");
        int age=scan.nextInt();
        if(age<0){
            System.out.println("can not be negative");

        }else if(age>120){
            System.out.println("Can not be larger");
        }else{
            System.out.println("It is ok");
        }

    }
}
