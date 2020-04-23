package tenpolymorphismpackage;

public class Review {
    private static int a;
    private int b;
    private int c;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Review.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
