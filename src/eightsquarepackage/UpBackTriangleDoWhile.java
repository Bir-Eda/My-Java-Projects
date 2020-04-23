package eightsquarepackage;

public class UpBackTriangleDoWhile {
    public static void main(String[] args) {

        for (int l = 20; l > 0; l--) {
            for (int i = 0; i < (20 - l); i++) {
                System.out.print("  ");
            }
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    }
