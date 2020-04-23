package ninepackageinheritance;

public class DesignPaintTest {
    public static void main(String[] args) {
        DesignPaintParent myPaint= new DesignPaintParent("zero gravity", 2800, 32.99);
        System.out.println(myPaint.toString());
        System.out.println(myPaint.calculatePrice());
        DesignCustomPaintChild myPaint2= new DesignCustomPaintChild("Moon blue", 3200, 10, "Extra glossy","extra" );
        System.out.println(myPaint2.calculatePrice());
    }
}
