package ninepackageinheritance;

public class AdditionPrivateTest {
    public static void main(String[] args) {
    AdditionPrivate myObj1=new AdditionPrivate();
    AdditionPrivate.additionPublicStatic(12, 34);
    myObj1.additionPublic(5,8);
    AdditionPrivate.additionPublicStatic(3,6);
    }
}
