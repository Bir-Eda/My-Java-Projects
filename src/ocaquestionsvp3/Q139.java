package ocaquestionsvp3;

public class Q139 {
    double price;
}
class Test{
    public void updatePrice(Q139 product, double price){
        price=price*2;
        product.price=product.price+price;
    }

    public static void main(String[] args) {
        Q139 prt=new Q139();
        prt.price=200;
        double newPrice=100;
        Test t=new Test();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price+":"+newPrice);

        // 400.0 :  100.0
    }
}
