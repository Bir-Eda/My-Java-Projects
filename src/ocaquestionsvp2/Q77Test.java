package ocaquestionsvp2;

public class Q77Test {
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Q77Test ex=new Q77Test();
        int cardNo=12344;
    //    ex.readCard(cardNo);
        ex.checkCard(cardNo);
    }
}
