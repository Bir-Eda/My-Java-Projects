package twelveinterfacepackage;

public abstract class RectangularShape implements Shape {
    private int width;
    private int height;
    double area;

    public RectangularShape(int width, int height, double area) {
        this.width = width;
        this.height = height;
        this.area = area;
    }
}
