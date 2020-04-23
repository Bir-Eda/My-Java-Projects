package thirdifstatementpackage;

import java.util.Scanner;

public class IfElseAge {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your age");
        int age = scanner.nextInt();
        if(age < 0){
            System.out.println("Can not be nagatif");


        }
        else if( age >120){
            System.out.println("Can not be larger than 120");
        }
        else{
            System.out.println("Ok");
        }
    }
}
