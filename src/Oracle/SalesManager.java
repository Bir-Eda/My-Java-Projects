package Oracle;

import java.util.List;

public class SalesManager {
    public static void getManagerPrice(List<ForSale> itemsForSale) {
        for (ForSale forSale:itemsForSale) {
            if (forSale instanceof Car) {
                System.out.println(forSale.getStickerPrice() * 0.75);
            } else if (forSale instanceof Part) {
                System.out.println(forSale.getStickerPrice() * 0.80);
            } else if (forSale instanceof Truck) {
                System.out.println(forSale.getStickerPrice() * 0.60);
            }
        }
    }


//    public static void getManagerPrice(List<ForSale> itemsForSale) {
//        for (ForSale forSale:itemsForSale) {
//            System.out.println(forSale.getStickerPrice() * 0.75);
//        }
//    }

//    public static void getManagerPrice(ForSale forSale) {
//        System.out.println(forSale.getStickerPrice() * 0.75);
//    }

//    public static void getManagerPrice(Vehicle vehicle) {
//        System.out.println(vehicle.getStickerPrice() * 0.75);
//    }
//
//    public static void getManagerPriceForCar(Car car) {
//        System.out.println(car.getStickerPrice() * 0.75);
//    }
//
//    public static void getManagerPriceForPart(Part part) {
//        System.out.println(part.getStickerPrice() * 0.75);
//    }
//
//    public static void getManagerPriceForTruck(Truck truck) {
//        System.out.println(truck.getStickerPrice() * 0.75);
//    }

}
