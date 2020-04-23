package eightsquarepackage;

public class PyramidTriangleForT {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {

            // for loop for the spaces
            for (int  j= 1;  j<10-i; j++) {
                System.out.print(" ");
            }

            //for loop for stars
            for (int k =0; k <10; k++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
