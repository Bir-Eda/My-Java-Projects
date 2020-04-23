package thirdifstatementpackage;

import java.util.Scanner;

public class WearJacketOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temprature:");
        double temprature = scanner.nextDouble();
        if( temprature<= 30){
            System.out.print("Temprature is : " + temprature + "  Wear jacket");
        }
        else{
            System.out.print("Temprature is : " + temprature + " Wear hat");
        }

    }
}
