package newquestion1;


class Product{
    double price;
}
public class q7Test {
    public void updatePrice(Product product, double price){
        price=price*2;
        product.price=product.price+price;
    }

    public static void main(String[] args) {
      Product prt=new Product();
      prt.price=200;
      double newPrice=100;
      q7Test t=new q7Test();
      t.updatePrice(prt, newPrice);
        System.out.println(prt.price+":"+newPrice);
    }

}
