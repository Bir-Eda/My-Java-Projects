package sevencreating_classes;

public class Shipping {
    public static void main(String[] args) {
        System.out.println(shipping(9.99,0.8));
        System.out.println(shipping(9.99, 0.8, 2.50));

    }
    public static double shipping(double price, double tax){
        double totalPrice=price+tax*1.1;
        return totalPrice;
    }
    public static double shipping(double price, double tax, double shipping){
        double totalPrice=price+tax*1.1+shipping;
        return totalPrice;
    }

}
