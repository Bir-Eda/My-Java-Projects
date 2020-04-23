package thirdifstatementpackage;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[]args){
        System.out.println("How many kw did you use?");
        Scanner electric =new Scanner(System.in);
        double usage = electric.nextDouble();
        double bill;
        if( usage < 500){
            bill = usage * 0.3;
            System.out.println("Your bill :" + bill );

        }
        else if (usage >= 500 && usage <1000){
            bill = (( 500*0.3)+(usage - 500)*0.4);
            System.out.println("Your bill :" + bill);
        }

        else if (usage >= 1000 && usage <2000){
            bill = ( (500*0.3) + (500*0.4)+ ((usage-1000)*0.5));

            System.out.println("Your bill :" + bill);
        }
        else {
            bill = ( (500*0.3) + (500*0.4) + (1000*0.5) + ((usage-2000)*0.6));
            System.out.println("Your bill:" + bill);


        }
    }
}
