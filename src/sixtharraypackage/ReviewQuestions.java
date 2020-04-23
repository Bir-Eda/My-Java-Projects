package sixtharraypackage;

import java.util.Scanner;

public class ReviewQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your ID as 5 number :");
        int id = scan.nextInt();
        int num = 12345;
        if (id == num) {
            System.out.println("Perfect");
        } else {
            System.out.println("Please enter valid id");
        }
        // boolean ID=true;
        // if(ID){
        // System.out.println("enter building");
        //}else{
        //System.out.println("No");
        String ID="Yes";
        if(ID.equalsIgnoreCase("Yes")){
            System.out.println("You can pass");
        }else{
            System.out.println("You can not Pass");
        }
    }
}
