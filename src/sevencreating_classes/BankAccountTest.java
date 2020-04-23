package sevencreating_classes;

public class BankAccountTest {
    public static void main(String[] args) {

    BankAccount myAcc = new BankAccount("Nina", 2000.78, 19837);
    myAcc.checkbalance();
    myAcc.addmoney(837645);
    myAcc.checkbalance();
    myAcc.drawmoney(28763);
    myAcc.checkbalance();
    myAcc.drawmoney(287766);
    myAcc.checkbalance();

    }
}


