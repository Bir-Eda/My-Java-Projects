package twelveinterfacepackage;

public class RetailStore {
    private String listOfProduct;
    private static int totalQuantities;
    private int quantity;

    public RetailStore(String listOfProduct, int inventoryQuantity) {
        this.listOfProduct = listOfProduct;
        this.quantity = inventoryQuantity;
        totalQuantities+=this.quantity;
    }
   public void receive(int quant){
        this.quantity+=quant;
        totalQuantities+=quant;
    }
    public void sell(int quant){
        this.quantity-=quant;
        totalQuantities-= quant;
    }

    public void showQuantity(){
        System.out.println(this.quantity+"= "+this.quantity);

    }
    public static void showTotalQuantity(){
        System.out.println("total quantity="+totalQuantities);
    }

}
