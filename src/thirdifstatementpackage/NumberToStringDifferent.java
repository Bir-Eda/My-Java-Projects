package thirdifstatementpackage;

import java.util.Scanner;

public class NumberToStringDifferent {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Do you need Model? (X or Y)");
        String model = myScan.next();
        int MSRP = 0;
        if (model.equalsIgnoreCase(("X"))) {
            MSRP = 30000;
            System.out.println("Do you want body package? :(Y/N");
            String body = myScan.next();
            if (body.equalsIgnoreCase("y")) {
                MSRP = MSRP + 5000;
            }
            System.out.println("Your total is " + MSRP);
        } else if (model.equals("Y")) {
            MSRP = 35000;
            System.out.println("Do you want to sound system? (Y/N)");
            String sound = myScan.next();
            if (sound.equalsIgnoreCase("y")) {
                MSRP += 8000;
                System.out.println(("Safety package : (Y/N"));
                String safety =myScan.next();
                if(safety.equalsIgnoreCase("y"));
                MSRP += 4000;
            }
        } else if (model.equalsIgnoreCase("Y")) {
            MSRP = 35000;
            System.out.println("Do you want ent. package: (Y/N");
            String ent = myScan.next();
            if(ent.equalsIgnoreCase("y")){

            }
        } else {
            System.out.println("Sorry have only X and Y");

        }
        if(MSRP!=0){
            System.out.println("$" +MSRP);
        }

    }
}
