package ocaquestionsvp;

public class Q10CheckingAccount {
    public int amount;
    public Q10CheckingAccount(int amount){
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int x){
        amount+=x;
    }

    public static void main(String[] args) {
        Q10CheckingAccount acc=new Q10CheckingAccount((int)(Math.random()*1000));
        // random olmasi balansin herhangi bir sayi olabilecegini gostermek icindir

         acc.amount=0;      //1. option
         acc.setAmount(0);  // 2.option    acc.setAmount(int 0); // amountin 0 olmasi balancin 0 olmasi demektir
         acc.changeAmount(-acc.amount);

        System.out.println(acc.getAmount());
    }
}
