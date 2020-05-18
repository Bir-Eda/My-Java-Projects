package finalreview;

public class NestedClass {
    public static void main(String[] args) {
        Outer outer= new Outer();
        Outer.Inner inner=outer.new Inner();
    }
}
class Outer {
    void outer() {
        System.out.println("This is Outer Class");
    }

    class Inner {
        void inner() {
            System.out.println("This is Inner Class");
        }
    }
}

