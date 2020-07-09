package ocaquestionsvp3;

public interface Q129_I {
    public void displayI();
}
abstract class C2 implements Q129_I{
    public void displayC2(){
        System.out.println("C2");
    }

}
class C1 extends C2{
    public void displayI(){
        System.out.println("C1");
    }

    public static void main(String[] args) {
        C2 obj1=new C1();
        Q129_I obj2=new C1();
        C2 s=(C2) obj2; // obj2 yi C@ ye casting yapti
        Q129_I t=obj1;
        t.displayI();
        s.displayC2();

        }
    }

