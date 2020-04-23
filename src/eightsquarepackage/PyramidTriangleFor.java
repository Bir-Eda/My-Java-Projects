package eightsquarepackage;

public class PyramidTriangleFor {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int k = 15; k >= i; k--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
