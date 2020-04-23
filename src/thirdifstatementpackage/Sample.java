package thirdifstatementpackage;

import java.util.Scanner;

public class Sample {
    public static void main(String[]args) {
        Scanner score = new Scanner (System.in);
        System.out.println("Please enter your grade 0-100");
        double num=score.nextDouble();
        num/=10;
        switch((int) num){
            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
