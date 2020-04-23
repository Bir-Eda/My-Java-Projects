package fifthmethodpackage;

public class PyramidDisplay {
    public static void pyramid(int numberOfLines) {
        for (int i = 1; i <numberOfLines; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(10);
        pyramid(18);
        pyramid(6);
    }

}
