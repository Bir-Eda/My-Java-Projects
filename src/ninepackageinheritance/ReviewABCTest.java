package ninepackageinheritance;

public class ReviewABCTest {
    public static void main(String[] args) {
        ReviewA ob1=new ReviewA();
        System.out.println(ob1.getA());
        ReviewB ob2 = new ReviewB();
        System.out.println(ob2.getA());
        ReviewC ob3 =new ReviewC();
        System.out.println(ob3.getA());
        ob3.setA(83);
        ob2.setA(45);
        System.out.println(ob1.getA());
        System.out.println(ob2.getA());
        System.out.println(ob3.getA());
    }
}
