package tenpolymorphismpackage;

public class BankCarLoanClass extends BankLoanClass {
     int APR;
     int creditScore;

    public BankCarLoanClass(int accountNumber, String accountName, double balance, double interestRate, int numberOfPayment, double loanAmount, int APR, int creditScore) {
        super(accountNumber, accountName, balance, interestRate, numberOfPayment, loanAmount);
        this.APR = APR;
        this.creditScore = creditScore;

    }
    public void monthlyPaymentP(){
        double monthlyPayment=super.loanAmount*this.APR/super.numberOfPayment-(this.creditScore/10);

    }


}

