package fifthmethodpackage;

public class InvoicesElectricBillMeth {
    public static void main(String[] args) {
        System.out.println(electricBill(1200));
    }
    public static String electricBill(int consumption){
        String decision;
        if(consumption>500 && consumption<1000){
            decision="Good job";
        }
        else if(consumption>1000 && consumption<1500){
            decision="Not bad";
        }
        else if(consumption>1500){
            decision="Start save energy";
        }
        else{
            decision="Consumption is wrong";
        }
        return decision;
    }
}
