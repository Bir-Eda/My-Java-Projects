package twelveinterfacepackage;

public class ShapesTest {
    public static void main(String[] args) {
        Polygon plgn=new Polygon();
        plgn.calculatePerimeter(10);
        Triangle trg=new Triangle();
        trg.calculatePerimeter(20);
        Square sqr=new Square();
        sqr.calculatePerimeter(10);
    }
}
