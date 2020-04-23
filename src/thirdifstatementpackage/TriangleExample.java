package thirdifstatementpackage;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String []args){
        Scanner myTriangle = new Scanner(System.in);
        System.out.println("Give me numbers");
        System.out.print("A : ");
        int A = myTriangle.nextInt();
        System.out.print("B : ");
        int B = myTriangle.nextInt();
        System.out.print("C : ");
        int C = myTriangle.nextInt();
        if((A+B>C && A+C>B && B+C>A )){
            System.out.println("Form is a triangle");

        }
        else{
            System.out.println("Form is a not triangle");
        }
    }
}
