package twelveinterfacepackage;

public class RetailStoreArrayTest {
    public static void main(String[] args) {
        String []products={"Bread", "Ice Cream", "pasta"};
        int [] quantities={90, 45, 68};
        RetailStoreArray myPrd= new RetailStoreArray(products,quantities);
        myPrd.showAll();
        myPrd.addQuantity(0,3);
        myPrd.showAll();
        myPrd.addQuantity(2,3);
        myPrd.showAll();
        myPrd.showQuantityOfProduct(2);
        myPrd.showQuantityOfProduct("Bread");
        myPrd.showQuantityOfProduct("Pasta");
        myPrd.showQuantityOfProduct("Ice Cream");
    }
}
