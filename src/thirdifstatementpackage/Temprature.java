package thirdifstatementpackage;

import java.util.Scanner;

public class Temprature {
    public static void main(String[]args){
        Scanner temprature = new Scanner (System.in);
        System.out.println("Give me temprature");
        int number1 = temprature.nextInt();
        if(number1> 30){
            System.out.println("wear your hat");
        }
        else{
            System.out.println("wear your jacket");

        }
    }
}
