package interview_questions;

import java.util.Random;
import java.util.Scanner;

public class Generate_Random_Number {
    public static void main(String[] args) {
        Random rand=new Random();
        int random=rand.nextInt(1000);
       // System.out.println(random);
        System.out.println("-------------");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        System.out.println("Generated number is : "+generate(n));


    }
    // Aproach1 = Random
    public static int generate(int num){
        Random rand=new Random();
        int genNumber=rand.nextInt(num);
        return genNumber;
    }
    // Aproach2 = Math


}
