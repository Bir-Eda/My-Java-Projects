package sevencreating_classes;

public class DesignElectricBillTest {
    public static void main(String[] args) {
        DesignElectricBill myBill= new DesignElectricBill(1234,0, "Eda",750);
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        myBill.displayBill();
        myBill.addConsumption(33);
        myBill.readCounter();

    }
}
