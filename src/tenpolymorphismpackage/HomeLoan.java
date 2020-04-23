package tenpolymorphismpackage;

public class HomeLoan extends BankCarLoanClass {
    protected int PMI;

    public HomeLoan(int accountNumber, String accountName, double balance, double interestRate, int numberOfPayment, double loanAmount, int APR, int creditScore, int PMI) {
        super(accountNumber, accountName, balance, interestRate, numberOfPayment, loanAmount, APR, creditScore);
        this.PMI = PMI;


    }
    public double monthlyPayment(){
        double result=super.loanAmount*super.interestRate/super.numberOfPayment+this.PMI;
        return result;
    }
    public void totalPayment(){
        double result=super.loanAmount*super.interestRate+this.PMI*super.numberOfPayment;
    }




}



