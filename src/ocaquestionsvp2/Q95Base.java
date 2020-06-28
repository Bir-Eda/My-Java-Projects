package ocaquestionsvp2;

public class Q95Base {
    public void test() {
        System.out.println("Base");

    }
}
class DerivedA extends Q95Base{
        public void test(){
            System.out.println("Derived A");
        }
}
class DerivedB extends DerivedA {
    public void test() {
        System.out.println("DerivedB");
    }


    public static void main(String[] args) {
        Q95Base b1 = new DerivedB();
        Q95Base b2 = new Q95Base();

        Q95Base b3 = new DerivedB();

        Q95Base b4 =  (DerivedA) b3;
       // Q95Base b5= (DerivedB)b2;
        b4.test();
       // b2.test();







//        b3 =  b2;
//        Q95Base b4 =  b3;
//       Q95Base b5= (DerivedB) b2;

       // b1.test();
//        b4.test();
//        b2.test();
//        b3.test();
   //        b5.test();

    }

}