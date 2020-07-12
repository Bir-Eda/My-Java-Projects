package ocaquestionsvp2;

public class Q97 {
    private double length;
    private double height;
    private double area;

    public void setLength(double length) {
        this.length = length;
        setArea();
    }

    public void setHeight(double height) {
        this.length = height;
        setArea();
    }

    public void setArea() {
        this.length = area;
    }

    public static void main(String[] args) {
        Q97 obj=new Q97();
        obj.setArea();
    }
}