package fourthloopspackage;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        System.out.print("Give me your size (S/M/L: ");
        Scanner myScanner = new Scanner(System.in);
        String size = myScanner.nextLine();
        System.out.print("Member?(Yes/No :");
        String member = myScanner.nextLine();

       /* if (member.equals("N")) {
            System.out.println("$9.99");
        }else{
            System.out.println("We can not Sell");
        }*/
        if (size.equals("S")){
            System.out.println("$9.99:");

        } else if (size.equals("M")) {
            System.out.println("$10.99:");
        }
        else if(size.compareToIgnoreCase("L")==0){
            System.out.println("$11.99:");
        }
        else{
            System.out.println("Sorry only S/M/L");
        }
    }
}
