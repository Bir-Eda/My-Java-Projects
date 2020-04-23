package thirteenexceptionpackage;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println(6/1.5); // (6/0) olsaydi run yapinca ArithmeticException cikicakti
        }
        catch(ArithmeticException e){
            System.out.println("Oooo zerooo");
        }
        catch (Exception e) {
            System.out.println("Oooops");
        }
        finally{
            System.out.println("I will run this code what ever it takes");
        }
    }
}
