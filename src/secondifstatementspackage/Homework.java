package secondifstatementspackage;

import java.util.Scanner;

public class Homework {
    public static void main(String[]args) {
        Scanner product = new Scanner(System.in);
        System.out.print("Please enter product id : ");
        int id1 = product.nextInt();
        System.out.print("Please enter product quantity : ");
        int quantity1 = product.nextInt();

        if (id1 == 125) ;
        double price1 = quantity1 * 2.49f;
        if (id1 == 126) ;
        price1 = quantity1 * 4.79f;
        if (id1 == 127) ;
        price1 = quantity1 * 1.65f;

        System.out.print("Please enter product id : ");
        int id2 = product.nextInt();
        System.out.print("Please enter product quantity : ");
        int quantity2 = product.nextInt();

        if (id2 == 125) ;
        double price2 = quantity2 * 2.49f;
        if (id2 == 126) ;
        price2 = quantity2 * 4.79f;
        if (id2 == 127) ;
        price2 = quantity2 * 1.65f;

        System.out.print("Please enter product id : ");
        int id3 = product.nextInt();
        System.out.print("Please enter product quantity : ");
        int quantity3 = product.nextInt();


        if (id3 == 125) ;
        double price3 = quantity3 * 2.49f;
        if (id3 == 126) ;
        price3 = quantity3 * 4.79f;
        if (id3 == 127) {
            ;
        }
        price3 = quantity3 * 1.65f;

        double total = price1+price2+price3;
        int totalQuantity = quantity1 + quantity2 + quantity3;


        System.out.println("  Item id" + "         quantity" + "       price");
        System.out.println("---------------------------------------------------");
        System.out.format("\t %d \t\t\t %d \t\t\t $%.2f\n", id1,quantity1, price1);
        System.out.format("\t %d \t\t\t %d \t\t\t $%.2f\n",  id2,quantity2, price2);
        System.out.format("\t %d \t\t\t %d \t\t\t $%.2f\n",  id3,quantity3, price3);
        System.out.format("Total: \t\t\t\t %d \t\t\t $%.2f \t\t\t\t\t", totalQuantity, total);

    }
}



