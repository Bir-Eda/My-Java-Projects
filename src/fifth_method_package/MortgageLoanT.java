package fifth_method_package;

public class MortgageLoanT {
    public static int calculateMortgageLoan(int monthly, int monthNumber){
        int totalAmount=35000;
        int restPayment=totalAmount-monthly*monthNumber;
        return restPayment;
    }

    public static void main(String[] args){
        System.out.println(calculateMortgageLoan(400, 18));
    }
}
