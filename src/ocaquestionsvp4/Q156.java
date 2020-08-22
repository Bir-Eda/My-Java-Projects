package ocaquestionsvp4;

public class Q156 {
    public void test(){
        System.out.println("A");
    }
}
class B extends Q156{
    public void test(){
        System.out.println("B");
    }
}
class C extends Q156 {
    public void test(){
        System.out.println("C");
    }

    public static void main(String[] args) {

        Q156 b1=new Q156();
         Q156 b2=new C();

         b1 =(Q156) b2;
         Q156 b3=(B) b2;  // B ile C classlari kardes, parent child degil
         b1.test();
         b2.test();

    }
}

