package tenpolymorphismpackage;

public class BankLoanClass extends BankClass{
    double interestRate;
    int numberOfPayment;
    double loanAmount;

    public BankLoanClass(int accountNumber, String accountName, double balance, double interestRate, int numberOfPayment, double loanAmount) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
        this.numberOfPayment = numberOfPayment;
        this.loanAmount = loanAmount;
    }
    double monthlyPayment(){
       double monthlyPayment=this.loanAmount*this.interestRate/numberOfPayment;
        return monthlyPayment;
    }
    double calculateTotalPayment(){
        double paymentTotal=this.loanAmount*this.interestRate;
        return paymentTotal;
    }

}

