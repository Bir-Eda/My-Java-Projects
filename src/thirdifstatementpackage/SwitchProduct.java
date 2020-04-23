package thirdifstatementpackage;

import java.util.Scanner;

public class SwitchProduct {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please Enter a Month number:");
        int month = myScan.nextInt();
        String x ="";
        switch (month) {
            case 1:
                x="Jacket";
                break;

            case 2:
                x="Mont";
                break;
            case 3:
                x="Kaban";
                break;
            case 4:
                x="Sweter";
                break;
            case 5:

                x="Pant";
                break;
            case 6:
                x="boat";
                break;
            case 7:
                x="Skirt";
                break;

            case 8:
                x="tshirt";
                break;
            case 9:
                x="shooes";
                break;
            case 10:
                x="seatshirt";
                break;
            case 11:
                x="cardigan";
                break;
            case 12:
                x="scarve";
                break;
            default:
                System.out.println("Invalid NUmber");
        }
        System.out.println(x);
    }
}
