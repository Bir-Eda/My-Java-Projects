package sevencreating_classes;

public class BankAccount {
    String customerName;
    double balanceAmmount;
    int accountNumber;

    BankAccount(String name, double amount, int number) {
        customerName = name;
        balanceAmmount = amount;
        accountNumber = number;

    }
    void checkbalance(){
        System.out.println("Your balance is "+ balanceAmmount);
    }
    void addmoney(){
           balanceAmmount+=10; //System.out.println("Your added "+ (balanceAmmount+10));
    }
    void addmoney(double amount){
            balanceAmmount+= amount;    //System.out.println("Your balance is "+ (balanceAmmount+money));
    }
    void drawmoney(){
          balanceAmmount-=10;      //System.out.println("Your balance is "+ (balanceAmmount-10));
    }
    void drawmoney(double amount) {
        if (amount > balanceAmmount) {
            System.out.println("Not enough balance");
        }
        //System.out.println("Your balance is "+ (balanceAmmount-money));
        else {
            balanceAmmount -= amount;

        }

    }
}