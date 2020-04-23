package twelveinterfacepackage;

public class RetailStoreTest {
    public static void main(String[] args) {

        RetailStore store1 = new RetailStore("lazanya", 150);
        RetailStore store2 = new RetailStore("M&M", 500);
        store1.showQuantity();
        store2.showQuantity();
        RetailStore.showTotalQuantity();
        store1.receive(250);
        store2.receive(500);
        store1.showQuantity();
        store2.showQuantity();
        RetailStore.showTotalQuantity();

    }
}
