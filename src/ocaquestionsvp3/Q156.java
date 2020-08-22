package ocaquestionsvp3;

public class Q156 {
    public void test(){
        System.out.println("A");
    }

}
class BB extends Q156{
public void test(){
        System.out.println("B");
        }
 }
 class CC extends BB {
     public void test() {
         System.out.println("C");
     }


     public static void main(String[] args) {
        Q156 b1=new Q156();
        Q156 b2=new Q156();
        b1=(Q156) b2;
        Q156 b3=(BB) b2;
        b1.test();
        b3.test();
     }
 }