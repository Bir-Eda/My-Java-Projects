package Oracle;

import java.util.ArrayList;

public class MainOffice {
    public static void main(String[] args) {
        Car camryBlue = new Car(22000.0);
//        SalesManager.getManagerPriceForCar(camryBlue);

        Part engine = new Part(3500);
//        SalesManager.getManagerPriceForPart(engine);
//        SalesManager.getManagerPrice(camryBlue);
//        SalesManager.getManagerPrice(engine);
        ArrayList<ForSale> itemsForSale = new ArrayList<>();
        itemsForSale.add(camryBlue);
        itemsForSale.add(engine);

        SalesManager.getManagerPrice(itemsForSale);


    }
}
