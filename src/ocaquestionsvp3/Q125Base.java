package ocaquestionsvp3;

public class Q125Base {
    public void test(){
        System.out.println("Base ");
    }

} class A extends Q125Base {
    public void test(){
        System.out.println("DerivedA");
    }

}
 class B extends A {
     public void test() {
         System.out.println("DerivedB");
     }
         public static void main(String[] args) {

             Q125Base b1 = new B();  // Derived B

             Q125Base b2 = new A();   // Derived A

             Q125Base b3 = new B();   // Derived B

             Q125Base b4 = b3;


             b1 = (Q125Base) b2;  // b1 artik b2 oldu

             b1.test();
             b4.test();




         }

     }
