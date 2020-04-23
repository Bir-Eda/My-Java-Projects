package secondifstatementspackage;

import java.util.Scanner;

public class TempratureIf {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("How is temparature");
        int temp = input.nextInt();
        if(temp<=30){
            System.out.println("Wear jacket");
        }else if
        (temp > 30) {
            System.out.println("Wear hat");
        }
        else{
            System.out.println("Please enter a valid temparature");

        }
    }
}
