package ninepackageinheritance;

public class AdditionPrivate {

    private static int additionPrivateStatic(int a, int b){ // current class
        return a+b;
    }
    {
        AdditionPrivate.additionPrivateStatic(23, 2);
    }
    public static int additionPublicStatic(int a, int b){ // current class and all classes inside project
        return a+b;
    }
    private int additionPrivate(int a, int b){ // current class this.
        return a+b;
    }
    {
        this.additionPrivate(3,7);
    }
    public int additionPublic(int a, int b){ // current class and all classes insede project
        return a+b;
    }
// first two method access with method name because they are static
    // last two method access with object because they are non-static
}
