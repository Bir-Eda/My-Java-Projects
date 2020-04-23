package secondifstatementspackage;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("How much money do you have? ");
        double pocket = money.nextInt();
        if (pocket > 90 && pocket < 120) {
            System.out.println("You should go to the cinema");

        }


        if (pocket < 90 && pocket > 50) {

            System.out.println("You can go to the restaurant");
        }
        System.out.println("-------------------");
        byte no1 = 10;
        short no2 = no1;
        int no3 = 15;
        long no4 = no3;
        float no5 = no4;
        double no6 = no4;
        System.out.println("Byte:"+no1 + "," + "Short:" + no2+ "," + "Int:" + no3 + "," + "Long: "+ no4);




    }
}
