package ocaquestionsvp3;

public class Q127 {
    public int amount;

    public Q127() {
       this.amount = 100; // burdaki amount class  Q127 deki amount
        // this olmayinca int amount a refer eder
    }
    
    public static void main(String[] args) {
        Q127 acct = new Q127();
        acct.amount=100;
       // acct.amount = 100;
        System.out.println(acct);

    }
}
