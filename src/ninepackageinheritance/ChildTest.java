package ninepackageinheritance;

public class ChildTest {
    public static void main(String[] args) {
        Child myChild = new Child(10,20);
        System.out.println(myChild.getX());
        myChild.setX(55);
        System.out.println(myChild.getX());
    }
}
