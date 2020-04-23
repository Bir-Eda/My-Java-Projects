package tenpolymorphismpackage;

public class BankClassTest {
    public static void main(String[] args) {
        BankClass myBank=new BankClass(12345, "saving", 480);
        System.out.println(myBank);
        BankLoanClass myLoan = new BankLoanClass(123, "new Loan", 1200, 1.5, 80,20000);
        System.out.println(myLoan);
        BankCarLoanClass myCar=new BankCarLoanClass(12345, "New Car", 24000,1.2, 500, 30000, 800, 12);
        //HomeLoan myHomeLoan=new HomeLoan(111, "Car", 3000, 1.08, 85, 35000,500, 750, 250 );
        System.out.println(myCar.monthlyPayment());



    }
}
