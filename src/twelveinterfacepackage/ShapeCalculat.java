package twelveinterfacepackage;

public class ShapeCalculat {

    public static void calculatePerimeter(int edge1, int edge2, int edge3){
        System.out.println("perimeter of triangle :"+(edge1+edge2+edge3));
    }
    public static void calculatePerimeter(int edge){
        System.out.println("Perimeter of the square :"+4*edge);
    }
    public static void calculatePerimeter(double radius){
        System.out.println("Perimeter of the rectangle :"+(2*22/7*radius));

    }
    public void calculateArea(int a, int b){
        System.out.println("Area of the rectangle :"+(a*a));

    }
    public void calculateArea(int edge ){
        System.out.println("Area of the square :"+(edge*edge));

    }
    public void calculateArea(double radius){
        System.out.println("Area of the circle :"+(2*22/7*radius*radius));

}
}