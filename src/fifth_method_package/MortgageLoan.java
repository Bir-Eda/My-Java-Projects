package fifth_method_package;

public class MortgageLoan {
    public static int restPayment(int monthly, int paymentNumber){
        int totalMonths= 72;
        return(totalMonths-paymentNumber)*monthly;
    }

    public static void main(String[] args) {
        System.out.println(restPayment(1500, 45));
        System.out.println(housePayment(2300,15));
    }

    public static int housePayment(int monthly, int paymentNumber){

        int totalAmount= (int) 350.000;
        int restPayment=totalAmount-monthly*paymentNumber;
        return(restPayment);
    }


    /*public static int housePayment(int price, int monthly, int payment) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much is house price? :");

        System.out.println("How many months will you pay? :");

        System.out.println("How much money will you pay per month? :");
        double mayment = scan.nextDouble();
        int insurance;

        double payment=scan.nextDouble();

        return payment;
    }
    public static void main(String[] args) {
        int insurance= CarLoan.carPayment((int) 30.000, 30, 1500);
        System.out.println(housePayment(payment);
    }*/

}

