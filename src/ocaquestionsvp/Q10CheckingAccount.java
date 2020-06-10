package ocaquestionsvp;

public class Q10CheckingAccount {
    public int amount;
    public Q10CheckingAccount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public void changeAmount(int x){
        amount+=x;
    }

    public static void main(String[] args) {
        Q10CheckingAccount acc=new Q10CheckingAccount((int)(Math.random()*1000));
//        acc.amount=0;
//        acc.changeAmount(-acc.amount);
//        acc.getAmount();

       // acc.setAmount(int 0);

        System.out.println(acc.getAmount());
    }
}
