package tenpolymorphismpackage;

public class BTest {
    public static void main(String[] args) {
        A myA =new A();
        A myC=new B();
        B myB= new B();
        myA.printMessage();
        myB.printMessage();
        myC.printMessage();
    }
}
