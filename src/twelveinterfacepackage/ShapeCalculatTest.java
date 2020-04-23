package twelveinterfacepackage;

public class ShapeCalculatTest {
    public static void main(String[] args) {
        ShapeCalculat.calculatePerimeter(20);
        ShapeCalculat.calculatePerimeter(10.0);
        ShapeCalculat.calculatePerimeter(10,20,25);
        ShapeCalculat myShp=new ShapeCalculat();
        myShp.calculateArea(23);
        myShp.calculateArea(10, 20);
        myShp.calculateArea(12, 23);
    }
}
